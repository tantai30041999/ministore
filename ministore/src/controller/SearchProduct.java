package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.Product;
import dao.ProductDAO;

@WebServlet("/SearchProductController")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nameProduct = request.getParameter("nameProduct");
	
		if(nameProduct.length() > 0) {
		ArrayList<Product> list = new ArrayList<Product>();
		list = (ArrayList<Product>) ProductDAO.getListProducSaletByName(nameProduct);
		System.out.println(list);
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		String json  = "";
		if(nameProduct != null) {
			json = gson.toJson(list);
		}else {
			json = gson.toJson("Null");
		}
		
	
		System.out.println(json);
		response.setContentType("application/json");
		 response.setCharacterEncoding("UTF8");
		 
		out.print(json);
		out.close();
		}

	}

}
