package bean;

import java.sql.Date;

public class Export {
	private String idExport;
	private String season;
	private Date exportDate;
	private Detail exportDetail;

	public Export(String idExport,String season, Date exportDate, Detail exportDetail) {
		super();
		this.idExport = idExport;
		this.season = season;
		this.exportDate = exportDate;
		this.exportDate = exportDate;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
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

	public Detail getExportDetail() {
		return exportDetail;
	}

	public void setExportDetail(Detail exportDetail) {
		this.exportDetail = exportDetail;
	}
	

}
