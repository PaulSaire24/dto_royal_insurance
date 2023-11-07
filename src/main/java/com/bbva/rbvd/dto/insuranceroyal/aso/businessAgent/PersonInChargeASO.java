package com.bbva.rbvd.dto.insuranceroyal.aso.businessAgent;

import java.io.Serializable;

public class PersonInChargeASO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private String registrationIdentifier;
    private String employeeId;

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
        sb.append("employeeId='").append(this.employeeId).append('\'');
        sb.append("registrationIdentifier='").append(this.getRegistrationIdentifier()).append('\'');
        sb.append("registrationIdentifier='").append(this.getRegistrationIdentifier()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
