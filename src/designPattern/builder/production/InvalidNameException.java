package designPattern.builder.production;

import java.util.concurrent.Callable;

public class InvalidNameException extends RuntimeException{
    InvalidNameException(){

    }

    InvalidNameException(String message){
        super(message);
    }

    InvalidNameException(String message, Throwable cause){
        super(message, cause);
    }
}