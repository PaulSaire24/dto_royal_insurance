package com.bbva.rbvd.dto.insuranceroyal.rimac.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceBO extends CommonsFieldsBO {

    private Integer idServicio;
    private String descripcionServicio;

    public Integer getIdServicio() {return idServicio;}
    public void setIdServicio(Integer idServicio) {this.idServicio = idServicio;}
    public String getDescripcionServicio() {return descripcionServicio;}
    public void setDescripcionServicio(String descripcionServicio) {this.descripcionServicio = descripcionServicio;}

}
