package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.SignInDao;


@WebServlet("/SignInController")
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SignInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 String userName = request.getParameter("email");
		 String pass = request.getParameter("password");
		 System.out.println(userName);
		 System.out.println(pass);
		 SignInDao signInDao = new SignInDao();
		 HttpSession session = null;
		 User user = null;
		 
		 try {
			 session = request.getSession();
			 user= (User) session.getAttribute("user");
			 if(user == null) {
				 if(signInDao.checkSignIn(userName, pass)) {
					  
					 response.sendRedirect("index.jsp");
				    
				 }else {
					 request.setAttribute("msg", "Tên tài khoản hoặc mật khẩu không chính xác!");
					 request.getRequestDispatcher("login.jsp").forward(request, response);
					 
				 }
			 }else {
				 
			 }
			
		} catch (NoSuchAlgorithmException e) {
		
			e.printStackTrace();
		}
	}

}