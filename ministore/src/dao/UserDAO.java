package dao;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.ConnectionDB;
import util.MD5;

public class UserDAO {
	
	
	public static String getIdUser(String email) {
		String idUser = "";
		String sql = "select idUser  from userstore where email=?";
		Connection con = null;

		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, email);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				idUser = rs.getString("idUser");
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
		return idUser;
	}
	public static String getUserIdLast() {
		String idUserLast = "";
		String sql = "select idUser  from userstore order by idUser desc  limit 1";
		Connection con = null;

		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
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
		return idUserLast;
	}

	public static boolean changePass(String email, String pass) throws NoSuchAlgorithmException {
		String sql = "update userstore set pass=? where email=?";
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);

			pre.setString(1, MD5.convertHashToString(pass));
			pre.setString(2, email);

			int update = pre.executeUpdate();
			if (update == 1) {
				ConnectionDB.pool.releaseConnection(con);
				return true;
			}

		} catch (ClassNotFoundException e) {
			ConnectionDB.pool.releaseConnection(con);
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ConnectionDB.pool.releaseConnection(con);
			e.printStackTrace();
		}

		ConnectionDB.pool.releaseConnection(con);
		return false;
	}

	public static int countStaff() {
		int count = 0;
		String sql = "select count(*) as sumStaff from userstore where levelUser= 0";
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			rs.last();
			count = Integer.parseInt(rs.getString("sumStaff"));

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			ConnectionDB.pool.releaseConnection(con);
		}
		ConnectionDB.pool.releaseConnection(con);
		return count;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
           System.out.println(getIdUser("ilovetai30@gmail.com"));
	}
}
