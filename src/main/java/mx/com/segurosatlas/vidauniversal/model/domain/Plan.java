package mx.com.segurosatlas.vidauniversal.model.domain;

import java.io.Serializable;

public class Plan implements Serializable{
	
	private static final long serialVersionUID = -7399973537895562503L;
	
	private Integer cveLinea;	
	private Integer cvePlan;
	
	private String descripcion;
	private String descripcionC;
	private Integer tasaFinanc;
	private Integer tablaMortal;
	private Integer tablaEdadesEq;
	
	
	public Integer getCveLinea() {
		return cveLinea;
	}
	public void setCveLinea(Integer cveLinea) {
		this.cveLinea = cveLinea;
	}
	public Integer getCvePlan() {
		return cvePlan;
	}
	public void setCvePlan(Integer cvePlan) {
		this.cvePlan = cvePlan;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionc() {
		return descripcionC;
	}
	public void setDescripcionc(String descripcionc) {
		this.descripcionC = descripcionc;
	}
	public Integer getTasaFinanc() {
		return tasaFinanc;
	}
	public void setTasaFinanc(Integer tasaFinanc) {
		this.tasaFinanc = tasaFinanc;
	}
	public Integer getTablaMortal() {
		return tablaMortal;
	}
	public void setTablaMortal(Integer tablaMortal) {
		this.tablaMortal = tablaMortal;
	}
	public Integer getTablaEdadesEq() {
		return tablaEdadesEq;
	}
	public void setTablaEdadesEq(Integer tablaEdadesEq) {
		this.tablaEdadesEq = tablaEdadesEq;
	}
	
	
	@Override
	public String toString() {
		return "Plan [cveLinea=" + cveLinea + ", cvePlan=" + cvePlan + ", descripcion=" + descripcion
				+ ", descripcionC=" + descripcionC + ", tasaFinanc=" + tasaFinanc + ", tablaMortal=" + tablaMortal
				+ ", tablaEdadesEq=" + tablaEdadesEq + "]";
	}
	
	
}
