package co.edu.cesde.hm.exception;

public class InvoiceNotFoundException extends RuntimeException {
    public InvoiceNotFoundException() {
        super("Invoice Not Found");
    }
}
