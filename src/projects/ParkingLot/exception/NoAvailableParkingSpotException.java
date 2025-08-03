package projects.ParkingLot.exception;

public class NoAvailableParkingSpotException extends RuntimeException {
    public NoAvailableParkingSpotException() {
    }

    public NoAvailableParkingSpotException(Throwable cause) {
        super(cause);
    }

    public NoAvailableParkingSpotException(String message) {
        super(message);
    }

    public NoAvailableParkingSpotException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoAvailableParkingSpotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
