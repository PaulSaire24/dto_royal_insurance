package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancingBO extends CommonsFieldsBO {

    private Integer numeroCuotas;
    private String indicadorDescuentoPrima;
    private String fechaFinal;
    private List<FinancingQuotaBO> cuotasFinanciamiento;
    
    public Integer getNumeroCuotas() {return numeroCuotas;}
    public void setNumeroCuotas(Integer numeroCuotas) {this.numeroCuotas = numeroCuotas;}
    public String getIndicadorDescuentoPrima() {return indicadorDescuentoPrima;}
    public void setIndicadorDescuentoPrima(String indicadorDescuentoPrima) {this.indicadorDescuentoPrima = indicadorDescuentoPrima;}
    public String getFechaFinal() {return fechaFinal;}
    public void setFechaFinal(String fechaFinal) {this.fechaFinal = fechaFinal;}
    public List<FinancingQuotaBO> getCuotasFinanciamiento() {return cuotasFinanciamiento;}
    public void setCuotasFinanciamiento(List<FinancingQuotaBO> cuotasFinanciamiento) {this.cuotasFinanciamiento = cuotasFinanciamiento;}

}
