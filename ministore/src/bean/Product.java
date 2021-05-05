package bean;

import java.sql.Date;

public class Product {
	private String idProduct;
	private String nameProduct;
	private double price;
	private double sale;
	private String image;
	private String typeProduct;
	private Date expiration;
	private boolean active;

	public Product() {
		
	}
	public Product(String idProduct, String nameProduct, double price, double sale, String image, String typeProduct,
			Date expiration, boolean active) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.sale = sale;
		this.image = image;
		this.typeProduct = typeProduct;
		this.expiration = expiration;
		this.active = active;
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
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", price=" + price + ", sale="
				+ sale + ", image=" + image + ", typeProduct=" + typeProduct + ", expiration=" + expiration
				+ ", active=" + active + "]";
	}
	

}
