package com.bbva.rbvd.dto.insuranceroyal.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

public class ParticipantTypeDTO extends CommonsFieldsDTO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParticipantTypeDTO{");
        sb.append("id='").append(getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
