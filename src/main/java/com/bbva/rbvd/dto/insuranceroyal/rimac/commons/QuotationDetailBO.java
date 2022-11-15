package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import java.util.List;

public class QuotationDetailBO extends CommonsFieldsBO {
	
	private List<PlanBO> plan;


	public List<PlanBO> getPlan() {
		return plan;
	}
	public void setPlan(List<PlanBO> plan) {
		this.plan = plan;
	}


}
