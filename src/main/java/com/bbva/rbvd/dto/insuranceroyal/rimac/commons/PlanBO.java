package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

public class PlanBO extends CommonsFieldsBO{

    private Integer idPlan;
    private String descripcionPlan;
    private String indicadorInspeccion;
    private List<FinancingBO> financiamientos            ;
    private List<ServiceBO> servicios;
    private List<DeductibleBO> deducibles;
    private Integer plan;
    private List<ClausesBO> clausulas;
    private String indicadorRecomendado;
    @JsonIgnore
    private List<String> exclusiones;
    

    public List<ClausesBO> getClausulas() {return clausulas;}
	public void setClausulas(List<ClausesBO> clausulas) {this.clausulas = clausulas;}
	public Integer getIdPlan() {return idPlan;}
    public void setIdPlan(Integer idPlan) {this.idPlan = idPlan;}
    public String getDescripcionPlan() {return descripcionPlan;}
    public void setDescripcionPlan(String descripcionPlan) {this.descripcionPlan = descripcionPlan;}
    public String getIndicadorInspeccion() {return indicadorInspeccion;}
    public void setIndicadorInspeccion(String indicadorInspeccion) {this.indicadorInspeccion = indicadorInspeccion;}
    public List<FinancingBO> getFinanciamientos() {return financiamientos;}
    public void setFinanciamientos(List<FinancingBO> financiamientos) {this.financiamientos = financiamientos;}
    public List<ServiceBO> getServicios() {return servicios;}
    public void setServicios(List<ServiceBO> servicios) {this.servicios = servicios;}
    public List<DeductibleBO> getDeducibles() {return deducibles;}
    public void setDeducibles(List<DeductibleBO> deducibles) {this.deducibles = deducibles;}
    public List<String> getExclusiones() {return exclusiones;}
    public void setExclusiones(List<String> exclusiones) {this.exclusiones = exclusiones;}
    public Integer getPlan() { return plan; }
    public void setPlan(Integer plan) { this.plan = plan; }
    public String getIndicadorRecomendado() {return indicadorRecomendado;}
    public void setIndicadorRecomendado(String indicadorRecomendado) {this.indicadorRecomendado = indicadorRecomendado;}

}
