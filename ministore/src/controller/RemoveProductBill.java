package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import bean.Product;
import bean.User;
import dao.ProductDAO;
import util.Util;


@WebServlet("/RemoveProductBill")
public class RemoveProductBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RemoveProductBill() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		HttpSession session = request.getSession();
		String status = request.getParameter("statusProduct");
		User u = (User) session.getAttribute("user");
		if(u!= null) {
			if(status!= null) {
			
				
	
					ArrayList<Product> cart = (ArrayList<Product>) session.getAttribute("cart");
					 cart = ProductDAO.deleteProductFromCart(status, cart);
					 session.setAttribute("cart",cart);
					 System.out.println(cart.size()+"xoa r");
					 PrintWriter out = response.getWriter();
					    response.setContentType("application/json");
					    response.setCharacterEncoding("UTF8");
					    Gson gson = new Gson();
					    String json ="";
					    json = gson.toJson(cart);
					    out.write(json);
					    out.close();	
				}
				
			
			  
		}else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request, response);
	}

}
