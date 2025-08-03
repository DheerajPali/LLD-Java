package projects.ParkingLot.exception;

public class ParkingLotNotFoundException extends RuntimeException{
    public ParkingLotNotFoundException(){}
    public ParkingLotNotFoundException(String exception){
        super(exception);
    }

    public ParkingLotNotFoundException(String exception , Throwable cause){
        super(exception,cause);
    }

}
