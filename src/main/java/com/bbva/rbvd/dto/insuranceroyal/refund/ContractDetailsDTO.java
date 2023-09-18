package com.bbva.rbvd.dto.insuranceroyal.refund;

import java.io.Serializable;

public class ContractDetailsDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private ContactDTO contact;

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractDetailsDTO{");
        sb.append("contact=").append(contact);
        sb.append('}');
        return sb.toString();
    }
}
