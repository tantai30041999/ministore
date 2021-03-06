package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SignUpDAO;


@WebServlet("/AjaxUser")
public class AjaxUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AjaxUser() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("userName");
		SignUpDAO signUpDAO = new SignUpDAO();
		PrintWriter out = response.getWriter();
		if(signUpDAO.isMailExist(email)) {
			response.setContentType("text/html");
			out.print("invalid");
			
		}else {
			response.setContentType("text/html");
			out.print("valid");
			
		}
	
	}

}
