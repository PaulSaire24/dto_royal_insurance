package com.bbva.rbvd.dto.insuranceroyal.pt.quotation;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

public class InsuranceCompanyDTO extends CommonsFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceCompanyDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
