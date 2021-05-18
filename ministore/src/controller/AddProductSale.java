package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProductSale
 */
@WebServlet("/AddProductSale")
public class AddProductSale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddProductSale() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse  response) throws ServletException, IOException {
		    
	        String idProduct = request.getParameter("idProduct");
	        int quantityInStock =Integer.parseInt( request.getParameter("quantityInStock"));
	        int quantitySell = Integer.parseInt(request.getParameter("quantitySell"));
	        int activity = 1;
	        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
