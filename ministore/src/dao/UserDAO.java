package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.ConnectionDB;

public class UserDAO {
	   public static String getUserIdLast() {
		   String idUserLast = "";
		   String sql ="select idUser  from userstore order by idUser desc  limit 1";
		   Connection con = null;
		   
		   try {
			con  = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs =  pre.executeQuery();
			while(rs.next()) {
				idUserLast = rs.getString("idUser");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			 ConnectionDB.pool.releaseConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 ConnectionDB.pool.releaseConnection(con);
		}
		   ConnectionDB.pool.releaseConnection(con);
		   return idUserLast ;
	   }
}