package com.bbva.rbvd.dto.insuranceroyal.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

import java.math.BigDecimal;

public class UnitDTO extends CommonsFieldsDTO {
    private String unitType;
    private BigDecimal percentage;

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "UnitDTO{" +
                "unitType='" + unitType + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
