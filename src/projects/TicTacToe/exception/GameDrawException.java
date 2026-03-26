package projects.TicTacToe.exception;

public class GameDrawException extends RuntimeException {
    public GameDrawException(String message) {
        super(message);
    }
}
