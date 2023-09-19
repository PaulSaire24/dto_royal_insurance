package com.bbva.rbvd.dto.insuranceroyal.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.HolderDTO;
import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

import java.util.List;

public class ParticipantDTO extends HolderDTO {
    private String middleName;
    private String secondLastName;
    private ParticipantTypeDTO participantType;
    private List<ContractDetailsDTO> contactDetails;
    private String birthDate;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public ParticipantTypeDTO getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public List<ContractDetailsDTO> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContractDetailsDTO> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParticipantDTO{");
        sb.append("id='").append(getId()).append('\'');
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", secondLastName='").append(secondLastName).append('\'');
        sb.append(", participantType=").append(participantType);
        sb.append(", contactDetails=").append(contactDetails);
        sb.append(", identityDocument='").append(getIdentityDocument()).append('\'');
        sb.append(", birthDate='").append(birthDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
