package com.bbva.rbvd.dto.insuranceroyal.refund;

public class DataDTO {
    private ParticipantDTO participant;
    private TermDTO term;
    private RefundsDTO refunds;

    public ParticipantDTO getParticipant() {
        return participant;
    }

    public void setParticipant(ParticipantDTO participant) {
        this.participant = participant;
    }

    public TermDTO getTerm() {
        return term;
    }

    public void setTerm(TermDTO term) {
        this.term = term;
    }

    public RefundsDTO getRefunds() {
        return refunds;
    }

    public void setRefunds(RefundsDTO refunds) {
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
