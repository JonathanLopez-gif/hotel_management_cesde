package co.edu.cesde.hm.exception;

public class CustomerWithActiveLodgingException extends RuntimeException {
    public CustomerWithActiveLodgingException() {
        super("Customer With Active Lodging");
    }
}
