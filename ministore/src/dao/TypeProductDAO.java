package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import bean.TypeProduct;
import db.ConnectionDB;

public class TypeProductDAO {

	
	public static ArrayList<TypeProduct> getAllTypeProduct() {
		  String sql = "SELECT * FROM  typeproduct";
	        Connection con = null;
	        List<TypeProduct> list = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            list = new ArrayList<TypeProduct>();
	            while (rs.next()) {
	                String idType = rs.getString("idType");
	                String nameType = rs.getString("typeName");
	               
	                list.add(new TypeProduct(idType, nameType));
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	        ConnectionDB.pool.releaseConnection(con);
	        return (ArrayList<TypeProduct>) list;
	}
	public static void main(String[] args) {
		
	}
}
