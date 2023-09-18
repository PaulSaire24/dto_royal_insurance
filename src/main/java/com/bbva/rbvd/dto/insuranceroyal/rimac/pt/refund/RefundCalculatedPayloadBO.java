package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

public class RefundCalculatedPayloadBO extends CommonsFieldsDTO {
    private String tipoDocumento;
    private String nroDocumento;
    private String fechaNacimiento;
    private String producto;

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

    @Override
    public String toString() {
        return "RefundCalculatedPayloadBO{" +
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", nroDocumento='" + nroDocumento + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", producto='" + producto + '\'' +
                '}';
    }
}
