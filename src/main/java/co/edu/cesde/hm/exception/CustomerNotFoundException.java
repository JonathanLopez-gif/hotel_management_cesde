package co.edu.cesde.hm.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("Customer Not Found");
    }
}
