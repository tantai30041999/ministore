package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Detail;
import bean.Export;
import db.ConnectionDB;

public class ExportDAO {
	  public static List<Export> getAllExport() {
	        String sql = "SELECT * FROM `exportreceipt`";
	        Connection con = null;
	        List<Export> listExport = new ArrayList<>();
	        List<String> listIdExport = new ArrayList<>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            while (rs.next()) {
	                listIdExport.add(rs.getString("idExport"));
	            }
	            for (String id : listIdExport) {
	                listExport.add(getExportById(id));
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
	        return listExport;
	    }

	    public static Export getExportById(String idExport) {
	        String sql = "SELECT * FROM `exportreceipt` as ep WHERE ep.idExport = ?";
	        Connection con = null;
	        Export export = new Export();
	        List<String> listIdExportDetail = DetailDAO.getAllIdExportDetailbyIdExport(idExport);
	        List<Detail> listExportDetail = new ArrayList<>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idExport);
	            ResultSet rs = pre.executeQuery();
	            rs.last();
	            export.setIdExport(rs.getString("idExport"));
	            export.setExportDate(rs.getDate("dateExport"));
	            export.setReason(rs.getString("reasonExport"));
	            for (String id : listIdExportDetail) {
	                listExportDetail.add(DetailDAO.getExportDetailById(id));
	            }
	            export.setExportDetail(listExportDetail);
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
	        return export;
	    }

	    public static void insertExportAndExportDetail(String idExport, Date dateExport, String resonExport, String idUser, String idStore, String idExportDetail, int quantityExport, String idProduct) {
	        insertExport(idExport, dateExport, resonExport, idUser, idStore);
	        DetailDAO.insertExportDetail(idExportDetail, quantityExport, idProduct, idExport);
	    }

	    public static void insertExport(String idExport, Date dateExport, String resonExport, String idUser, String idStore) {
	        String sql = "INSERT INTO `exportreceipt` VALUES (?,?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idExport);
	            pre.setDate(2, dateExport);
	            pre.setString(3, resonExport);
	            pre.setString(4, idUser);
	            pre.setString(5, idStore);
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

	    public static void removeExportAndExportDetail(String idExport) {
	        DetailDAO.removeExportDetail(idExport);
	        removeExport(idExport);
	    }

	    public static void removeExport(String idExport) {
	        String sql = "DELETE FROM `exportreceipt` WHERE idExport = ?";
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

	    public static void updateExport(String idExport, Date dateExport, String resonExport, String idUser, String idStore) {
	        String sql = "UPDATE `exportreceipt` SET dateExport = ?, reasonExport = ?, idUser = ?, idStore = ? WHERE idExport = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setDate(1, dateExport);
	            pre.setString(2, resonExport);
	            pre.setString(3, idUser);
	            pre.setString(4, idStore);
	            pre.setString(5, idExport);
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
//	        for (Export export : getAllExport()){
//	            System.out.println(export);
//	        }
//	        System.out.println(getExportById("ep1"));
//	        insertExportAndExportDetail("ep4",Date.valueOf(LocalDate.now()),"chao ban","#000145","ST0001","epd7",20,"SP00025");
//	        removeExportAndExportDetail("ep4");
//	        updateExport("ep4",Date.valueOf(LocalDate.now()),"chao ban hien","#000145","ST0001");
	    }
}
