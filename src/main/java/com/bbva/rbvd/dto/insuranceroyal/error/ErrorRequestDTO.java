package com.bbva.rbvd.dto.insuranceroyal.error;

import java.io.Serializable;
import java.util.Map;

public class ErrorRequestDTO implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;
    private transient Map<String,Object> codes;
    private String typeErrorScope;
    private String channel;
    private int httpCode;
    private String reference;

    public Map<String, Object> getCodes() {
        return codes;
    }

    public void setCodes(Map<String, Object> codes) {
        this.codes = codes;
    }

    public String getTypeErrorScope() {
        return typeErrorScope;
    }

    public void setTypeErrorScope(String typeErrorScope) {
        this.typeErrorScope = typeErrorScope;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "ErrorRequestDTO{" +
                "codes=" + codes +
                ", typeErrorScope='" + typeErrorScope + '\'' +
                ", channel='" + channel + '\'' +
                ", httpCode=" + httpCode +
                ", reference='" + reference + '\'' +
                '}';
    }
}
