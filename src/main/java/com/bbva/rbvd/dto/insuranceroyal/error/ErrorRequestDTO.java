package com.bbva.rbvd.dto.insuranceroyal.error;

import java.io.Serializable;
import java.util.List;

public class ErrorRequestDTO implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;
    private List<DetailsErrorDTO> details;
    private String typeErrorScope;
    private String channel;
    private Long httpCode;
    private String reference;

    public List<DetailsErrorDTO> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsErrorDTO> details) {
        this.details = details;
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

    public Long getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Long httpCode) {
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
                "details=" + details +
                ", typeErrorScope='" + typeErrorScope + '\'' +
                ", channel='" + channel + '\'' +
                ", httpCode=" + httpCode +
                ", reference='" + reference + '\'' +
                '}';
    }
}
