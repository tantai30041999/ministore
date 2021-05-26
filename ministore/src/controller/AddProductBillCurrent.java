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

import bean.Bill;
import bean.Cart;
import bean.Product;
import bean.User;
import dao.ProductDAO;
import util.Util;


@WebServlet("/AddProductBillCurrent")
public class AddProductBillCurrent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    
    public AddProductBillCurrent() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		User u = (User) session.getAttribute("user");
		  response.setContentType("application/json");
		    response.setCharacterEncoding("UTF8");
	   
		if(u!= null) {
			 ArrayList<Product> list;
			
		     
			    if(session.getAttribute("cart") == null) {
			    	
			    	list = new ArrayList<Product>();
			    	session.setAttribute("cart", list);
			    }else {
			    	 list = (ArrayList<Product>) session.getAttribute("cart");
			    }
			
			
			
			
			 String idProduct = request.getParameter("idProduct");
			 
			
			   
			    Product product = ProductDAO.getProductById(idProduct);
			    product.setQuantityPurchase(1);
			  
			   
			    System.out.println(list.size());
			    if(ProductDAO.checkExist(idProduct, list)) {
			    	session.setAttribute("cart", ProductDAO.increateQuantityPurches(idProduct, list));
			    }else {
			    	list.add(product);
			    }
			    PrintWriter out = response.getWriter();
			  
				 
			    Gson gson = new Gson();
			    String json ="";
			    if(list.size() != 0) {
			    	json = gson.toJson(list);
			    }else {
			    	json = gson.toJson("Null");
			    }
			    out.write(json);
			    out.close();
		}else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
		}
	   
	    
	    
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
