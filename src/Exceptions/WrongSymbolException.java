package Exceptions;

public class WrongSymbolException extends Exception {
    public WrongSymbolException() {
        super();
    }

    public WrongSymbolException(String message) {
        super(message);
    }

    public WrongSymbolException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongSymbolException(Throwable cause) {
        super(cause);
    }

    protected WrongSymbolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
