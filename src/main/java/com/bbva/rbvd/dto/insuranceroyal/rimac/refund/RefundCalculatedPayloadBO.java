package com.bbva.rbvd.dto.insuranceroyal.rimac.refund;

import com.bbva.rbvd.dto.insuranceroyal.commons.CommonsFieldsDTO;

import java.util.List;

public class RefundCalculatedPayloadBO {
    private String tipoDocumento;
    private String nroDocumento;
    private String fechaNacimiento;
    private String producto;
    private Long plazo;
    private List<Long> porcentajes;


}
