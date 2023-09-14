package com.bbva.rbvd.dto.insuranceroyal.refund;

import java.util.List;

public class DataDTO {
    private List<ParticipantDTO> participant;
    private TermDTO term;
    private List<RefundsDTO> refunds;

    public List<ParticipantDTO> getParticipant() {
        return participant;
    }

    public void setParticipant(List<ParticipantDTO> participant) {
        this.participant = participant;
    }

    public TermDTO getTerm() {
        return term;
    }

    public void setTerm(TermDTO term) {
        this.term = term;
    }

    public List<RefundsDTO> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<RefundsDTO> refunds) {
        this.refunds = refunds;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "participant=" + participant +
                ", term=" + term +
                ", refunds=" + refunds +
                '}';
    }
}
