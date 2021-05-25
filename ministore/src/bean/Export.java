package bean;

import java.sql.Date;
import java.util.List;

public class Export {
	  private String idExport;
	    private String reason;
	    private Date exportDate;
	    private List<Detail> exportDetail;

	    public Export(){

	    }

	    public Export(String idExport, String reason, Date exportDate, List<Detail> exportDetail) {
	        super();
	        this.idExport = idExport;
	        this.reason = reason;
	        this.exportDate = exportDate;
	        this.exportDate = exportDate;
	    }

	    public String getReason() {
	        return reason;
	    }

	    public void setReason(String reason) {
	        this.reason = reason;
	    }

	    public String getIdExport() {
	        return idExport;
	    }

	    public void setIdExport(String idExport) {
	        this.idExport = idExport;
	    }

	    public Date getExportDate() {
	        return exportDate;
	    }

	    public void setExportDate(Date exportDate) {
	        this.exportDate = exportDate;
	    }

	    public List<Detail> getExportDetail() {
	        return exportDetail;
	    }

	    public void setExportDetail(List<Detail> exportDetail) {
	        this.exportDetail = exportDetail;
	    }


	    @Override
	    public String toString() {
	        return "Export{" +
	                "idExport='" + idExport + '\'' +
	                ", reason='" + reason + '\'' +
	                ", exportDate=" + exportDate +
	                ", exportDetail=" + exportDetail.toString() +
	                '}';
	    }

}
