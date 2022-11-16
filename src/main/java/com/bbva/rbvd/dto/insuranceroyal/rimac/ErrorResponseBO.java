package com.bbva.rbvd.dto.insuranceroyal.rimac;

import java.util.List;

public class ErrorResponseBO {

    private String code;
    private String message;
    private List<String> details;
    private Long httpStatus;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public List<String> getDetails() { return details; }
    public void setDetails(List<String> details) { this.details = details; }
    public Long getHttpStatus() { return httpStatus; }
    public void setHttpStatus(Long httpStatus) { this.httpStatus = httpStatus; }

}
