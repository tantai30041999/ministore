package bean;

import java.sql.Date;

public class Product {
	private String idProduct;
	private String nameProduct;
	private double price;
	private int quantitySale;
	private int quantityInStock;
	private double sale;
	private String image;
	private String typeProduct;
	private Date expiration;
	private boolean active;
	private double VAT;
	private boolean activity;
	private int quantityPurchase;
	private String idSupplier;

	public Product() {

	}

	public String getIdSupplier() {
		return idSupplier;
	}

	public void setIdSupplier(String idSupplier) {
		this.idSupplier = idSupplier;
	}

	public Product(String idProduct, String nameProduct, double price, int quantitySale, int quantityInStock,
			double sale, String image, String typeProduct, Date expiration, boolean active, double vAT,
			boolean activity, String idSupplier) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.quantitySale = quantitySale;
		this.quantityInStock = quantityInStock;
		this.sale = sale;
		this.image = image;
		this.typeProduct = typeProduct;
		this.expiration = expiration;
		this.active = active;
		VAT = vAT;
		this.activity = activity;
	
		this.idSupplier = idSupplier;
	}

	public Product(String idProduct, String nameProduct, double price, int quantitySale, int quantityInStock,
			double sale, String image, String typeProduct, Date expiration, boolean active, double vAT,
			boolean activity, int quantityPurchase) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.quantitySale = quantitySale;
		this.quantityInStock = quantityInStock;
		this.sale = sale;
		this.image = image;
		this.typeProduct = typeProduct;
		this.expiration = expiration;
		this.active = active;
		VAT = vAT;
		this.activity = activity;
		this.quantityPurchase = quantityPurchase;
	}

	public Product(String idProduct, String nameProduct, double price, int quantitySale, int quantityInStock,
			double sale, String image, String typeProduct, Date expiration, boolean active, double vAT,
			boolean activity) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.quantitySale = quantitySale;
		this.quantityInStock = quantityInStock;
		this.sale = sale;
		this.image = image;
		this.typeProduct = typeProduct;
		this.expiration = expiration;
		this.active = active;
		VAT = vAT;
		this.activity = activity;
	}

	public boolean isActivity() {
		return activity;
	}

	public int getQuantityPurchase() {
		return quantityPurchase;
	}

	public void setQuantityPurchase(int quantityPurchase) {
		this.quantityPurchase = quantityPurchase;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTypeProduct() {
		return typeProduct;
	}

	public void setTypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getQuantitySale() {
		return quantitySale;
	}

	public void setQuantitySale(int quantitySale) {
		this.quantitySale = quantitySale;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double vAT) {
		VAT = vAT;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", price=" + price
				+ ", quantitySale=" + quantitySale + ", quantityInStock=" + quantityInStock + ", sale=" + sale
				+ ", image=" + image + ", typeProduct=" + typeProduct + ", expiration=" + expiration + ", active="
				+ active + ", VAT=" + VAT + ", activity=" + activity + ", quantityPurchase=" + quantityPurchase
				+ ", idSupplier=" + idSupplier + "]";
	}



}
