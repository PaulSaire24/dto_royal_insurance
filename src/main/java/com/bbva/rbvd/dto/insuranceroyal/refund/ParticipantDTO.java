package com.bbva.rbvd.dto.insuranceroyal.refund;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.IdentityDocumentDTO;

import java.time.LocalDate;

public class ParticipantDTO extends AbstractDTO {
    private String id;
    private ParticipantTypeDTO participantType;
    private IdentityDocumentDTO identityDocument;
    private LocalDate birthDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParticipantTypeDTO getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public IdentityDocumentDTO getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocumentDTO identityDocument) {
        this.identityDocument = identityDocument;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "ParticipantDTO{" +
                "id='" + id + '\'' +
                ", participantType=" + participantType +
                ", identityDocument=" + identityDocument +
                ", birthDate=" + birthDate +
                '}';
    }
}
