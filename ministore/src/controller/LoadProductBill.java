package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import util.Util;

/**
 * Servlet implementation class LoadProductBill
 */
@WebServlet("/LoadProductBill")
public class LoadProductBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadProductBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   HttpSession session = request.getSession();
	   
	   User u = (User) session.getAttribute("user");
	   String status = request.getParameter("status");
	   if(u!= null) {
		   if(status.equals("getData")) {
		   ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cart");
		   
		   String json ="";
		   Gson gson = new Gson();
		   if(list!= null) {
			  
			   json = gson.toJson(list);
			   
		   }else {
			   json =gson.toJson("Null");
					   
		   }
		   
		   PrintWriter out = response.getWriter();
		    response.setContentType("application/json");
		    response.setCharacterEncoding("UTF8");
		    out.write(json);
		    out.close();
		   }  
	   }else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
	   }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       doGet(request, response);
	}

}
