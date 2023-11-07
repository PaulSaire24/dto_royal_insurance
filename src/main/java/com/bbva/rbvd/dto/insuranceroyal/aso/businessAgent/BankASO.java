package com.bbva.rbvd.dto.insuranceroyal.aso.businessAgent;

public class BankASO {
    private String id;
    private String description;
    private String registrationIdentifier;
    private BranchASO branch;
    private TerritorialASO territorial;

    public BankASO() {
    }

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

    public BranchASO getBranch() {
        return this.branch;
    }

    public void setBranch(BranchASO branch) {
        this.branch = branch;
    }

    public TerritorialASO getTerritorial() {
        return this.territorial;
    }

    public void setTerritorial(TerritorialASO territorial) {
        this.territorial = territorial;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BankASO{");
        sb.append("branch='").append(this.branch).append('\'');
        sb.append(", territorial='").append(this.territorial).append('\'');
        sb.append(", id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
