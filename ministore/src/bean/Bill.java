package bean;

import java.sql.Date;
import java.util.ArrayList;

public class Bill {
	private String idBill;
	private Date createDate;
	private double total;
	private boolean statusPayment;
	private String typePayment;
	private double VAT;
	public static ArrayList<Product> listProduct = new ArrayList<Product>();
	private User user;

	public Bill() {
		
	}
	public Bill(String idBill, Date createDate, double total, boolean statusPayment, String typePayment, double vAT,ArrayList<Product> listProduct, User user) {
		super();
		this.idBill = idBill;
		this.createDate = createDate;
		this.total = total;
		this.statusPayment = statusPayment;
		this.typePayment = typePayment;
		VAT = vAT;
		this.listProduct = listProduct;
		this.user = user;
	}

	public String getIdBill() {
		return idBill;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isStatusPayment() {
		return statusPayment;
	}

	public void setStatusPayment(boolean statusPayment) {
		this.statusPayment = statusPayment;
	}

	public String getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(String typePayment) {
		this.typePayment = typePayment;
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double vAT) {
		VAT = vAT;
	}

	public ArrayList<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(ArrayList<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Bill [idBill=" + idBill + ", createDate=" + createDate + ", total=" + total + ", statusPayment="
				+ statusPayment + ", typePayment=" + typePayment + ", VAT=" + VAT + ", user=" + user + "]";
	}
	
	

}
