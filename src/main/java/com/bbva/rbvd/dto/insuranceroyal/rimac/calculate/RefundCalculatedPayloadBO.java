package com.bbva.rbvd.dto.insuranceroyal.rimac.calculate;


import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;
import com.bbva.rbvd.dto.insuranceroyal.refund.PorcentajeDTO;

import java.util.List;

public class RefundCalculatedPayloadBO extends CommonsFieldsDTO {
    private String tipoDocumento;
    private String nroDocumento;
    private String fechaNacimiento;
    private String producto;
    private Integer plazo;
    private List<PorcentajeDTO> porcentajes;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public List<PorcentajeDTO> getPorcentajes() {
        return porcentajes;
    }

    public void setPorcentajes(List<PorcentajeDTO> porcentajes) {

        this.porcentajes = porcentajes;
    }

    @Override
    public String toString() {
        return "RefundCalculatedPayloadBO{" +
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", nroDocumento='" + nroDocumento + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", producto='" + producto + '\'' +
                ", plazo=" + plazo +
                ", porcentajes=" + porcentajes +
                '}';
    }
}
