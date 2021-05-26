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
import util.Util;


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
		
		 SignInDao signInDao = new SignInDao();
		 HttpSession session = null;
		 User user = null;
		  	request.setCharacterEncoding("UTF-8");
		  	response.setCharacterEncoding("UTF-8");
		 try {
			 session = request.getSession();
			 user= (User) session.getAttribute("user");
			 if(user == null) {
				 if(signInDao.checkSignIn(userName, pass)) {
					
					 user = SignInDao.getUser(userName, pass);
					 session = request.getSession(true);
					 session.setAttribute("user", user);
					 response.sendRedirect(Util.getFullPath("IndexController"));
				    
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
