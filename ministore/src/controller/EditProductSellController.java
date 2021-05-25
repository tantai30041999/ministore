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


@WebServlet("/EditProductSellController")
public class EditProductSellController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProductSellController() {
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
		    	 
		    	 String idProduct = request.getParameter("idProductE");
		    	 Product p = ProductDAO.getProductById(idProduct);
		    	 int quantityUpdateSell = Integer.parseInt(request.getParameter("quantityInput"));
		    	
		    	 int updateInStock = p.getQuantityInStock() - quantityUpdateSell;
		    	 ProductDAO.updateProductSale(idProduct, updateInStock, quantityUpdateSell+p.getQuantitySale(), 1);
		    	 
		    	 response.sendRedirect(Util.getFullPath("ProductController"));
		    	 
		     }else {
		    	 response.sendRedirect(Util.getFullPath("error.jsp"));
		     }
	}

	public static void main(String[] args) {
		
	}

}
