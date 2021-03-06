package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.net.httpserver.Authenticator.Result;

import db.ConnectionDB;
import util.GenerateID;

public class StoreDAO {
   public static String getStoreIdLast() {
	   String idStoreLast = "";
	   String sql ="select idStore from store order by idStore desc  limit 1";
	   Connection con = null;
	   
	   try {
		con  = ConnectionDB.connect();
		PreparedStatement pre = con.prepareStatement(sql);
		ResultSet rs =  pre.executeQuery();
		while(rs.next()) {
			idStoreLast = rs.getString("idStore");
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
	   return idStoreLast;
   }
   public static boolean insertStore( String nameStore, String logo) {
	   String sql ="insert into store value(?,?,?)";
	   Connection con = null;
	   
	   try {
		con = ConnectionDB.connect();
		PreparedStatement pre = con.prepareStatement(sql);
		String idStore =GenerateID.generateIDStore();
		pre.setString(1, idStore);
		pre.setString(2, nameStore);
		pre.setString(3, logo);
		
		int addStore = pre.executeUpdate();
		if(addStore ==1) {
			 ConnectionDB.pool.releaseConnection(con);
			return true;
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		 ConnectionDB.pool.releaseConnection(con);
	} catch (SQLException e) {
	
		e.printStackTrace();
		 ConnectionDB.pool.releaseConnection(con);
	}
	   ConnectionDB.pool.releaseConnection(con);
	   return false;
   }
   public static void main(String[] args) {

}
}
