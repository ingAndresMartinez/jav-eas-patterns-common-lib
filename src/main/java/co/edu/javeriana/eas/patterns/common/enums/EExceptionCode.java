package co.edu.javeriana.eas.patterns.common.enums;

public enum EExceptionCode {

    BLOCKING(433),
    NON_BLOCKING(434);

    private int code;

    EExceptionCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}