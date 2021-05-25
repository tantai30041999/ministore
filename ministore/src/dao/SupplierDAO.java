package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Supplier;
import db.ConnectionDB;
import util.GenerateID;

public class SupplierDAO {
	
	
	public static ArrayList<Integer> getCountProductBySp(ArrayList<Supplier> listSp) throws ClassNotFoundException, SQLException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < listSp.size(); i++) {
			int tmp = ProductDAO.countProductByIdSupplier(listSp.get(i).getIdSupplier());
			list.add(tmp);
		}
		
		return list;
	}
	public static ArrayList<Supplier> getAllSupplier() {
		ArrayList<Supplier> listSupplier = null;
		String sql = "select * from supplier";
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			listSupplier = new ArrayList<Supplier>();
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				String idSupplier = rs.getString("idSupplier");
				String nameSupplier = rs.getString("nameSupplier");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String idStore = rs.getString("idStore");

				listSupplier.add(new Supplier(idSupplier, nameSupplier, address, phone, email, idStore));
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			ConnectionDB.pool.releaseConnection(con);
		}

		ConnectionDB.pool.releaseConnection(con);
		return listSupplier;

	}

	public static Supplier getSupplier(String idSupplier) {
		Supplier supplier = null;
		String sql = "Select * from supplier where idSupplier=?";
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			supplier = new Supplier();
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, idSupplier);
			ResultSet rs = pre.executeQuery();
			rs.last();
			supplier.setIdSupplier(rs.getString("idSupplier"));
			supplier.setEmail(rs.getString("email"));
			supplier.setNameSupplier(rs.getString("nameSupplier"));
			supplier.setPhoneNumber(rs.getString("phone"));
			supplier.setAddress(rs.getString("address"));
			supplier.setIdStore(rs.getString("idStore"));
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			ConnectionDB.pool.releaseConnection(con);
		}
		ConnectionDB.pool.releaseConnection(con);
		return supplier;

	}

	public static String getLastIdSupplier() {
		String idSupplierLast = "";
		String sql = "select idSupplier  from supplier order by idSupplier desc  limit 1";
		Connection con = null;

		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			rs.last();
			idSupplierLast = rs.getString("idSupplier");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnectionDB.pool.releaseConnection(con);
		}
		ConnectionDB.pool.releaseConnection(con);
		return idSupplierLast;

	}

	public static boolean insertSupplier(Supplier supplier) {
		String sql = "insert into supplier value(?,?,?,?,?,?)";
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			String idSupplier = GenerateID.generateIDSupplier();
			pre.setString(1, idSupplier);
			pre.setString(2, supplier.getNameSupplier());
			pre.setString(3, supplier.getPhoneNumber());
			pre.setString(4, supplier.getEmail());
			pre.setString(5, supplier.getAddress());
			pre.setString(6, supplier.getIdStore());
			
			int add = pre.executeUpdate();
			if(add == 1) {
				ConnectionDB.pool.releaseConnection(con);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ConnectionDB.pool.releaseConnection(con);
		}
		ConnectionDB.pool.releaseConnection(con);
		return false;
	}
 
	public static boolean updateSupplier(Supplier supplier,String idSupplier) {
		String sql = "update supplier set nameSupplier=?, phone=?, email=?,address=? where idSupplier=?";
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, supplier.getNameSupplier());
			pre.setString(2, supplier.getPhoneNumber());
			pre.setString(3, supplier.getEmail());
			pre.setString(4, supplier.getAddress());
			pre.setString(5, idSupplier);

			int update = pre.executeUpdate();
			if (update == 1) {
				ConnectionDB.pool.releaseConnection(con);
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			ConnectionDB.pool.releaseConnection(con);
		}
		ConnectionDB.pool.releaseConnection(con);
		return false;
	}

	// delete  
	 // TO DO
	
	
	public static int countSupplier() {
		String sql = "SELECT count(*) as sumSupplier FROM supplier;";
		int count = 0;
		Connection con = null;
		try {
			con = ConnectionDB.connect();
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			rs.last();
			count = Integer.parseInt(rs.getString("sumSupplier"));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			ConnectionDB.pool.releaseConnection(con);
			e.printStackTrace();
		}
		ConnectionDB.pool.releaseConnection(con);
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getAllSupplier().size());
		
	}
}
