package com.bbva.rbvd.dto.insuranceroyal.rimac.refund;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

import java.util.List;

public class RefundCalculatedPayloadBO extends AbstractDTO {
    private String tipoDocumento;
    private String nroDocumento;
    private String fechaNacimiento;
    private String producto;
    private Long plazo;
    private List<Long> porcentajes;

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

    public Long getPlazo() {
        return plazo;
    }

    public void setPlazo(Long plazo) {
        this.plazo = plazo;
    }

    public List<Long> getPorcentajes() {
        return porcentajes;
    }

    public void setPorcentajes(List<Long> porcentajes) {
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
