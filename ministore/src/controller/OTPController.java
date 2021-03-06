package controller;

import java.io.IOException;
import java.sql.Date;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Owner;
import bean.User;
import util.OTPGenerate;
import util.SendMail;
import util.ValidateService;


@WebServlet("/OTPController")
public class OTPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public OTPController() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String fullName = request.getParameter("fullName");
		String storeName = request.getParameter("storeName");
		String date = request.getParameter("dayOfBirth");
		String email = request.getParameter("userName");
		String pass = request.getParameter("password");
		String repass = request.getParameter("repassword");
		
		
	
		ValidateService validateService = new ValidateService();
	
		if(validateService.checkSamePass(pass, repass) && validateService.isValidEmailAddress(email)) {
			
			User user = new Owner(email, pass, fullName, Date.valueOf(date), 1, "", "", true, "", "SL0001");
			
			try {
				
				request.setCharacterEncoding("UTF-8");
				SendMail sendMail = new SendMail();
				OTPGenerate otpMachine = new OTPGenerate();
				
				String otpCode = otpMachine.OTP(6).toString();
				System.out.println(otpCode);
				sendMail.sendMail(email, "Mã OTP", otpCode);
				HttpSession session = request.getSession();
				session.setAttribute("otp", otpCode);
				session.setAttribute("storeName",storeName );
				session.setAttribute("user", user);

			
				response.sendRedirect("/ministore/cover-register.jsp");
			} catch (MessagingException e) {
	
				e.printStackTrace();
			}

		}else {
			
			request.getRequestDispatcher("/ministore/register.jsp").forward(request, response);
		}
		
	}

}
