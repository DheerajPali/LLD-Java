package projects.ParkingLot.exception;

public class GateNotFoundException extends RuntimeException{
        public GateNotFoundException(){}
        public GateNotFoundException(String exception){
            super(exception);
        }

        public GateNotFoundException(String exception , Throwable cause){
            super(exception,cause);
        }

}
