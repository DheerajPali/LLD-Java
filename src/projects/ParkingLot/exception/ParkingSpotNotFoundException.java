package projects.ParkingLot.exception;

public class ParkingSpotNotFoundException extends RuntimeException{

    public ParkingSpotNotFoundException() {
    }
    public ParkingSpotNotFoundException(String exception) {
        super(exception);
    }
    public ParkingSpotNotFoundException(String exception, Throwable cause) {
        super(exception,cause);
    }
}
