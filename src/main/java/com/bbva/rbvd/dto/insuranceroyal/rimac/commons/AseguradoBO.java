package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

public class AseguradoBO extends CommonsFieldsBO {
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AseguradoBO{");
        sb.append("tipoDocumento='").append(this.getTipoDocumento()).append('\'');
        sb.append(", numeroDocumento='").append(this.getNumeroDocumento()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
