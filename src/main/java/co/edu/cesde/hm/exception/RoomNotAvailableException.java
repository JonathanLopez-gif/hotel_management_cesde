package co.edu.cesde.hm.exception;

public class RoomNotAvailableException extends RuntimeException {
    public RoomNotAvailableException() {
        super("Room Not Available");
    }
}
