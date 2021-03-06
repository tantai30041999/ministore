package dao;

import java.security.NoSuchAlgorithmException;
import java.sql.*;

import bean.Owner;
import bean.User;
import db.ConnectionDB;
import util.GenerateID;
import util.MD5;

public class SignUpDAO {
	  public static boolean isMailExist(String email) {
	        String sql = "SELECT * from userstore  where email=?";
	        Connection con = null;
	        PreparedStatement pre = null;
	        try {
	            con = ConnectionDB.connect( );
	            pre = con.prepareStatement(sql);
	            pre.setString(1,email);
	            ResultSet rs = pre.executeQuery();
	           rs.last();
	           if(rs.getRow()>0){
	               ConnectionDB.pool.releaseConnection(con);
	               return true;
	           }

	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        ConnectionDB.pool.releaseConnection(con);
	        return false;
	    }
	    public static boolean insertUser(User user) throws NoSuchAlgorithmException {
	        String sql = "INSERT into userstore VALUE(?,?,?,?,?,?,?,?,?,?,?)";
	        boolean result = false;
	        PreparedStatement pre = null;
	        Connection con = null;
	      
	            try {
					con = ConnectionDB.connect();
					  pre = con.prepareStatement(sql);
			           
			            String pass = MD5.convertHashToString(user.getPassword());
			            String idUser = GenerateID.generateIDUser();
			            pre.setString(1, idUser);
			            pre.setString(2, user.getEmail());
			            pre.setString(3, pass);
			            pre.setInt(4, user.getLevel());
			            pre.setString(5,user.getName());
			            pre.setString(6, user.getImage());
			            pre.setString(7, user.getPhoneNumber());
			            int active = (user.isActive()) ? 1 : 0;
			            pre.setInt(8, active);
			            pre.setDate(9, user.getBirthDay());
			            pre.setString(10, user.getIdStore());
			            pre.setString(11, user.getIdSalary());

			            int add = pre.executeUpdate();
			            pre.close();

			            if (add == 1)
			                ConnectionDB.pool.releaseConnection(con);
			                result = true;
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
	          
	        ConnectionDB.pool.releaseConnection(con);
	        return result;
}
	    public static void main(String[] args) throws NoSuchAlgorithmException {
			User u = new Owner("tantai123@gmail.com", "hahaha", "", Date.valueOf("2000-04-30"), 1, "", "", true, "ST0001", "SL0001");
			System.out.println(insertUser(u));
		}
}
