package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.search;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.CommonsFieldsBO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CertificateBO extends CommonsFieldsBO{

    private Integer certificado;
    private String placa;
    private Double montoPrima;

    public Integer getCertificado() {return certificado;}
    public void setCertificado(Integer certificado) {this.certificado = certificado;}
    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}
    public Double getMontoPrima() {return montoPrima;}
    public void setMontoPrima(Double montoPrima) {this.montoPrima = montoPrima;}

}
