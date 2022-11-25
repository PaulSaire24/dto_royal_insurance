package com.bbva.rbvd.dto.insuranceroyal.pt.quotation;

import org.joda.time.LocalDate;

import com.bbva.rbvd.dto.insuranceroyal.commons.BankDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.HolderDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.ProductDTO;

public class PTInsuranceQuotationDTO extends CommonsFieldsDTO {

    private HolderDTO holder;
    private LocalDate quotationDate;
    private ValidityPeriodDTO validityPeriod;
    private ProductDTO product;
    private String externalQuotationId;
    private InsuranceCompanyDTO insuranceCompany;
    private BankDTO bank;

    public HolderDTO getHolder() {return holder;}
    public void setHolder(HolderDTO holder) {this.holder = holder;}
    public LocalDate getQuotationDate() { return quotationDate; }
    public void setQuotationDate(LocalDate quotationDate) { this.quotationDate = quotationDate; }
    public ValidityPeriodDTO getValidityPeriod() {return validityPeriod;}
    public void setValidityPeriod(ValidityPeriodDTO validityPeriod) {this.validityPeriod = validityPeriod;}
    public ProductDTO getProduct() {return product;}
    public void setProduct(ProductDTO product) {this.product = product;}
    public String getExternalQuotationId() { return externalQuotationId; }
    public void setExternalQuotationId(String externalQuotationId) { this.externalQuotationId = externalQuotationId; }
    public InsuranceCompanyDTO getInsuranceCompany() {return insuranceCompany;}
    public void setInsuranceCompany(InsuranceCompanyDTO insuranceCompany) {this.insuranceCompany = insuranceCompany;}
    public BankDTO getBank() {return bank;}
    public void setBank(BankDTO bank) {this.bank = bank;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PTInsuranceQuotationDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", holder=").append(holder);
        sb.append(", quotationDate=").append(quotationDate);
        sb.append(", maturityDate=").append(this.getMaturityDate());
        sb.append(", validityPeriod=").append(validityPeriod);
        sb.append(", product=").append(product);
        sb.append(", externalQuotationId='").append(externalQuotationId).append('\'');
        sb.append(", insuranceCompany=").append(insuranceCompany);
        sb.append(", bank=").append(bank);
        sb.append('}');
        return sb.toString();
    }


}
