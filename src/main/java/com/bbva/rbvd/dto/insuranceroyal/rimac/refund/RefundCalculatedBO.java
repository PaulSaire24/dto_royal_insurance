package com.bbva.rbvd.dto.insuranceroyal.rimac.refund;

import com.bbva.apx.dto.AbstractDTO;

public class RefundCalculatedBO extends AbstractDTO {
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
