package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.ProductDAO;
import dao.SupplierDAO;
import dao.UserDAO;
import util.Util;


@WebServlet("/IndexController")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public IndexController() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	   int numberOfSupplier = SupplierDAO.countSupplier();
	   int numberOfStaff = UserDAO.countStaff();
	   int numberOfTypeProduct = ProductDAO.countTypeProduct();
	   int productInStock = ProductDAO.countProductInStock(0);
	   request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF8");
	   ArrayList<Integer> listCount= new ArrayList<Integer>();
	   listCount.add(numberOfTypeProduct);
	   listCount.add(numberOfSupplier);
	   listCount.add(numberOfStaff);
	   listCount.add(productInStock);
	   request.setAttribute("listCount", listCount);
	   
	    HttpSession session = request.getSession();
	    User user = (User) session.getAttribute("user") ;
	    
	    if(user != null) {
	    	  request.getRequestDispatcher("index.jsp").forward(request, response);
	    }else {
	    	response.sendRedirect(Util.getFullPath("error.jsp"));
	    }
	   
	 
	
	   
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doGet(request, response);
	}

}
