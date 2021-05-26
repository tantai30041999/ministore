package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Supplier;
import bean.User;
import dao.SupplierDAO;
import util.Util;

/**
 * Servlet implementation class SuppierController
 */
@WebServlet("/SuppierController")
public class SuppierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuppierController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     HttpSession session = request.getSession();
     User user = (User) session.getAttribute("user");
   	request.setCharacterEncoding("UTF-8");
  	response.setCharacterEncoding("UTF-8");
     if(user != null) {
    	  
    	 ArrayList<Supplier> listSupplier = new ArrayList<Supplier>();
    	 listSupplier.addAll(SupplierDAO.getAllSupplier());
    	 ArrayList<Integer> countProductBySupplier = new ArrayList<Integer>();
    	 try {
			countProductBySupplier.addAll(SupplierDAO.getCountProductBySp(listSupplier));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 request.setAttribute("listCount", countProductBySupplier);
    	 request.setAttribute("listSupplier", listSupplier);
    	 request.getRequestDispatcher("supplier.jsp").forward(request, response);
    	 
    	 
     }else {
    	 response.sendRedirect(Util.getFullPath("error.jsp"));
     }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
