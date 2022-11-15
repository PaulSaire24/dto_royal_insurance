package com.bbva.rbvd.dto.insuranceroyal.commons;

public class TotalInstallmentDTO extends CommonsFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TotalInstallmentDTO{");
        sb.append("amount=").append(this.getAmount());
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
