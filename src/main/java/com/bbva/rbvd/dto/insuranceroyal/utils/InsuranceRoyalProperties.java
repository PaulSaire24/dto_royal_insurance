package com.bbva.rbvd.dto.insuranceroyal.utils;

public enum InsuranceRoyalProperties {

	FILED_CUSTOMER_SEGMENT_NAME("CUSTOMER_SEGMENT_NAME"),
	FIELD_CLIENT_LAST_NAME("CLIENT_LAST_NAME"),
	FIELD_INSURED_CUSTOMER_NAME("INSURED_CUSTOMER_NAME"),
	FIELD_PARTICIPANT_PERSONAL_ID("PARTICIPANT_PERSONAL_ID"),
	FIELD_PERSONAL_DOC_TYPE("PERSONAL_DOC_TYPE"),
	FIELD_OR_FILTER_INSURANCE_PRODUCT_ID("INSURANCE_PRODUCT_ID"),
	FIELD_INSURANCE_PRODUCT_DESC("INSURANCE_PRODUCT_DESC"),
	FIELD_INSURANCE_BUSINESS_NAME("INSURANCE_BUSINESS_NAME"),
	QUERY_GET_PRODUCT_INFORMATION("PISD.GET_PRODUCT_INFORMATION"),
	URI_SIMULATION_PT_KEY("rimac.simulation.pt.uri"),
	ID_API_PT_INSURANCE_SIMULATION_RIMAC("simulationPT.rimac"),
	ID_API_CRYPTO("createCrypto"),
	ID_API_TIER("listCustomerClassifications"),
	URI_QUOTATION_PT_KEY("rimac.quotation.pt.uri"),
	ID_PLANES_PT("planesPT"),
	ID_API_PT_INSURANCE_QUOTATION_RIMAC("quotationPT.rimac");

	
	private final String value;
	
	public String getValue() { return this.value; }
	
	private InsuranceRoyalProperties(String value) { this.value = value; }

}
