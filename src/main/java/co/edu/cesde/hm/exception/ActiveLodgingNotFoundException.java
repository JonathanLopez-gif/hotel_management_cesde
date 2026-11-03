package co.edu.cesde.hm.exception;

public class ActiveLodgingNotFoundException extends RuntimeException {
    public ActiveLodgingNotFoundException() {
        super("Active Lodging Not Found");
    }
}
