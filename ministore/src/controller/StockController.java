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
import bean.Supplier;
import bean.TypeProduct;
import bean.User;
import dao.ProductDAO;
import dao.SupplierDAO;
import dao.TypeProductDAO;
import util.Util;

/**
 * Servlet implementation class StockController
 */
@WebServlet("/StockController")
public class StockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   HttpSession session = request.getSession();
		     User user = (User) session.getAttribute("user");
		   	request.setCharacterEncoding("UTF-8");
		  	response.setCharacterEncoding("UTF-8");
		     if(user != null) {
		    	 ArrayList<Product> listProductInStock = new ArrayList<Product>();
		    	 ArrayList<TypeProduct> listType = new ArrayList<TypeProduct>();
		    	 ArrayList<Supplier> listSupplier = new ArrayList<Supplier>();
		    	 
		    	 listSupplier = SupplierDAO.getAllSupplier();
		    	 listType = TypeProductDAO.getAllTypeProduct();
 		    	 listProductInStock = (ArrayList<Product>) ProductDAO.getAllProductInStock();
		    	 
 		    	 request.setAttribute("listSupplier", listSupplier);
 		    	 request.setAttribute("listType", listType);
		    	 request.setAttribute("listProductInStock", listProductInStock);
		    	 request.getRequestDispatcher("stock.jsp").forward(request, response);;
		    	 
		    	 
		    	 
		     }else {
		    	 response.sendRedirect(Util.getFullPath("error.jsp"));
		     }
	}

}
