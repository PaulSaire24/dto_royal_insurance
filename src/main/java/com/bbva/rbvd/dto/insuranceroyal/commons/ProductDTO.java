package com.bbva.rbvd.dto.insuranceroyal.commons;

import java.util.List;

public class ProductDTO extends CommonsFieldsDTO {

    private List<PlanDTO> plans;
    private PlanDTO plan;

    public List<PlanDTO> getPlans() { return plans; }
    public void setPlans(List<PlanDTO> plans) { this.plans = plans; }
    public PlanDTO getPlan() {
        return this.plan;
    }
    public void setPlan(PlanDTO plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", plans=").append(plans);
        sb.append(", plan=").append(plan);
        sb.append('}');
        return sb.toString();
    }
}
