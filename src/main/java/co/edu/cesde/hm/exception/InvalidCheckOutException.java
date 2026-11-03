package co.edu.cesde.hm.exception;

public class InvalidCheckOutException extends RuntimeException {
    public InvalidCheckOutException() {
        super("Invalid Check Out");
    }
}
