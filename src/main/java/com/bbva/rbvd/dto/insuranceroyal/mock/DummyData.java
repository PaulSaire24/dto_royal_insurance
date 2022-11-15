package com.bbva.rbvd.dto.insuranceroyal.mock;

import java.io.IOException;

import com.bbva.rbvd.dto.insuranceroyal.pt.quotation.PTInsuranceQuotationDTO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.pt.quotation.InsuranceQuotationBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.pt.search.SearchInsuranceBO;

public class DummyData {

	private static final DummyData INSTANCE = new DummyData();
	
	private final ObjectMapperHelper objectMapperHelper;

	private DummyData() {
		objectMapperHelper = ObjectMapperHelper.getInstance();
	}

	public static DummyData getInstance() { return INSTANCE; }

	public InsuranceQuotationBO getInsuranceQuotationBoRimacServiceResponse() throws IOException {
		return this.objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/quotation/rimac/quotationResponse.json"), InsuranceQuotationBO.class);
	}
	
	public PTInsuranceQuotationDTO getInsuranceQuotationPtBBVARequest() throws IOException {
		return this.objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/quotation/quotationBBVARequest.json"), PTInsuranceQuotationDTO.class);
	}

	public SearchInsuranceBO getInsuranceSearchBoRimacServiceResponse() throws IOException {
		return this.objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/search/rimac/searchPolicyResponse.json"), SearchInsuranceBO.class);
	}

}
