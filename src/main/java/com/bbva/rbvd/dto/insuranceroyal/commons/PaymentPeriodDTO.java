package com.bbva.rbvd.dto.insuranceroyal.commons;

public class PaymentPeriodDTO extends CommonsFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentPeriodDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
