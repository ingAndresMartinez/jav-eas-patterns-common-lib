package co.edu.javeriana.eas.patterns.common.enums;

public enum EExceptionCode {

    BLOCKING(1000),
    NON_BLOCKING(1001),
    USER_OR_PASSWORD_INVALID(1002),
    USER_BLOCKED(1003);

    private int code;

    EExceptionCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}