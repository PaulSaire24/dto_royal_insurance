package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.search;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.bbva.rbvd.dto.insuranceroyal.rimac.commons.CommonsFieldsBO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadSearchInsrcBO extends CommonsFieldsBO{

    private String codProducto;
    private String numeroPoliza;
    private String desProducto;
    private Integer plan;
    private String desPlan;
    private String fechaFin;
    private List<CertificateBO> certificado;
    
    public String getCodProducto() {return codProducto;}
    public void setCodProducto(String codProducto) {this.codProducto = codProducto;}
    public String getNumeroPoliza() {return numeroPoliza;}
    public void setNumeroPoliza(String numeroPoliza) {this.numeroPoliza = numeroPoliza;}
    public String getDesProducto() {return desProducto;}
    public void setDesProducto(String desProducto) {this.desProducto = desProducto;}
    public Integer getPlan() {return plan;}
    public void setPlan(Integer plan) {this.plan = plan;}
    public String getDesPlan() {return desPlan;}
    public void setDesPlan(String desPlan) {this.desPlan = desPlan;}
    public String getFechaFin() {return fechaFin;}
    public void setFechaFin(String fechaFin) {this.fechaFin = fechaFin;}
    public List<CertificateBO> getCertificado() {return certificado;}
    public void setCertificado(List<CertificateBO> certificado) {this.certificado = certificado;}
    
}
