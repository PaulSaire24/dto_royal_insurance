package com.bbva.rbvd.dto.insuranceroyal.commons;

public class InstallmentPlanDTO extends CommonsFieldsDTO {

    private Long paymentsTotalNumber;
    private PaymentAmountDTO paymentAmount;
    private PaymentPeriodDTO period;

    public Long getPaymentsTotalNumber() {return paymentsTotalNumber;}
    public void setPaymentsTotalNumber(Long paymentsTotalNumber) {this.paymentsTotalNumber = paymentsTotalNumber;}
    public PaymentAmountDTO getPaymentAmount() {return paymentAmount;}
    public void setPaymentAmount(PaymentAmountDTO paymentAmount) {this.paymentAmount = paymentAmount;}
    public PaymentPeriodDTO getPeriod() {return period;}
    public void setPeriod(PaymentPeriodDTO period) {this.period = period;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentPlansDTO{");
        sb.append("paymentsTotalNumber=").append(paymentsTotalNumber);
        sb.append(", paymentAmount=").append(paymentAmount);
        sb.append(", period=").append(period);
        sb.append('}');
        return sb.toString();
    }

}
