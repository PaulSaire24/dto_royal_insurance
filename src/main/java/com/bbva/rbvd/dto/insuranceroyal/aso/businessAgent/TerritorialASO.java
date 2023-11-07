package com.bbva.rbvd.dto.insuranceroyal.aso.businessAgent;

import java.io.Serializable;

public class TerritorialASO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private String registrationIdentifier;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegistrationIdentifier() {
        return this.registrationIdentifier;
    }

    public void setRegistrationIdentifier(String registrationIdentifier) {
        this.registrationIdentifier = registrationIdentifier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessAgentListASO{");
        sb.append("territorial='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
