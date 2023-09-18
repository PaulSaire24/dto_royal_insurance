package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.refund;

public class RefundCalculatedBO {
    private RefundCalculatedPayloadBO payload;

    public RefundCalculatedPayloadBO getPayload() {
        return payload;
    }

    public void setPayload(RefundCalculatedPayloadBO payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "RefundCalculatedBO{" +
                "payload=" + payload +
                '}';
    }
}
