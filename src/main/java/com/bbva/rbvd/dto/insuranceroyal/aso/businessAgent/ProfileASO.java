package com.bbva.rbvd.dto.insuranceroyal.aso.businessAgent;

import java.io.Serializable;

public class ProfileASO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private String registrationIdentifier;

    public ProfileASO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegistrationIdentifier() {
        return registrationIdentifier;
    }

    public void setRegistrationIdentifier(String registrationIdentifier) {
        this.registrationIdentifier = registrationIdentifier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessAgentListASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append("description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
