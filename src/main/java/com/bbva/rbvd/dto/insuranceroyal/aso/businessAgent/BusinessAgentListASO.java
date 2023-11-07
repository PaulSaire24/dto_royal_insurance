package com.bbva.rbvd.dto.insuranceroyal.aso.businessAgent;

import java.util.List;

public class BusinessAgentListASO {
    private List<BusinessAgentASO> data;

    public BusinessAgentListASO() {
    }

    public List<BusinessAgentASO> getData() {
        return this.data;
    }

    public void setData(List<BusinessAgentASO> data) {
        this.data = data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessAgentListASO{");
        sb.append("data='").append(this.data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
