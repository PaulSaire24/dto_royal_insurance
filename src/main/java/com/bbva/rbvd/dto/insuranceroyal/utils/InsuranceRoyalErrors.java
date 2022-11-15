package com.bbva.rbvd.dto.insuranceroyal.utils;

public enum InsuranceRoyalErrors {
    CLIENT_WITHOUT_PT_CONTRACT("RBVD00120018", false, "El cliente no cuenta con un contrato PT");


    private final String adviceCode;
    private final boolean rollback;
    private final String message;

    public String getAdviceCode() {
        return adviceCode;
    }

    public boolean isRollback() {
        return rollback;
    }

    public String getMessage() {
        return message;
    }

    InsuranceRoyalErrors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }
}
