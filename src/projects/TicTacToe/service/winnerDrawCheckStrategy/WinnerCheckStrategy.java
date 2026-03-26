package projects.TicTacToe.service.winnerDrawCheckStrategy;

import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;

public interface WinnerCheckStrategy {
    Player checkWinner(Board board, Move lastMove);
}
