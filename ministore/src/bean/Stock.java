package bean;

import java.util.ArrayList;

public class Stock {

	private ArrayList<Product> listProduct;

	public Stock(ArrayList<Product> listProduct) {
		super();
		this.listProduct = listProduct;
	}

	public ArrayList<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(ArrayList<Product> listProduct) {
		this.listProduct = listProduct;
	}
	
	
}
