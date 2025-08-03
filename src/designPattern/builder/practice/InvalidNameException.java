package designPattern.builder.practice;

public class InvalidNameException extends RuntimeException{

    public InvalidNameException(){}

    public InvalidNameException(String message){
        super(message);
    }

    public InvalidNameException(String messgae, Throwable cause){
        super(messgae,cause);
    }
}
