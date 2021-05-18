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
		
		HttpSession session = request.getSession();
		   User  user = (User )session.getAttribute("user");
		   int page = 1;
		 
		   int totalPage = ProductDAO.numberOfPage();
		   int[] pageLimit = ProductDAO.getLimitePage(page);
		   ArrayList<Product> listProductInStock = (ArrayList<Product>) ProductDAO.getAllProductInStock();
		  
		   if(user!= null) {
			   if(request.getParameter("page") != null) {
				    page = Integer.parseInt(request.getParameter("page"));
				    pageLimit = ProductDAO.getLimitePage(page);
			   }
			   
			   ArrayList<Product> listProduct = (ArrayList<Product>) ProductDAO.getListProductPage(page);
			   request.setAttribute("listProductInStock", listProductInStock);
			   request.setAttribute("pageLimit", pageLimit);
			   request.setAttribute("pageShow", page);
			   request.setAttribute("totalPage",totalPage );
			   request.setAttribute("listProduct", listProduct);
			   request.getRequestDispatcher("product.jsp").forward(request, response);
		   }else {
			   response.sendRedirect("error.jsp");
		   }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doGet(request, response);
	
	}

}
