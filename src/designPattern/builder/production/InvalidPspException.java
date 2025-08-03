package designPattern.builder.production;

public class InvalidPspException extends RuntimeException{
    InvalidPspException(){

    }
    InvalidPspException(String message){
        super(message);
    }

    InvalidPspException(String message, Throwable cause){
        super(message, cause);
    }
}
