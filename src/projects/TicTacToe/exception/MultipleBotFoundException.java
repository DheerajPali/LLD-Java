package projects.TicTacToe.exception;

public class MultipleBotFoundException extends RuntimeException {
    public MultipleBotFoundException(String message) {
        super(message);
    }
}
