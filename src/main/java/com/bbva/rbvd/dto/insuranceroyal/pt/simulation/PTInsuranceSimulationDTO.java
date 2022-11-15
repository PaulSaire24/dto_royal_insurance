package com.bbva.rbvd.dto.insuranceroyal.pt.simulation;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.HolderDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.ProductDTO;

public class PTInsuranceSimulationDTO extends CommonsFieldsDTO {

    private HolderDTO holder;
    private ProductDTO product;
    private String externalSimulationId;

    public HolderDTO getHolder() {return holder;}
    public void setHolder(HolderDTO holder) {this.holder = holder;}
    public ProductDTO getProduct() {return product;}
    public void setProduct(ProductDTO product) {this.product = product;}
    public String getExternalSimulationId() {return externalSimulationId;}
    public void setExternalSimulationId(String externalSimulationId) {this.externalSimulationId = externalSimulationId;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PTInsuranceSimulationDTO{");
        sb.append("holder=").append(holder);
        sb.append(", product=").append(product);
        sb.append(", externalSimulationId='").append(externalSimulationId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
