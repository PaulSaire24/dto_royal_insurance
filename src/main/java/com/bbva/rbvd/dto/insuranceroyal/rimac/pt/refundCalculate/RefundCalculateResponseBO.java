package com.bbva.rbvd.dto.insuranceroyal.rimac.pt.refundCalculate;

import com.bbva.apx.dto.AbstractDTO;

import java.util.List;

public class RefundCalculateResponseBO extends AbstractDTO {

    private List<RefundCalculatedPayloadBO> payload;

    public List<RefundCalculatedPayloadBO> getPayload() {
        return payload;
    }

    public void setPayload(List<RefundCalculatedPayloadBO> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "RefundCalculateResponseBO{" +
                "payload=" + payload +
                '}';
    }
}
