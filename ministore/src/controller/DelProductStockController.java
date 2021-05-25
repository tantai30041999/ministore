package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.ProductDAO;
import util.Util;

/**
 * Servlet implementation class DelProductStockController
 */
@WebServlet("/DelProductStockController")
public class DelProductStockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelProductStockController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   HttpSession session = request.getSession();
		     User user = (User) session.getAttribute("user");
		     if(user != null) {
		    	 
		    	  String idProduct = request.getParameter("idProduct");
		    	  
		    	  ProductDAO.removeProduct(idProduct);
		    	  response.sendRedirect(Util.getFullPath("StockController"));
		    	 
		     }else {
		    	 response.sendRedirect(Util.getFullPath("error.jsp"));
		     }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
