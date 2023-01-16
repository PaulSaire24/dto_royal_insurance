package com.bbva.rbvd.dto.insuranceroyal.mock;

import java.io.IOException;

import com.bbva.rbvd.dto.insuranceroyal.aso.tier.TierASO;
import com.bbva.rbvd.dto.insuranceroyal.pt.quotation.PTInsuranceQuotationDTO;
import com.bbva.rbvd.dto.insuranceroyal.pt.simulation.PTInsuranceSimulationDTO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.pt.quotation.InsuranceQuotationBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.pt.search.SearchInsuranceBO;
import com.bbva.rbvd.dto.insuranceroyal.rimac.pt.simulation.InsuranceSimulationBO;

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
	
	public PTInsuranceQuotationDTO getInsuranceQuotationPtBBVAResponse() throws IOException {
		return this.objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/quotation/quotationBBVAResponse.json"), PTInsuranceQuotationDTO.class);
	}

	public SearchInsuranceBO getInsuranceSearchBoRimacServiceResponse() throws IOException {
		return this.objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/search/rimac/searchPolicyResponse.json"), SearchInsuranceBO.class);
	}

	public InsuranceSimulationBO getInsuranceSimulationPTRequestRimac() throws IOException {
		return this.objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/simulation/rimacRequest.json"), InsuranceSimulationBO.class);
	}

	public TierASO getTierMockResponse() throws IOException {
		return objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/tier/tierResponse.json"), TierASO.class);
	}

	public InsuranceSimulationBO getRimacMockResponse() throws IOException {
		return objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/simulation/response/rimacResponse.json"), InsuranceSimulationBO.class);
	}

	public PTInsuranceSimulationDTO getPTMockResponse() throws IOException {
		return objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/simulation/response/simulationResponsePT.json"), PTInsuranceSimulationDTO.class);
	}

	public PTInsuranceSimulationDTO getPTMockRequest() throws IOException {
		return objectMapperHelper.readValue(Thread.currentThread().getContextClassLoader().
				getResourceAsStream("com/bbva/rbvd/dto/insuranceroyal/mock/pt/simulation/simulationRequest.json"), PTInsuranceSimulationDTO.class);
	}

}
