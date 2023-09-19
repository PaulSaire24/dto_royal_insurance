package com.bbva.rbvd.dto.insuranceroyal.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.HolderDTO;

import java.time.LocalDate;
import java.util.List;

public class ParticipantDTO extends  HolderDTO{
    private String middleName;
    private String secondLastName;
    private ParticipantTypeDTO participantType;
    private List<ContractDetailsDTO> contactDetails;
    private LocalDate birthDate;

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondLastName() {
        return this.secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public ParticipantTypeDTO getParticipantType() {
        return this.participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public List<ContractDetailsDTO> getContactDetails() {
        return this.contactDetails;
    }

    public void setContactDetails(List<ContractDetailsDTO> contactDetails) {
        this.contactDetails = contactDetails;
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
                "middleName='" + middleName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", participantType=" + participantType +
                ", contactDetails=" + contactDetails +
                ", birthDate=" + birthDate +
                '}';
    }
}
