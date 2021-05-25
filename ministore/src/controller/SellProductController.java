package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Cart;
import bean.Product;
import bean.User;
import util.Util;


@WebServlet("/SellProductController")
public class SellProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      HttpSession session = request.getSession();
	      User u = (User) session.getAttribute("user");
	      ArrayList<Product> listProductCart ;
	      
	      if(u!= null) {
	    	  listProductCart = new ArrayList<Product>();
	    	  session.setAttribute("cart",listProductCart);
	    	  
	    	  request.getRequestDispatcher("sell.jsp").forward(request, response);
	      }else {
	    	 response.sendRedirect(Util.getFullPath("error.jsp")); 
	      }
	}

}
