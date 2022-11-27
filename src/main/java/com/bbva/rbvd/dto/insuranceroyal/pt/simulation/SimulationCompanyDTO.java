package com.bbva.rbvd.dto.insuranceroyal.pt.simulation;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

public class SimulationCompanyDTO extends CommonsFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulationCompanyDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
