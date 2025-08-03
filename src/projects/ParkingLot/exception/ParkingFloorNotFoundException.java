package projects.ParkingLot.exception;

public class ParkingFloorNotFoundException extends RuntimeException{
        public ParkingFloorNotFoundException(){}
        public ParkingFloorNotFoundException(String exception){
            super(exception);
        }

        public ParkingFloorNotFoundException(String exception , Throwable cause){
            super(exception,cause);
        }

}


