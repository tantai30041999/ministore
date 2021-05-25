package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Detail;
import db.ConnectionDB;

public class DetailDAO {
	  public static List<String> getAllIdImportDetailbyIdImport(String idImport){
	        String sql = "SELECT * FROM `importdetail` WHERE idImport = ?";
	        Connection con = null;
	        List<String> list = new ArrayList<String>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idImport);
	            ResultSet rs = pre.executeQuery();
	            while (rs.next()){
	                list.add(rs.getString("idImportDetail"));
	            }
	        }catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	        ConnectionDB.pool.releaseConnection(con);
	        return list;
	    }

	    public static Detail getImportDetailById(String idImportDetail){
	        String sql = "SELECT * FROM `importdetail` WHERE idImportDetail = ?";
	        Connection con = null;
	        Detail detail = new Detail();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idImportDetail);
	            ResultSet rs = pre.executeQuery();
	            rs.last();
	            detail.setIdProduct(rs.getString("idProduct"));
	            detail.setQuantity(rs.getInt("quantityImport"));
	        }catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	        ConnectionDB.pool.releaseConnection(con);
	        return detail;
	    }

	    public static void insertImportDetail(String idImportDetail, int quantityImport, String idImport, String idProduct){
	        String sql = "INSERT INTO `importdetail` VALUES (?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idImportDetail);
	            pre.setInt(2, quantityImport);
	            pre.setString(3, idImport);
	            pre.setString(4, idProduct);
	            pre.executeUpdate();
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
	    }

	    public static void removeImportDetail(String idImport){
	        String sql = "DELETE FROM `importdetail` WHERE idImport = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idImport);
	            pre.executeUpdate();
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
	    }

	    public static void updateImportDetail(String idImportDetail, int quantityImport, String idImport, String idProduct){
	        String sql = "UPDATE `importdetail` SET quantityImport = ?, idProduct = ? WHERE idImportDetail = ? AND idImport = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setInt(1, quantityImport);
	            pre.setString(2, idProduct);
	            pre.setString(3,idImportDetail);
	            pre.setString(4, idImport);
	            pre.executeUpdate();
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
	    }

	    public static List<String> getAllIdExportDetailbyIdExport(String idExport){
	        String sql = "SELECT * FROM `exportdetail` WHERE idExport = ?";
	        Connection con = null;
	        List<String> list = new ArrayList<String>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idExport);
	            ResultSet rs = pre.executeQuery();
	            while (rs.next()){
	                list.add(rs.getString("idExportDetail"));
	            }
	        }catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	        ConnectionDB.pool.releaseConnection(con);
	        return list;
	    }

	    public static Detail getExportDetailById(String idExportDetail){
	        String sql = "SELECT * FROM `exportdetail` WHERE idExportDetail = ?";
	        Connection con = null;
	        Detail detail = new Detail();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idExportDetail);
	            ResultSet rs = pre.executeQuery();
	            rs.last();
	            detail.setIdProduct(rs.getString("idProduct"));
	            detail.setQuantity(rs.getInt("quantityExport"));
	        }catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	        ConnectionDB.pool.releaseConnection(con);
	        return detail;
	    }

	    public static void insertExportDetail(String idExportDetail, int quantityExport, String idProduct, String idExport){
	        String sql = "INSERT INTO `exportdetail` VALUES (?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idExportDetail);
	            pre.setInt(2, quantityExport);
	            pre.setString(3, idProduct);
	            pre.setString(4, idExport);
	            pre.executeUpdate();
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
	    }

	    public static void removeExportDetail(String idExport){
	        String sql = "DELETE FROM `exportdetail` WHERE idExport = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idExport);
	            pre.executeUpdate();
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
	    }

	    public static void updateExportDetail(String idExportDetail, int quantityExport, String idProduct, String idExport){
	        String sql = "UPDATE `exportdetail` SET quantityExport = ?, idProduct = ? WHERE idExportDetail = ? AND idExport = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setInt(1, quantityExport);
	            pre.setString(2, idProduct);
	            pre.setString(3,idExportDetail);
	            pre.setString(4, idExport);
	            pre.executeUpdate();
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
	    }
	    public static void main(String[] args) {
//	        System.out.println(getImportDetailById("ipd1"));
//	        System.out.println(getAllIdImportDetailbyIdImport("ip1"));
	        updateImportDetail("ipd7",30,"ip3","SP00035");
	    }
}
