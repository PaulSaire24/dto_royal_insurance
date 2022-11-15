package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancingQuotaBO extends CommonsFieldsBO {

    private Integer cuota;
    private BigDecimal monto;
    private String fechaVencimiento;

    public Integer getCuota() {return cuota;}
    public void setCuota(Integer cuota) {this.cuota = cuota;}
    public BigDecimal getMonto() {return monto;}
    public void setMonto(BigDecimal monto) {this.monto = monto;}
    public String getFechaVencimiento() {return fechaVencimiento;}
    public void setFechaVencimiento(String fechaVencimiento) {this.fechaVencimiento = fechaVencimiento;}

}
