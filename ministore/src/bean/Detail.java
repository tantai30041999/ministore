package bean;

public class Detail {

	 private String idProduct;
	    private int quantity;

	    public Detail(){

	    }

	    public Detail(String idProduct, int quantity) {
	        super();
	        this.idProduct = idProduct;
	        this.quantity = quantity;
	    }

	    public String getIdProduct() {
	        return idProduct;
	    }

	    public void setIdProduct(String idProduct) {
	        this.idProduct = idProduct;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "Detail{" +
	                "idProduct='" + idProduct + '\'' +
	                ", quantity=" + quantity +
	                '}';
	    }

}
