package bean;

public class Supplier {
    private String idSupplier;
    private String nameSupplier;
    private String address;
    private String phoneNumber;
    private String email;
    private String idStore;
    public Supplier () {
    	
    }
	public Supplier( String nameSupplier, String address, String phoneNumber, String email,String idStore) {
		this.nameSupplier = nameSupplier;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.idStore = idStore;
	}
	public Supplier(String idSupplier, String nameSupplier, String address, String phoneNumber, String email,String idStore) {
		super();
		this.idSupplier = idSupplier;
		this.nameSupplier = nameSupplier;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.idStore = idStore;
	}
	public String getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(String idSupplier) {
		this.idSupplier = idSupplier;
	}
	public String getNameSupplier() {
		return nameSupplier;
	}
	public void setNameSupplier(String nameSupplier) {
		this.nameSupplier = nameSupplier;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdStore() {
		return idStore;
	}
	public void setIdStore(String idStore) {
		this.idStore = idStore;
	}
	@Override
	public String toString() {
		return "Supplier [idSupplier=" + idSupplier + ", nameSupplier=" + nameSupplier + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", idStore=" + idStore + "]";
	}
	
    
}
