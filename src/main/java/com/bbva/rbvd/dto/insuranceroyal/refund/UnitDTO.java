package com.bbva.rbvd.dto.insuranceroyal.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

import java.math.BigDecimal;

public class UnitDTO extends CommonsFieldsDTO {
    private String unitType;
    private String text;
    private BigDecimal decimal;
    private BigDecimal percentage;

    public String getUnitType() {return unitType;}
    public void setUnitType(String unitType) {this.unitType = unitType;}
    public String getText() {return text;}
    public void setText(String text) {this.text = text;}
    public BigDecimal getDecimal() {return decimal;}
    public void setDecimal(BigDecimal decimal) {this.decimal = decimal;}
    public BigDecimal getPercentage() {return percentage;}
    public void setPercentage(BigDecimal percentage) {this.percentage = percentage;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnitDTO{");
        sb.append("unitType='").append(unitType).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", decimal=").append(decimal);
        sb.append(", percentage=").append(percentage);
        sb.append('}');
        return sb.toString();
    }
}
