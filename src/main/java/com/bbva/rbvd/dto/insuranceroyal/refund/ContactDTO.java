package com.bbva.rbvd.dto.insuranceroyal.refund;

import java.io.Serializable;

public class ContactDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String contactDetailType;
    private String number;
    private String address;

    public String getContactDetailType() {
        return contactDetailType;
    }

    public void setContactDetailType(String contactDetailType) {
        this.contactDetailType = contactDetailType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactDTO{");
        sb.append("contactDetailType='").append(contactDetailType).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
