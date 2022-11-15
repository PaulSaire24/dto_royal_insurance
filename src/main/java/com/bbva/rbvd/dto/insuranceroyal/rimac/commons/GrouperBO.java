package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import java.util.List;

public class GrouperBO extends CommonsFieldsBO {
	
    private String nombreAgrupador;
    private String descripcionAgrupador;
    private List<Integer> porcentajes;

	public String getNombreAgrupador() {return nombreAgrupador;}
    public void setNombreAgrupador(String nombreAgrupador) {this.nombreAgrupador = nombreAgrupador;}
    public String getDescripcionAgrupador() {return descripcionAgrupador;}
    public void setDescripcionAgrupador(String descripcionAgrupador) {this.descripcionAgrupador = descripcionAgrupador;}
    public List<Integer> getPorcentajes() {return porcentajes;}
    public void setPorcentajes(List<Integer> porcentajes) {this.porcentajes = porcentajes;}

}
