package co.edu.javeriana.eas.patterns.common.exceptions;

import co.edu.javeriana.eas.patterns.common.enums.EExceptionCode;

public abstract class QuotationCoreException extends Exception {

    private final EExceptionCode exceptionCode;

    public QuotationCoreException(EExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public QuotationCoreException(EExceptionCode exceptionCode, String causeMessage) {
        super(causeMessage);
        this.exceptionCode = exceptionCode;
    }

    public EExceptionCode getExceptionCode() {
        return exceptionCode;
    }

}