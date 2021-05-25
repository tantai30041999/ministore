package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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

/**
 * Servlet implementation class FilterStockController
 */
@WebServlet("/FilterStockController")
public class FilterStockController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FilterStockController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		

		if (user != null) {

			String filter = request.getParameter("filterStock");
			ArrayList<Product> listFilter = new ArrayList<Product>();
			 int limit = 0;
			if(filter.equals("empty")) {
				limit = 1;
			}else {
				 limit = Integer.parseInt(filter);
			}
			
		
			try {
				
				
				listFilter.addAll(ProductDAO.getListByFilter(limit));
				
				 PrintWriter out = response.getWriter();
				    response.setContentType("application/json");
				    response.setCharacterEncoding("UTF8");
					 
				    Gson gson = new Gson();
				    String json = "";
				    if(listFilter.size() >0) {
				    	json = gson.toJson(listFilter);
				    }
				    out.write(json);
				    out.close();
				    
				
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		} else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

       doPost(request, response);
	}

}
