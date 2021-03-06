package controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SignUpDAO;
import dao.UserDAO;
import util.OTPGenerate;
import util.SendMail;
import util.ValidateService;


@WebServlet("/OTPForgetController")
public class OTPForgetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public OTPForgetController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String otp = request.getParameter("otp");
		HttpSession session = request.getSession();
		String otpSession = (String) session.getAttribute("otp");
		
		if(otp.equals(otpSession)) {
			
			response.sendRedirect("cover-forgetpass2.jsp");
		}else {
			
			request.setAttribute("msg", "Mã OTP không chính xác!");
			request.getRequestDispatcher("cover-forgetpass1.jsp").forward(request, response);
		}
				
	}

}
