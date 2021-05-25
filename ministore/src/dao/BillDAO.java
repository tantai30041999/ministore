package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Bill;
import bean.Owner;
import bean.Product;
import db.ConnectionDB;

public class BillDAO {
	
	
	 public static List<Bill> getAllBill() {
	        String sql = "SELECT * FROM `bill` AS b  INNER JOIN billdetail AS bd ON b.idBill = bd.idBill  INNER JOIN payment AS p ON b.idPayment = p.idPayment INNER JOIN userstore AS us ON us.idUser = b.idUser;";
	        Connection con = null;
	        List<Bill> billList = new ArrayList<>();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            List<String> idBills = new ArrayList<>();
	            while (rs.next()) {
	                String idBill = rs.getString("idBill");
	                boolean isExist = false;
	                for (String id : idBills) {
	                    if (id.equals(idBill)) {
	                        isExist = true;
	                        break;
	                    }
	                }
	                if (!isExist) {
	                    idBills.add(idBill);
	                }
	            }
	            for (String idBill : idBills) {
	                billList.add(getBillById(idBill));
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
	        return billList;
	    }

	    public static Bill getBillById(String idBill) {
	        String sql = "SELECT * FROM `bill` AS b INNER JOIN billdetail AS bd ON b.idBill = bd.idBill INNER JOIN payment AS p ON b.idPayment = p.idPayment INNER JOIN userstore AS us ON us.idUser = b.idUser WHERE b.idBill =?";
	        Connection con = null;
	        Bill bill = new Bill();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idBill);
	            ResultSet rs = pre.executeQuery();
	            ArrayList<Product> productList = new ArrayList<>();
	            List<String> idProducts = new ArrayList<>();
	            while (rs.next()) {
	                bill.setIdBill(idBill);
	                bill.setCreateDate(rs.getDate("dateBill"));
	                bill.setTotal(rs.getInt("totalCost"));
	                bill.setStatusPayment((rs.getInt("statusPayment") == 1) ? true : false);
	                bill.setTypePayment(rs.getString("typePayment"));
	                idProducts.add(rs.getString("idProduct"));
	                Owner owner = new Owner();
	                owner.setEmail(rs.getString("email"));
	                owner.setPassword(rs.getString("pass"));
	                owner.setBirthDay(rs.getDate("birthDay"));
	                owner.setLevel(rs.getInt("levelUser"));
	                owner.setPhoneNumber(rs.getString("phone"));
	                owner.setImage(rs.getString("image"));
	                owner.setActive((rs.getInt("activeUser") == 1) ? true : false);
	                owner.setIdStore(rs.getString("idStore"));
	                owner.setIdSalary(rs.getString("idSalary"));
	                bill.setUser(owner);
	            }
	            for (String idProduct : idProducts) {
	                productList.add(ProductDAO.getProductById(idProduct));
	            }
	            bill.setListProduct(productList);
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
	        return bill;
	    }

	    public static void insertBillAndBillDetail(String idBill, Date date, int totalCost, String idStore, String idBillDetail, int quantityBuy, String idProduct, String idUser, String idPayment, int statusPayment) {
	        insertBill(idBill, date, totalCost, idStore, idUser, idPayment, statusPayment);
	        insertBillDetail(idBillDetail, quantityBuy, idBill, idProduct);
	    }

	    public static void insertBill(String idBill, Date date, int totalCost, String idStore,String idUser, String idPayment, int statusPayment) {
	        String sql = "INSERT INTO `bill` VALUES (?,?,?,?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idBill);
	            pre.setDate(2, date);
	            pre.setInt(3, totalCost);
	            pre.setString(4, idStore);
	            pre.setString(5, idUser);
	            pre.setString(6, idPayment);
	            pre.setInt(7, statusPayment);
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

	    public static void insertBillDetail(String idBillDetail, int quantityBuy, String idBill, String idProduct) {
	        String sql = "INSERT INTO `billdetail` VALUES (?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idBillDetail);
	            pre.setInt(2, quantityBuy);
	            pre.setString(3, idBill);
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

	    public static void removeBillAndBillDetail(String idBill) {
	        removeBillDetail(idBill);
	        removeBill(idBill);
	    }

	    public static void removeBill(String idBill) {
	        String sql = "DELETE FROM `bill` WHERE idBill = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idBill);
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

	    public static void removeBillDetail(String idBill) {
	        String sql = "DELETE FROM `billdetail` WHERE idBill = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idBill);
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

//	    public static void updateBillAndBillDetail(String idBill, Date date, int totalCost, String idStore, String idBillDetail, int quantityBuy, String idProduct, String idUser, String idPayment, int statusPayment) {
//	        updateBill(idBill, date, totalCost, idStore);
//	        updateBillDetail(idBillDetail, quantityBuy, idBill, idProduct, idUser, idPayment, statusPayment);
//	    }

//	    public static void updateBill(String idBill, Date date, int totalCost, String idStore) {
//	        String sql = "UPDATE `bill` SET dateBill = ?, totalCost = ?, idStore = ? WHERE idBill = ?";
//	        Connection con = null;
//	        try {
//	            con = ConnectionDB.connect();
//	            PreparedStatement pre = con.prepareStatement(sql);
//	            pre.setDate(1, date);
//	            pre.setInt(2, totalCost);
//	            pre.setString(3, idStore);
//	            pre.setString(4, idBill);
//	            pre.executeUpdate();
//	        } catch (ClassNotFoundException e) {
//	            e.printStackTrace();
//	            System.out.print(e.getMessage());
//	            ConnectionDB.pool.releaseConnection(con);
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	            System.out.print(e.getMessage());
//	            ConnectionDB.pool.releaseConnection(con);
//	        }
//	        ConnectionDB.pool.releaseConnection(con);
//
//	    }

//	    public static void updateBillDetail(String idBillDetail, int quantityBuy, String idBill, String idProduct, String idUser, String idPayment, int statusPayment) {
//	        String sql = "UPDATE `billdetail` SET quantityBuy = ?, idProduct = ?, idUser = ?, idPayment = ?, statusPayment = ? WHERE idBill = ? AND idBillDetail = ?";
//	        Connection con = null;
//	        try {
//	            con = ConnectionDB.connect();
//	            PreparedStatement pre = con.prepareStatement(sql);
//	            pre.setInt(1, quantityBuy);
//	            pre.setString(2, idProduct);
//	            pre.setString(3, idUser);
//	            pre.setString(4, idPayment);
//	            pre.setInt(5, statusPayment);
//	            pre.setString(6, idBill);
//	            pre.setString(7, idBillDetail);
//	            pre.executeUpdate();
//	        } catch (ClassNotFoundException e) {
//	            e.printStackTrace();
//	            System.out.print(e.getMessage());
//	            ConnectionDB.pool.releaseConnection(con);
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	            System.out.print(e.getMessage());
//	            ConnectionDB.pool.releaseConnection(con);
//	        }
//	        ConnectionDB.pool.releaseConnection(con);
//	    }

	    public static void main(String[] args) {
//	        for (Bill bill : getAllBill()) {
//	            System.out.println(bill.getListProduct().size());
//	        }
//	    	System.out.println(getBillById("#BILL1000"));
	        insertBillAndBillDetail("B8", Date.valueOf(LocalDate.now()), 500, "ST0001", "BD8", 20, "SP00055", "#000145", "PM0001", 1);
//	        updateBillAndBillDetail("B8", Date.valueOf(LocalDate.now()), 600, "ST0001", "BD8", 30, "SP00055", "#000145", "PM0001", 1);
//	        removeBillAndBillDetail("B8");
	    }

	
	
}
