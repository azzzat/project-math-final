package Exceptions;

public class NullDenominatorException extends Exception {
    public NullDenominatorException() {
        super();
    }

    public NullDenominatorException(String message) {
        super(message);
    }

    public NullDenominatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullDenominatorException(Throwable cause) {
        super(cause);
    }

    protected NullDenominatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
