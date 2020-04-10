package co.edu.javeriana.eas.patterns.common.enums;

public enum EExceptionCode {

    BLOCKING(1000),
    NON_BLOCKING(1001),
    USER_OR_PASSWORD_INVALID(1002),
    USER_BLOCKED(1003),
    CATEGORY_NOT_FOUND(1004),
    PERSON_NOT_FOUND(1005),
    PRODUCT_NOT_FOUND(1006),
    REQUEST_STATUS_NOT_FOUND(1007),
    PROVIDER_NOT_FOUND(1008),
    REQUEST_QUOTATION_NOT_FOUND(1009);

    private int code;

    EExceptionCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}