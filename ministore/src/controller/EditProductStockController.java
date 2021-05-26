package controller;

import java.io.DataOutput;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;
import bean.User;
import dao.ProductDAO;
import util.Util;

@WebServlet("/EditProductStockController")
public class EditProductStockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EditProductStockController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		   HttpSession session = request.getSession();
		   request.setCharacterEncoding("UTF-8");
		   response.setCharacterEncoding("UTF-8");
		     User user = (User) session.getAttribute("user");
		     if(user != null) {
		    	 
		    	 String idProduct = request.getParameter("idProduct");
		    	 System.out.println(idProduct);
		    	 String nameP = request.getParameter("nameProduct");
		    	 double priceP = Double.parseDouble(request.getParameter("priceProduct"));
		    	 double sale = Double.parseDouble(request.getParameter("saleProduct"));
		    	 double VAT = Double.parseDouble(request.getParameter("vatProduct"));
		    	 String typeProduct = request.getParameter("typeProduct");
		    	 String supplier = request.getParameter("supplier");
		    	 System.out.println("ABCD");
		    	 
		    	 Product p = ProductDAO.getProductById(idProduct);
	 ProductDAO.updateProduct(idProduct, nameP, (int) priceP, p.getQuantityInStock(), p.getQuantitySale(), p.getExpiration(), 1, VAT, sale, p.getImage(), supplier, user.getIdStore(), typeProduct, 0);
		    	 
		    	 response.sendRedirect(Util.getFullPath("StockController"));
		    	 
		    	 
		     }else {
		    	 response.sendRedirect(Util.getFullPath("error.jsp"));
		     }
	}

}
