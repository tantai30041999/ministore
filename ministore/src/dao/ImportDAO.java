package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Detail;
import bean.Import;
import db.ConnectionDB;

public class ImportDAO {
	 public static List<Import> getAllImport() {
	        String sql = "SELECT * FROM `importreceipt`";
	        Connection con = null;
	        List<Import> listImport = new ArrayList<>();
	        List<String> listIdImport = new ArrayList<>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            while (rs.next()){
	                listIdImport.add(rs.getString("idImport"));
	            }
	            for (String id :listIdImport){
	                listImport.add(getImportById(id));
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
	        return listImport;
	    }

	    public static Import getImportById(String idImport) {
	        String sql = "SELECT * FROM `importreceipt` as ip WHERE ip.idImport = ?";
	        Connection con = null;
	        Import im = new Import();
	        List<String> listIdImportDetail = DetailDAO.getAllIdImportDetailbyIdImport(idImport);
	        List<Detail> listImportDetail = new ArrayList<>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idImport);
	            ResultSet rs = pre.executeQuery();
	            rs.last();
	            im.setIdImport(rs.getString("idImport"));
	            im.setImportDate(rs.getDate("dateImport"));
	            im.setTotalCost(rs.getInt("totalCost"));
	            im.setStatusPayment(true);
	            for (String id : listIdImportDetail) {
	                listImportDetail.add(DetailDAO.getImportDetailById(id));
	            }
	            im.setImportDetail(listImportDetail);
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
	        return im;
	    }

	    public static void insertImportAndImportDetail(String idImport, Date dateImport, int totalCost, String idStore, String idUser,String idImportDetail, int quantityImport, String idProduct){
	        insertImport(idImport,dateImport,totalCost,idStore,idUser);
	        DetailDAO.insertImportDetail(idImportDetail,quantityImport,idImport,idProduct);
	    }

	    public static void insertImport(String idImport, Date dateImport, int totalCost, String idStore, String idUser) {
	        String sql = "INSERT INTO `importreceipt` VALUES (?,?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idImport);
	            pre.setDate(2, dateImport);
	            pre.setInt(3, totalCost);
	            pre.setString(4, idStore);
	            pre.setString(5, idUser);
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

	    public static void removeImportAndImportDetail(String idImport){
	        DetailDAO.removeImportDetail(idImport);
	        removeImport(idImport);
	    }

	    public static void removeImport(String idImport) {
	        String sql = "DELETE FROM `importreceipt` WHERE idImport = ?";
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

	    public static void updateImport(String idImport, Date dateImport, int totalCost, String idStore, String idUser) {
	        String sql = "UPDATE `importreceipt` SET dateImport = ?, totalCost = ?, idStore = ?, idUser = ? WHERE idImport = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setDate(1, dateImport);
	            pre.setInt(2, totalCost);
	            pre.setString(3, idStore);
	            pre.setString(4, idUser);
	            pre.setString(5,idImport);
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
//	        for (Import i : getAllImport()){
//	            System.out.println(i);
//	        }
//	        System.out.println(getImportById("ip1"));
//	        insertImport("ip7",Date.valueOf(LocalDate.now()),500,"ST0001","#000145");
//	        insertImportAndImportDetail("ip4",Date.valueOf(LocalDate.now()),500,"ST0001","#000145","ipd8",20,"SP00025");
//	        removeImportAndImportDetail("ip4");
	        updateImport("ip7",Date.valueOf(LocalDate.now()),700,"ST0001","#000145");
	    }
}
