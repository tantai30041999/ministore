package dao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Owner;
import bean.Staff;
import bean.User;
import db.ConnectionDB;
import util.GenerateID;
import util.MD5;

public class SignInDao {
	 public static boolean checkSignIn(String username, String password) throws NoSuchAlgorithmException {
	        String sql = "Select * from userstore where email=? and pass=? and activeUser = 1";
	        boolean result = false;
	        PreparedStatement pre = null;
	        Connection con = null;
	       
	            try {
					con = ConnectionDB.connect();
				     pre = con.prepareStatement(sql);
			            pre.setString(1, username);
			            MD5 md5 = new MD5();
			            String pass = md5.convertHashToString(password);
			            pre.setString(2,pass);
			            ResultSet rs = pre.executeQuery();
			            rs.last();
			            int row = rs.getRow();
			            if (rs != null && row == 1) {
			                result = true;
			            }
				} catch (ClassNotFoundException | SQLException e) {
				
					e.printStackTrace();
					  ConnectionDB.pool.releaseConnection(con);
			            return false;
				}
      
	        ConnectionDB.pool.releaseConnection(con);
	        return result;
	    }
	    public static User getUser(String email, String pass) throws NoSuchAlgorithmException {
	        String sql = "select * from userstore where email=? and pass=?";
	   
	        PreparedStatement pre = null;
	        Connection con = null;
	        User user = null;
	      
	            try {
					con = ConnectionDB.connect();
					  pre = con.prepareStatement(sql);
			           
			            String password = MD5.convertHashToString(pass);
			    
			      
			            pre.setString(1, email);
			            pre.setString(2, password);
			            ResultSet rs = pre.executeQuery();
			            rs.last();
			            int row =rs.getRow();
			            if(rs != null && row == 1) {
			            	int level = rs.getInt("levelUser");
			            	String fullName = rs.getString("fullName");
			            	String image = rs.getString("image");
			            	String phone = rs.getString("phone");
			            	boolean active = (rs.getInt("activeUser") == 1 ) ? true : false;
			            	Date date = rs.getDate("birthDay");
			            	String idStore = rs.getString("idStore");
			            	String idSalary = rs.getString("idSalary");
			            	
			            	if(level == 0) {
			            		user = new Staff(email, password, fullName, date, level, phone, image, active, idStore, idSalary);
			            	}else {
			            		if(level == 1) {
			            			user = new Owner(email, password, fullName, date, level, phone, image, active, idStore, idSalary);
			            		}
			            	}
			            }
			

				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
					ConnectionDB.pool.releaseConnection(con);
				} catch (SQLException e) {
				
					e.printStackTrace();
					ConnectionDB.pool.releaseConnection(con);
				}
	          
	        ConnectionDB.pool.releaseConnection(con);
	        return user;
}
	 public static void main(String[] args) throws NoSuchAlgorithmException {
		
		 System.out.println(checkSignIn("ilovetai30@gmail.com", "111111"));
	}

}
