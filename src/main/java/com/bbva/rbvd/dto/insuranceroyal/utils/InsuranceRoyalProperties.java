package com.bbva.rbvd.dto.insuranceroyal.utils;

public enum InsuranceRoyalProperties {

	FIELD_OR_FILTER_INSURANCE_PRODUCT_ID("INSURANCE_PRODUCT_ID"),
	FIELD_INSURANCE_PRODUCT_DESC("INSURANCE_PRODUCT_DESC"),
	FIELD_INSURANCE_BUSINESS_NAME("INSURANCE_BUSINESS_NAME"),
	QUERY_GET_PRODUCT_INFORMATION("PISD.GET_PRODUCT_INFORMATION"),
	URI_SIMULATION_PT_KEY("rimac.simulation.pt.uri"),
	ID_API_PT_INSURANCE_SIMULATION_RIMAC("api.connector.simulationPT.rimac.url"),
	URI_QUOTATION_PT_KEY("rimac.quotation.pt.uri"),
	
	ID_API_PT_INSURANCE_QUOTATION_RIMAC("api.connector.quotationPT.rimac.url");

	
	


	
	private final String value;
	
	public String getValue() { return this.value; }
	
	private InsuranceRoyalProperties(String value) { this.value = value; }

}
