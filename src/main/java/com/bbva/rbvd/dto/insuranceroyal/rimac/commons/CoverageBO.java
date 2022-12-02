package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverageBO extends CommonsFieldsBO {

    private Integer codigoCobertura;
    private String porcentaje;
    private Integer idCobertura;
    private String descripcionCobertura;
    private Boolean isPrincipal;
    private String condicion;
    private GrouperBO agrupador;
    private String observacionCobertura;
	private String periodoEvento;
    private String porcentajeSeleccionado;
    private String tipoCobertura;

    public Integer getCodigoCobertura() {return codigoCobertura;}
    public void setCodigoCobertura(Integer codigoCobertura) {this.codigoCobertura = codigoCobertura;}
    public String getPorcentaje() {return porcentaje;}
    public void setPorcentaje(String porcentaje) {this.porcentaje = porcentaje;}
    public Integer getIdCobertura() {return idCobertura;}
    public void setIdCobertura(Integer idCobertura) {this.idCobertura = idCobertura;}
    public String getDescripcionCobertura() {return descripcionCobertura;}
    public void setDescripcionCobertura(String descripcionCobertura) {this.descripcionCobertura = descripcionCobertura;}
    public Boolean getIsPrincipal() { return isPrincipal; }
    public void setIsPrincipal(Boolean principal) { isPrincipal = principal; }

    public String getObservacionCobertura() {return observacionCobertura;}
    public void setObservacionCobertura(String observacionCobertura) {this.observacionCobertura = observacionCobertura;}
    public String getPeriodoEvento() {return periodoEvento;}
    public void setPeriodoEvento(String periodoEvento) {this.periodoEvento = periodoEvento;}
    public String getCondicion() {return condicion;}
    public void setCondicion(String condicion) {this.condicion = condicion;}
    public String getPorcentajeSeleccionado() {return porcentajeSeleccionado;}
    public void setPorcentajeSeleccionado(String porcentajeSeleccionado) {this.porcentajeSeleccionado = porcentajeSeleccionado;}
    public String getTipoCobertura() { return tipoCobertura; }
    public void setTipoCobertura(String tipoCobertura) { this.tipoCobertura = tipoCobertura; }
    public GrouperBO getAgrupador() {return agrupador;}
    public void setAgrupador(GrouperBO agrupador) {this.agrupador = agrupador;}

}
