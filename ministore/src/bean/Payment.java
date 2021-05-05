package bean;

public class Payment {
    private String idPayment;
    private String namePayment;
	public Payment(String idPayment, String namePayment) {
		super();
		this.idPayment = idPayment;
		this.namePayment = namePayment;
	}
	public String getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}
	public String getNamePayment() {
		return namePayment;
	}
	public void setNamePayment(String namePayment) {
		this.namePayment = namePayment;
	}
    
}
