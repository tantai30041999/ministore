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
import util.GenerateFilter;
import util.Util;

/**
 * Servlet implementation class InventoryInStock
 */
@WebServlet("/InventoryInStockController")
public class InventoryInStockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public InventoryInStockController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		if(user!= null) {
			
			ArrayList<Product> listProductInStock = (ArrayList<Product>) ProductDAO.getAllProductInStock();
			ArrayList<Integer> listFilter = new ArrayList<Integer>();
		    listFilter.addAll(GenerateFilter.autoCreateFileter(listProductInStock));
		    
		    request.setAttribute("listFilter", listFilter);
		    request.getRequestDispatcher("inventoryInStock.jsp").forward(request, response);
			
			
		}else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
		}
	} 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
