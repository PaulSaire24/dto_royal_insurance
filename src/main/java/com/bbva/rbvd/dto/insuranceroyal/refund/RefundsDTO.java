package com.bbva.rbvd.dto.insuranceroyal.refund;

import java.io.Serializable;

public class RefundsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private UnitDTO unit;

    public RefundsDTO() {
    }

    public UnitDTO getUnit() {
        return unit;
    }
    public void setUnit(UnitDTO unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "RefundsDTO [unit=" + unit + "]";
    }
}
