package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Product;
import db.ConnectionDB;

public class ProductDAO {
	 public static int productDisplay = 10;

	 
	 public static int countProductByIdSupplier(String idSupplier) throws ClassNotFoundException, SQLException {
		 int count  = 0;
		 String sql = "select count(*)  as countProduct from product where idSupplier=?";
		 Connection con = null;
		 con = ConnectionDB.connect();
		 
		 PreparedStatement pre = con.prepareStatement(sql);
		 pre.setString(1, idSupplier);
		 ResultSet rs= pre.executeQuery();
		 while(rs.next()) {
			 count = rs.getInt("countProduct");
		 }
		 
		 ConnectionDB.pool.releaseConnection(con);
		 return count;
	 }
	 public static ArrayList<Product> getListByFilter(int filter) throws ClassNotFoundException, SQLException {
		 String sql ="SELECT * FROM product  AS p INNER JOIN typeproduct AS tp ON p.idType = tp.idType where activity = 0  order by quantityInStock desc limit ?";
		 ArrayList<Product> list =  null;
		 Connection con = null;
		 
		 
		   con = ConnectionDB.connect();
           PreparedStatement pre = con.prepareStatement(sql);
           pre.setInt(1, filter);
           ResultSet rs = pre.executeQuery();
           list = new ArrayList<Product>();
           while (rs.next()) {
               String idProduct = rs.getString("idProduct");
               String nameProduct = rs.getString("nameProduct");
               double price = rs.getInt("priceProduct");
               double sale = rs.getDouble("sale");
               int quantitySell = rs.getInt("quantitySell");
               int quantityInStock = rs.getInt("quantityInStock");
               String image = rs.getString("image");
               String typeProduct = rs.getString("typeName");
               Date expiration = rs.getDate("expiration");
               boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
               double VAT = rs.getDouble("VAT");
               boolean activity =rs.getInt("activity")==1 ? true: false;
               list.add(new Product(idProduct, nameProduct, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
				 
           } 
		 
           ConnectionDB.pool.releaseConnection(con);
		 return list;
	 }
	 

	 
	 
	 
	 public static boolean updateProductAfterSale(String idProduct, int quantityPurchare) {
		 String sql = "UPDATE product set quantitySell=? where idProduct=?";
		 Product p = getProductById(idProduct);
	    	Connection con = null;
	    	
	    	
	    	try {
				con = ConnectionDB.connect();
				PreparedStatement pre = con.prepareStatement(sql);
				int updateQuantitySale = p.getQuantitySale() - quantityPurchare;
				if(updateQuantitySale < 0) {
					return false;
				}
				pre.setInt(1, updateQuantitySale);
				pre.setString(2, idProduct);
			
				
				int update = pre.executeUpdate();
				if(update == 1) {
					return true;
				}
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				  ConnectionDB.pool.releaseConnection(con);
			}
	    	return false;
	 }
	 public static boolean checkExist(String idProduct, ArrayList<Product> listProduct) {
		 for(Product p : listProduct) {
			 if(p.getIdProduct().equals(idProduct)) {
				return true;
				
			 }
		 }
		 return false;
	 }
	
	 public static ArrayList<Product> deleteProductFromCart(String status ,ArrayList<Product> cart) {
		   ArrayList<Product> cartClone = new ArrayList<Product>();
		   cartClone = (ArrayList<Product>) cart.clone();
		 if(status.equals("removeAll")) {
			   cartClone.clear();
		 }else {
			   Iterator<Product> i = cartClone.iterator();
			   while(i.hasNext()) {
				   Product p = i.next();
				   if(p.getIdProduct().equals(status)) {
					   i.remove();
				   }
			   }
		 }
		
		 return cartClone;
		
	 }
	 
	 public static ArrayList<Product> increateQuantityPurches(String idProduct, ArrayList<Product> listProduct) {
		
		 for(Product p : listProduct) {
			 if(p.getIdProduct().equals(idProduct)) {
				 int priceDf = getPriceById(idProduct);
				  System.out.println(priceDf+"ABCDDD");
				 p.setQuantityPurchase(p.getQuantityPurchase()+1);
				 p.setPrice(p.getQuantityPurchase()*priceDf);
				 
				break;
			 }
		 }
		 return listProduct;
		
	 }
	 public static  int getPriceById(String idProduct) {
		 for(Product p : getAllProductSale()) {
			 if(p.getIdProduct().equals(idProduct)) {
				 return (int) p.getPrice();
			 }
 		 }
		 return 0;
	 }
	 public static List<Product> getAllProductInStock() {
		  String sql = "SELECT * FROM `product` AS p INNER JOIN typeproduct AS tp ON p.idType = tp.idType where activity=0";
	        Connection con = null;
	        List<Product> listProduct = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            listProduct = new ArrayList<Product>();
	            while (rs.next()) {
	                String idProduct = rs.getString("idProduct");
	                String nameProduct = rs.getString("nameProduct");
	                double price = rs.getInt("priceProduct");
	                double sale = rs.getDouble("sale");
	                int quantitySell = rs.getInt("quantitySell");
	                int quantityInStock = rs.getInt("quantityInStock");
	                String image = rs.getString("image");
	                String typeProduct = rs.getString("typeName");
	                Date expiration = rs.getDate("expiration");
	                boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
	                double VAT = rs.getDouble("VAT");
	                boolean activity =rs.getInt("activity")==1 ? true: false;
	                listProduct.add(new Product(idProduct, nameProduct, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
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
	        return listProduct;
	 }
	 
	
	 public static List<Product> getAllProductSale() {
		  String sql = "SELECT * FROM `product` AS p INNER JOIN typeproduct AS tp ON p.idType = tp.idType where activity=1";
	        Connection con = null;
	        List<Product> listProduct = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            listProduct = new ArrayList<Product>();
	            while (rs.next()) {
	                String idProduct = rs.getString("idProduct");
	                String nameProduct = rs.getString("nameProduct");
	                double price = rs.getInt("priceProduct");
	                double sale = rs.getDouble("sale");
	                int quantitySell = rs.getInt("quantitySell");
	                int quantityInStock = rs.getInt("quantityInStock");
	                String image = rs.getString("image");
	                String typeProduct = rs.getString("typeName");
	                Date expiration = rs.getDate("expiration");
	                boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
	                double VAT = rs.getDouble("VAT");
	                boolean activity =rs.getInt("activity")==1 ? true: false;
	                listProduct.add(new Product(idProduct, nameProduct, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
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
	        return listProduct;
	 }
	    public static List<Product> getAllProduct() {
	        String sql = "SELECT * FROM `product` AS p INNER JOIN typeproduct AS tp ON p.idType = tp.idType";
	        Connection con = null;
	        List<Product> listProduct = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            ResultSet rs = pre.executeQuery();
	            listProduct = new ArrayList<Product>();
	            while (rs.next()) {
	                String idProduct = rs.getString("idProduct");
	                String nameProduct = rs.getString("nameProduct");
	                double price = rs.getInt("priceProduct");
	                double sale = rs.getDouble("sale");
	                int quantitySell = rs.getInt("quantitySell");
	                int quantityInStock = rs.getInt("quantityInStock");
	                String image = rs.getString("image");
	                String typeProduct = rs.getString("typeName");
	                Date expiration = rs.getDate("expiration");
	                boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
	                double VAT = rs.getDouble("VAT");
	                boolean activity =rs.getInt("activity")==1 ? true: false;
	                listProduct.add(new Product(idProduct, nameProduct, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
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
	        return listProduct;
	    }

	    public static List<Product> getListProducSaletByName(String nameProduct) {
	    	String sql ="select * FROM product AS p JOIN typeproduct AS tp ON p.idType = tp.idType  where activity=? and  nameProduct like?";
	    	Connection con = null;
	    	Product product = null;
	    	ArrayList<Product> list = null;
	    	try {
				con = ConnectionDB.connect();
				PreparedStatement pre = con.prepareStatement(sql);
				pre.setInt(1, 1);
				pre.setString(2, nameProduct+"%");
				ResultSet rs = pre.executeQuery();
				list = new ArrayList<Product>();
				  while (rs.next()) {
		                String idProduct = rs.getString("idProduct");
		                String nameP = rs.getString("nameProduct");
		                double price = rs.getInt("priceProduct");
		                double sale = rs.getDouble("sale");
		                int quantitySell = rs.getInt("quantitySell");
		                int quantityInStock = rs.getInt("quantityInStock");
		                String image = rs.getString("image");
		                String typeProduct = rs.getString("typeName");
		                Date expiration = rs.getDate("expiration");
		                boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
		                double VAT = rs.getDouble("VAT");
		                boolean activity =rs.getInt("activity")==1 ? true: false;
		                list.add(new Product(idProduct, nameP, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
		            }
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 ConnectionDB.pool.releaseConnection(con);
			}
	    	 ConnectionDB.pool.releaseConnection(con);
	    	return list;
	    			
	    			
	    }
	    
	    
	    public static List<Product> getListProductByName(String nameProduct) {
	    	String sql ="select * FROM product AS p JOIN typeproduct AS tp ON p.idType = tp.idType  where  nameProduct like?";
	    	Connection con = null;
	    	Product product = null;
	    	ArrayList<Product> list = null;
	    	try {
				con = ConnectionDB.connect();
				PreparedStatement pre = con.prepareStatement(sql);
				pre.setString(1, nameProduct+"%");
				ResultSet rs = pre.executeQuery();
				list = new ArrayList<Product>();
				  while (rs.next()) {
		                String idProduct = rs.getString("idProduct");
		                String nameP = rs.getString("nameProduct");
		                double price = rs.getInt("priceProduct");
		                double sale = rs.getDouble("sale");
		                int quantitySell = rs.getInt("quantitySell");
		                int quantityInStock = rs.getInt("quantityInStock");
		                String image = rs.getString("image");
		                String typeProduct = rs.getString("typeName");
		                Date expiration = rs.getDate("expiration");
		                boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
		                double VAT = rs.getDouble("VAT");
		                boolean activity =rs.getInt("activity")==1 ? true: false;
		                list.add(new Product(idProduct, nameP, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
		            }
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 ConnectionDB.pool.releaseConnection(con);
			}
	    	 ConnectionDB.pool.releaseConnection(con);
	    	return list;
	    			
	    			
	    }

	    public static Product getProductById(String idProduct) {
	        String sql = "SELECT * FROM `product` AS p INNER JOIN typeproduct AS tp ON p.idType = tp.idType WHERE p.idProduct = ?";
	        Connection con = null;
	        Product product = new Product();
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idProduct);
	            ResultSet rs = pre.executeQuery();
	            rs.last();
	            product.setIdProduct(idProduct);
	            product.setNameProduct(rs.getString("nameProduct"));
	            product.setPrice(rs.getInt("priceProduct"));
	            product.setQuantitySale(rs.getInt("quantitySell"));
	            product.setQuantityInStock(rs.getInt("quantityInStock"));
	            product.setSale(rs.getDouble("sale"));
	            product.setImage(rs.getString("image"));
	            product.setTypeProduct(rs.getString("typeName"));
	            product.setExpiration(rs.getDate("expiration"));
	            product.setActive(((rs.getInt("activeProduct") == 1) ? true : false));
	            product.setVAT(rs.getDouble("VAT"));
	            product.setActivity(((rs.getInt("activity")==1 )? true: false));
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
	        return product;
	    }

	    public static List<Product> getListProductPage(int indexPage) {
	        if (indexPage < 1) indexPage = 1;
	        indexPage = (indexPage - 1) * productDisplay;
	        String sql = "SELECT * FROM `product` AS p INNER JOIN typeproduct AS tp ON p.idType = tp.idType where activity = 1  LIMIT ?,";
	        sql += productDisplay;
	        Connection con = null;
	        List<Product> listProduct = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setInt(1, indexPage);
	            ResultSet rs = pre.executeQuery();
	            listProduct = new ArrayList<Product>();
	            while (rs.next()) {
	                String idProduct = rs.getString("idProduct");
	                String nameProduct = rs.getString("nameProduct");
	                double price = rs.getInt("priceProduct");
	                int quantitySell = rs.getInt("quantitySell");
	                int quantityInStock = rs.getInt("quantityInStock");
	                double sale = rs.getDouble("sale");             
	                String image = rs.getString("image");
	                String typeProduct = rs.getString("typeName");
	                Date expiration = rs.getDate("expiration");
	                boolean active = ((rs.getInt("activeProduct") == 1) ? true : false);
	                double VAT = rs.getDouble("VAT");
	                boolean activity =rs.getInt("activity")==1 ? true: false;
	                listProduct.add(new Product(idProduct, nameProduct, price,quantitySell,quantityInStock, sale, image, typeProduct, expiration, active, VAT,activity));
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
	        return listProduct;
	    }

	    public static int numberOfPage() {
	        int result = (ProductDAO.getAllProductSale().size() / productDisplay) + 1;
	        return result;
	    }

	    public static void insertProduct(String idProduct, String nameProduct, int priceProduct, int quantityInStock, int quantitySell, Date expiration, int activeProduct, double VAT, double sale, String image, String idSupplier, String idStore, String idType,int activity) {
	        String sql = "INSERT INTO `product` VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idProduct);
	            pre.setString(2, nameProduct);
	            pre.setInt(3, priceProduct);
	            pre.setInt(4, quantityInStock);
	            pre.setInt(5, quantitySell);
	            pre.setDate(6, expiration);
	            pre.setInt(7, activeProduct);
	            pre.setDouble(8, VAT);
	            pre.setDouble(9, sale);
	            pre.setString(10, image);
	            pre.setString(11, idSupplier);
	            pre.setString(12, idStore);
	            pre.setString(13, idType);
	            pre.setInt(14, activity);
	            
	            pre.executeUpdate();
	            System.out.println("Thêm thành công");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	    }

	    public static void removeProduct(String idProduct) {
	        String sql = "DELETE FROM `product` WHERE idProduct = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, idProduct);
	            pre.executeUpdate();
	            System.out.println("Xóa thành công");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	    }
	    public static boolean updateProductSale(String idProduct , int quantitiInStock , int quantitySell, int activity) {
	    	String sql = "UPDATE product set quantityInStock=?, quantitySell=?, activity=? where idProduct=?";
	    	Connection con = null;
	    	
	    	try {
				con = ConnectionDB.connect();
				PreparedStatement pre = con.prepareStatement(sql);
				pre.setInt(1, quantitiInStock);
				pre.setInt(2, quantitySell);
				pre.setInt(3, activity);
				pre.setString(4, idProduct);
				
				int update = pre.executeUpdate();
				if(update == 1) {
					return true;
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				  ConnectionDB.pool.releaseConnection(con);
			}
	    	return false;
	    }

	    public static void updateProduct(String idProduct, String nameProduct, int priceProduct, int quantityInStock, int quantitySell, Date expiration, int activeProduct, double VAT, double sale, String image, String idSupplier, String idStore, String idType,int activity) {
	        String sql = "UPDATE `product` SET nameProduct = ?, priceProduct = ?, quantityInStock = ?, quantitySell = ?, expiration = ?, activeProduct = ?, VAT = ?, sale = ?, image = ?, idSupplier = ?, idStore = ?, idType = ?, activity =? WHERE idProduct = ?";
	        Connection con = null;
	        try {
	            con = ConnectionDB.connect();
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, nameProduct);
	            pre.setInt(2, priceProduct);
	            pre.setInt(3, quantityInStock);
	            pre.setInt(4, quantitySell);
	            pre.setDate(5, expiration);
	            pre.setInt(6, activeProduct);
	            pre.setDouble(7, VAT);
	            pre.setDouble(8, sale);
	            pre.setString(9, image);
	            pre.setString(10, idSupplier);
	            pre.setString(11, idStore);
	            pre.setString(12, idType);
	            pre.setInt(13, activity);
	            pre.setString(14, idProduct);
	            
	            pre.executeUpdate();
	            System.out.println("Cập nhập thành công");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.print(e.getMessage());
	            ConnectionDB.pool.releaseConnection(con);
	        }
	    }
	    public static int countTypeProduct() {
	    	String sql = "select count(distinct idType) as sumTypeProduct from product;";
	    	int count = 0;
	    	Connection con = null;
	    	try {
				con = ConnectionDB.connect();
				PreparedStatement pre = con.prepareStatement(sql);
				ResultSet rs= pre.executeQuery();
				rs.last();
				count = Integer.parseInt(rs.getString("sumTypeProduct"));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 ConnectionDB.pool.releaseConnection(con);
			}
	    	 ConnectionDB.pool.releaseConnection(con);
	    	return count;
	    }
	    public static int countProductInStock(int range) {
	    	int count = 0;
	    	String sql ="select count(*) as sumProductInStock from product  where quantityInStock > ?";
	    	Connection con = null;
	    	try {
				con = ConnectionDB.connect();
				PreparedStatement pre = con.prepareStatement(sql);
				pre.setInt(1, range);
				ResultSet rs = pre.executeQuery();
				rs.last();
				
				count = Integer.parseInt(rs.getString("sumProductInStock"));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 ConnectionDB.pool.releaseConnection(con);
			}
	    	 ConnectionDB.pool.releaseConnection(con);
	    	return count;
	    }
	    
	    public static int[] getLimitePage(int pageCurrent) {
	    	int min = 1;
	    	int max = numberOfPage();
	    	
	    	int[] indexPage = new int[3];
	    	
	    	if(pageCurrent == min) {
	    		indexPage[0] = pageCurrent; // page first
	    		
	    		for(int i = 1;i < indexPage.length;i++) {
	    			 indexPage[i] = ++min;
	    		}
	    				
	    	}else if(pageCurrent == max) {
	    		indexPage[2] = pageCurrent; // page final;
	    		for(int i = indexPage.length-1; i>=0; i--) {
	    			indexPage[i] = --max;
	    		}
	    		
	    	}else {
	    		indexPage[1] = pageCurrent; // page center;
	    		indexPage[0] = pageCurrent -1;
	    		indexPage[2] = pageCurrent +1;
	    		
	    		
	    	}
	    	return indexPage;
	    	
	    
	    	
	    }


	    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    	
	
	    	System.out.println(countProductByIdSupplier("NCC0044"));
//	    	int [] x= getLimitePage(10);
//	    	for(Integer i : x) {
//	    		System.out.println(i);
//	    	}
	    	
//	    	System.out.println(getPriceById("SP00001"));
//	    	System.out.println(updateProductSale("SP00001", 0, 34,1));
//	    	for(Product p :getListByFilter(5)) {
//	    		System.out.println(p.getIdProduct());
//	    	}
//	    	System.out.println(getAllProductInStock().size());
	        
//	        System.out.println(numberOfPage());
	    	
//	        insertProduct("SP00101","Hello",50000,100,25,Date.valueOf(LocalDate.now()),1,0.0,0.0,"","NCC0053","ST0001","TYPE0008",1);
//	        removeProduct("SP00101");
//	    	System.out.println(countProductInStock(0));
         
//	        updateProduct("SP00101","Hello World",50000,100,25,Date.valueOf(LocalDate.now()),1,0.0,0.0,"","NCC0053","ST0001","TYPE0008",1);
//	        System.out.println(localDate);
	    }

}
