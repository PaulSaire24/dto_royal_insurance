package com.bbva.rbvd.dto.insuranceroyal.utils;

public enum InsuranceRoyalErrors {

    ERROR_RIMAC_SERVICE("RBVD00120005", false, "Ocurrio un problema al consumir el servicio de Rimac"),
    SERVER_ERROR("RBVD00000158", false, "Ocurrio un problema en el servidor"),
    CLIENT_WITHOUT_PT_CONTRACT("RBVD00120018", false, "El cliente no cuenta con un contrato PT"),
    INSERTION_ERROR_IN_SIMULATION_TABLE("RBVD00120021", false, "Parametros requeridos incompletos para el registro de simulacion");
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
