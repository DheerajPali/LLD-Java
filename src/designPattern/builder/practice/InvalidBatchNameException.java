package designPattern.builder.practice;

public class InvalidBatchNameException extends RuntimeException{
    public InvalidBatchNameException(){}

    public InvalidBatchNameException(String message) {
        super(message);
    }

    public InvalidBatchNameException(String message, Throwable cause){
        super(message, cause);
    }

}
