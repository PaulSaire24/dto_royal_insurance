package com.bbva.rbvd.dto.insuranceroyal.aso.businessAgent;

import java.io.Serializable;

public class BusinessAgentASO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private String registrationIdentifier;
    private ProfileASO profile;
    private String firstName;
    private String lastName;
    private String managementUnit;
    private String professionPosition;
    private PersonInChargeASO personInCharge;
    private BankASO bank;

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

    public ProfileASO getProfile() {
        return this.profile;
    }

    public void setProfile(ProfileASO profile) {
        this.profile = profile;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getManagementUnit() {
        return this.managementUnit;
    }

    public void setManagementUnit(String managementUnit) {
        this.managementUnit = managementUnit;
    }

    public String getProfessionPosition() {
        return this.professionPosition;
    }

    public void setProfessionPosition(String professionPosition) {
        this.professionPosition = professionPosition;
    }

    public PersonInChargeASO getPersonInCharge() {
        return this.personInCharge;
    }

    public void setPersonInCharge(PersonInChargeASO personInCharge) {
        this.personInCharge = personInCharge;
    }

    public BankASO getBank() {
        return this.bank;
    }

    public void setBank(BankASO bank) {
        this.bank = bank;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessAgentASO{");
        sb.append("profile='").append(this.profile).append('\'');
        sb.append("firstName='").append(this.firstName).append('\'');
        sb.append("lastName='").append(this.lastName).append('\'');
        sb.append("managementUnit='").append(this.managementUnit).append('\'');
        sb.append("professionPosition='").append(this.professionPosition).append('\'');
        sb.append("personInCharge='").append(this.personInCharge).append('\'');
        sb.append("bank='").append(this.bank).append('\'');
        sb.append("id='").append(this.getId()).append('\'');
        sb.append("registrationIdentifier='").append(this.getRegistrationIdentifier()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
