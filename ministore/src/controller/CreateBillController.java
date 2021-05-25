package controller;

import java.io.Console;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;
import bean.User;
import dao.BillDAO;
import dao.ProductDAO;
import dao.UserDAO;
import util.GenerateID;
import util.Util;

@WebServlet("/CreateBillController")
public class CreateBillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CreateBillController() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		
		if(user!= null) {
			String idBill = request.getParameter("idBill");
			String typePayment = request.getParameter("typePayment");
			
			String idPayment = "";
			if(typePayment.equals("cash")) {
				idPayment ="PM0001";
			}else {
				if(typePayment.equals("paypal")) {
					idPayment ="PM0002";
				}
			}
			
			System.out.println(idBill +" "+ typePayment);
			String idUser = UserDAO.getIdUser(user.getEmail());
			String idStore = user.getIdStore();
			Date dateBill = new Date(new java.util.Date().getTime());
			int statusPayment = 1;
			int totalCost = 0;
			ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
			
			for(Product p : cart) {
				totalCost+= (p.getPrice());
			}
		   
			
			BillDAO.insertBill(idBill, dateBill, totalCost, idStore, idUser, idPayment, statusPayment);
			
			// handle update quantitysell
			for(Product p : cart) {
			String id = GenerateID.generateIDBillDetail();
		    BillDAO.insertBillDetail(id, p.getQuantityPurchase(), idBill, p.getIdProduct());
		    ProductDAO.updateProductAfterSale(p.getIdProduct(), p.getQuantityPurchase());
			}
			
			
			
			
			
		}else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
