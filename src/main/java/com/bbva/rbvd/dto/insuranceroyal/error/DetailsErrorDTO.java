package com.bbva.rbvd.dto.insuranceroyal.error;

import com.bbva.apx.dto.AbstractDTO;

public class DetailsErrorDTO extends AbstractDTO {
    private String code;
    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DetailsErrorDTO{" +
                "code='" + code + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
