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
import util.OTPGenerate;
import util.SendMail;
import util.ValidateService;


@WebServlet("/ForgetPassController")
public class ForgetPassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ForgetPassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		System.out.println(email);
		ValidateService validateService = new ValidateService();
		if(SignUpDAO.isMailExist(email) && validateService.isValidEmailAddress(email) ) {
			
			String otp = OTPGenerate.OTP(6)+"";
			try {
				SendMail.sendMail(email, "Mã OTP", otp);
				HttpSession session = request.getSession();
				session.setAttribute("otp", otp);
				session.setAttribute("email", email);
				response.sendRedirect("cover-forgetpass1.jsp");
			
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			
			request.setAttribute("msg", "Email không chính xác!");
			request.getRequestDispatcher("forget-password.jsp").forward(request, response);
		}
	}

}
