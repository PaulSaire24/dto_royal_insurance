package com.bbva.rbvd.dto.insuranceroyal.aso.tier;

import com.bbva.rbvd.dto.insuranceroyal.aso.CommonFieldsASO;

public class TierSegmentASO extends CommonFieldsASO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TierSegmentASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
