package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import util.Util;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Profile() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doPost(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF8");
		if(u != null) {
			
			session.setAttribute("user", u);
		
			System.out.println(u.getName());
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}else {
			response.sendRedirect(Util.getFullPath("error.jsp"));
		}

	}

}
