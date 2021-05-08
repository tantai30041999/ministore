package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;
import bean.User;
import dao.ProductDAO;


@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ProductController() {
        super();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   HttpSession session = request.getSession();
	   User  user = (User )session.getAttribute("user");
	   ArrayList<Product> listProduct = (ArrayList<Product>) ProductDAO.getAllProduct();
	   System.out.println(listProduct.size());
	   if(user!= null) {
		   
		   request.setAttribute("listProduct", listProduct);
		   request.getRequestDispatcher("product.jsp").forward(request, response);
	   }else {
		   response.sendRedirect("error.jsp");
	   }
	}

}