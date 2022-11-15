package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

public class DeductibleBO {

    private Integer idDeducible;
    private Integer idComponente;
    private String descripcionDeducible;
    private String descripcion;
    
    public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	public Integer getIdDeducible() {return idDeducible;}
    public void setIdDeducible(Integer idDeducible) {this.idDeducible = idDeducible;}
    public Integer getIdComponente() {return idComponente;}
    public void setIdComponente(Integer idComponente) {this.idComponente = idComponente;}
    public String getDescripcionDeducible() {return descripcionDeducible;}
    public void setDescripcionDeducible(String descripcionDeducible) {this.descripcionDeducible = descripcionDeducible;}


}
