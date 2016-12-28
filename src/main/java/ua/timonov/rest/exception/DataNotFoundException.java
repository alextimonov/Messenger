package ua.timonov.rest.exception;

public class DataNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -7435438910283076658L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
