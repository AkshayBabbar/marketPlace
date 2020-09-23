package marketPlace.commons.exception;

public class ApiException extends Exception {

    private String errorCode;

    public ApiException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ApiException(Throwable cause, String errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}
