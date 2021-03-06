package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import util.ValidateService;

/**
 * Servlet implementation class UpdatePassController
 */
@WebServlet("/UpdatePassController")
public class UpdatePassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdatePassController() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   doPost(request, response);
	} 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String pass = request.getParameter("newpass");
	   System.out.println(pass);
	   String repass = request.getParameter("renewpass");
	   System.out.println(repass);
	   HttpSession session = request.getSession();
	   String email =(String) session.getAttribute("email");
	   System.out.println(email+"a");
	   ValidateService validateService = new ValidateService();
	   if(validateService.checkSamePass(pass, repass)) {
		   try {
			if(UserDAO.changePass(email, pass)) {
				   response.sendRedirect("success2.jsp");
			   }
		} catch (NoSuchAlgorithmException e) {
		
			e.printStackTrace();
		}
	   }else {
		   request.setAttribute("msg", "Mật khẩu không khớp!");
		   request.getRequestDispatcher("cover-forgetpass2.jsp").forward(request, response);
	   }
	}

}
