package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationBO extends CommonsFieldsBO {

    private Integer diasVigencia;
    private String fechaInicioVigencia;
    private String fechaFinVigencia;
    private PlanBO plan;
    private String vigenciaPoliza;

    public Integer getDiasVigencia() {return diasVigencia;}
    public void setDiasVigencia(Integer diasVigencia) {this.diasVigencia = diasVigencia;}
    public String getFechaInicioVigencia() {return fechaInicioVigencia;}
    public void setFechaInicioVigencia(String fechaInicioVigencia) {this.fechaInicioVigencia = fechaInicioVigencia;}
    public String getFechaFinVigencia() {return fechaFinVigencia;}
    public void setFechaFinVigencia(String fechaFinVigencia) {this.fechaFinVigencia = fechaFinVigencia;}
    public PlanBO getPlan() {return plan;}
    public void setPlan(PlanBO plan) {this.plan = plan;}
    public String getVigenciaPoliza() {return vigenciaPoliza;}
    public void setVigenciaPoliza(String vigenciaPoliza) {this.vigenciaPoliza = vigenciaPoliza;}

}
