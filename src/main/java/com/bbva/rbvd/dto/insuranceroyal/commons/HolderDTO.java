package com.bbva.rbvd.dto.insuranceroyal.commons;

public class HolderDTO extends CommonsFieldsDTO {

    private IdentityDocumentDTO identityDocument;

    public IdentityDocumentDTO getIdentityDocument() { return identityDocument; }
    public void setIdentityDocument(IdentityDocumentDTO identityDocument) { this.identityDocument = identityDocument; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", identityDocument='").append(identityDocument).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
