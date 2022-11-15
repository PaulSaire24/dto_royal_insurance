package com.bbva.rbvd.dto.insuranceroyal.pt.quotation;

import com.bbva.apx.dto.AbstractDTO;

public class ValidityPeriodDTO extends AbstractDTO {

    private String unit;
    private Long value;

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }
    public Long getValue() { return value; }
    public void setValue(Long value) { this.value = value; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("unit='").append(unit).append('\'');
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }

}
