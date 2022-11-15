package com.bbva.rbvd.dto.insuranceroyal.commons;

public class PaymentAmountDTO extends CommonsFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentAmountDTO{");
        sb.append("amount='").append(this.getAmount()).append('\'');
        sb.append(", currency='").append(this.getCurrency()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
