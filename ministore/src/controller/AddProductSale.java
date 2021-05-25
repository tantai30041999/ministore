package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Product;
import bean.User;
import dao.ProductDAO;
import util.Util;

/**
 * Servlet implementation class AddProductSale
 */
@WebServlet("/AddProductSale")
public class AddProductSale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductSale() {
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
		     if(user != null) {
                    
		    	 
		    	 String idProduct = request.getParameter("idProduct");
		    	 if(idProduct.equals("default")) {
		    		 response.sendRedirect(Util.getFullPath("ProductController"));
		    		 
		    	 }else {
		    		 int quantityAddSell = Integer.parseInt(request.getParameter("quantityAddSell"));
		    		 System.out.println(quantityAddSell);
			    	 Product p = ProductDAO.getProductById(idProduct);
			    	 int updateQuantityStock = p.getQuantityInStock() - quantityAddSell;
			    	 
			    	 ProductDAO.updateProductSale(idProduct, updateQuantityStock, quantityAddSell, 1);
			    	 response.sendRedirect(Util.getFullPath("ProductController"));	 
		    	 }
		    	
		    	 
		     }else {
		    	 response.sendRedirect(Util.getFullPath("error.jsp"));
		     }
	}

}
