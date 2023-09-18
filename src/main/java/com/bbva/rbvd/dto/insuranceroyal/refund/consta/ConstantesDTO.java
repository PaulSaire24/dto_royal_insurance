package com.bbva.rbvd.dto.insuranceroyal.refund.consta;

public enum ConstantesDTO {
    NUMBER("number"),
    UNIT("unit"),
    UNITTYPE("unitType"),
    PERCENTAGE("percentage");

    private final String value;
    public String getValue() {
        return value;
    }
    ConstantesDTO(String value){
        this.value = value;
    }
}
