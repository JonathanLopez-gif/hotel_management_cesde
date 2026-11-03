package co.edu.cesde.hm.exception;

public class RoomNotFoundException extends RuntimeException {
    public RoomNotFoundException() {
        super("Room Not Found");
    }
}
