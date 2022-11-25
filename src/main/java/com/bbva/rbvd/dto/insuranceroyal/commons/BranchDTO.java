package com.bbva.rbvd.dto.insuranceroyal.commons;

public class BranchDTO extends CommonsFieldsDTO{

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentTypeDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
