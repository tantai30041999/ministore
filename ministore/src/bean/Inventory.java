package bean;

import java.sql.Date;
import java.util.ArrayList;

public class Inventory {
	private String idInventory;
	private Date createDate;
	private double grossProceed;
	private double cost;
	private double revenue;
	private ArrayList<Bill> listBill;
	private Stock stock;

	public Inventory(String idInventory, Date createDate, double grossProceed, double cost, double revenue,
			ArrayList<Bill> listBill, Stock stock) {
		super();
		this.idInventory = idInventory;
		this.createDate = createDate;
		this.grossProceed = grossProceed;
		this.cost = cost;
		this.revenue = revenue;
		this.listBill = listBill;
		this.stock = stock;
	}

	public String getIdInventory() {
		return idInventory;
	}

	public void setIdInventory(String idInventory) {
		this.idInventory = idInventory;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public double getGrossProceed() {
		return grossProceed;
	}

	public void setGrossProceed(double grossProceed) {
		this.grossProceed = grossProceed;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public ArrayList<Bill> getListBill() {
		return listBill;
	}

	public void setListBill(ArrayList<Bill> listBill) {
		this.listBill = listBill;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	

}
