package com.bbva.rbvd.dto.insuranceroyal.refund;

public class PorcentajeDTO {
    private Integer porcentaje;

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "PorcentajesDTO{" +
                "porcentaje=" + porcentaje +
                '}';
    }
}
