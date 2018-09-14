package com.design.exception;

/**
 * @author Administrator
 */
public class UnSupportedShapeException extends RuntimeException {

    public UnSupportedShapeException() {
        super();
    }

    public UnSupportedShapeException(String message) {
        super(message);
    }

    public UnSupportedShapeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnSupportedShapeException(Throwable cause) {
        super(cause);
    }

    protected UnSupportedShapeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
