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
import dao.SignUpDAO;
import dao.StoreDAO;


@WebServlet("/OTPConfirmController")
public class OTPConfirmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OTPConfirmController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String otpCode = request.getParameter("otpCode");
		
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		String otp = (String) session.getAttribute("otp");
		String storeName = (String)session.getAttribute("storeName");
		if(otp.equals(otpCode)) {
			SignUpDAO signUpDAO = new SignUpDAO();
			StoreDAO storeDAO = new StoreDAO();
			try {
				if(storeDAO.insertStore(storeName, ""));
				u.setIdStore(StoreDAO.getStoreIdLast());
				if(signUpDAO.insertUser(u)) {
					
					response.sendRedirect("success.jsp");
				}
			} catch (NoSuchAlgorithmException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}else {
			request.setCharacterEncoding("UTF-8");
			request.setAttribute("msg", "Mã OTP không chính xác!");
			request.getRequestDispatcher("cover-register.jsp").forward(request, response);
		}
		
	}

}
