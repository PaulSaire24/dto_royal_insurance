package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.refundCalculate;

import java.util.List;

public class RefundCalculatedBO {
    private List<RefundCalculatedPayloadBO> payload;

    public List<RefundCalculatedPayloadBO> getPayload() {
        return payload;
    }

    public void setPayload(List<RefundCalculatedPayloadBO> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "RefundCalculatedBO{" +
                "payload=" + payload +
                '}';
    }
}
