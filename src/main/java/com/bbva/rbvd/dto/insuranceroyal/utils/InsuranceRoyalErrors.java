package com.bbva.rbvd.dto.insuranceroyal.utils;

public enum InsuranceRoyalErrors {
    CLIENT_WITHOUT_PT_CONTRACT("RBVD00120018", false, "El cliente no cuenta con un contrato PT"),
    ERROR_RIMAC_SERVICE("RBVD00120005", false, "Ocurrio un problema al consumir el servicio de Rimac"),
    SERVER_ERROR("RBVD00000158", false, "Ocurrio un problema en el servidor"),
    ERROR_CONNECTION_TIER_ASO_SERVICE("PISD00120003", false, "No se pudo realizar una conexión con el servicio Tier ASO"),
    ERROR_CONNECTION_CRYPTO_ASO_SERVICE("PISD00120007", false, "No se pudo realizar una conexión con el servicio Crypto ASO");

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
