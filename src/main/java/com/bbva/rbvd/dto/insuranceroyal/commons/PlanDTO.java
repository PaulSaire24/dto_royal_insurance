package com.bbva.rbvd.dto.insuranceroyal.commons;

import com.bbva.rbvd.dto.insuranceroyal.pt.simulation.ConditionsDTO;
import com.bbva.rbvd.dto.insuranceroyal.pt.simulation.CoverageDTO;
import com.bbva.rbvd.dto.insuranceroyal.pt.simulation.ExclusionDTO;

import java.util.List;

public class PlanDTO extends CommonsFieldsDTO{

    private List<CoverageDTO> coverages;
    private List<ExclusionDTO> exclusions;
    private TotalInstallmentDTO totalInstallment;
    private List<InstallmentPlanDTO> installmentPlans;

    private List<ConditionsDTO> conditions;


    public List<CoverageDTO> getCoverages() { return coverages; }
    public void setCoverages(List<CoverageDTO> coverages) { this.coverages = coverages; }
    public List<ExclusionDTO> getExclusions() {return this.exclusions;}
    public void setExclusions(List<ExclusionDTO> exclusions) {this.exclusions = exclusions;}
    public TotalInstallmentDTO getTotalInstallment() { return totalInstallment; }
    public void setTotalInstallment(TotalInstallmentDTO totalInstallment) { this.totalInstallment = totalInstallment; }
    public List<InstallmentPlanDTO> getInstallmentPlans() {return installmentPlans;}
    public void setInstallmentPlans(List<InstallmentPlanDTO> installmentPlans) {this.installmentPlans = installmentPlans;}

    public List<ConditionsDTO> getConditions() { return conditions; }
    public void setConditions(List<ConditionsDTO> conditions) { this.conditions = conditions; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append(", totalInstallment=").append(totalInstallment);
        sb.append(", installmentPlans=").append(installmentPlans);
        sb.append(", coverages=").append(coverages);
        sb.append(", exclusions='").append(exclusions).append('\'');
        sb.append(", isRecommended='").append(this.getIsRecommended()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
