package bean;

import java.sql.Date;
import java.util.List;

public class Import {
	  private String idImport;
	    private Date importDate;
	    private double totalCost;
	    private boolean statusPayment;
	    private List<Detail> importDetail;

	    public Import(){

	    }
	    public Import(String idImport, Date importDate, double totalCost, boolean statusPayment, List<Detail> importDetail) {
	        super();
	        this.idImport = idImport;
	        this.importDate = importDate;
	        this.totalCost = totalCost;
	        this.statusPayment = statusPayment;
	        this.importDetail = importDetail;
	    }

	    public String getIdImport() {
	        return idImport;
	    }

	    public void setIdImport(String idImport) {
	        this.idImport = idImport;
	    }

	    public Date getImportDate() {
	        return importDate;
	    }

	    public void setImportDate(Date importDate) {
	        this.importDate = importDate;
	    }

	    public double getTotalCost() {
	        return totalCost;
	    }

	    public void setTotalCost(double totalCost) {
	        this.totalCost = totalCost;
	    }

	    public boolean isStatusPayment() {
	        return statusPayment;
	    }

	    public void setStatusPayment(boolean statusPayment) {
	        this.statusPayment = statusPayment;
	    }

	    public List<Detail> getImportDetail() {
	        return importDetail;
	    }

	    public void setImportDetail(List<Detail> importDetail) {
	        this.importDetail = importDetail;
	    }

	    @Override
	    public String toString() {
	        return "Import{" +
	                "idImport='" + idImport + '\'' +
	                ", importDate=" + importDate +
	                ", totalCost=" + totalCost +
	                ", statusPayment=" + statusPayment +
	                ", importDetail=" + importDetail.toString() +
	                '}';
	    }
	
}
