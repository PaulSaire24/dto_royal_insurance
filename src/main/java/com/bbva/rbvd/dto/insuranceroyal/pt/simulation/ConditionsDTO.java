package com.bbva.rbvd.dto.insuranceroyal.pt.simulation;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

public class ConditionsDTO extends CommonsFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConditionsDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
