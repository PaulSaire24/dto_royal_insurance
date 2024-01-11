package com.bbva.rbvd.dto.insuranceroyal.error;

import java.io.Serializable;

public class ErrorResponseDTO implements Serializable {
    private String code;
    private String message;
    private String type;
    private String typeAlert;
    private int httpcode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHttpcode() {
        return httpcode;
    }

    public void setHttpcode(int httpcode) {
        this.httpcode = httpcode;
    }

    public String getTypeAlert() {
        return typeAlert;
    }

    public void setTypeAlert(String typeAlert) {
        this.typeAlert = typeAlert;
    }

    @Override
    public String toString() {
        return "ErrorResponseDTO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", typeAlert='" + typeAlert + '\'' +
                ", httpcode=" + httpcode +
                '}';
    }
}
