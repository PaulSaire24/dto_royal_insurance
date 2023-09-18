package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.refund;

import java.util.List;

public class RefundCalculateResponseBO {
    private Integer plazo;
    private List<Integer> porcentaje;

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public List<Integer> getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(List<Integer> porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "RefundCalculateResponseBO{" +
                "plazo=" + plazo +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
