package projects.TicTacToe.service.botPlayingStrategy;

import projects.TicTacToe.exception.GameDrawException;
import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Cell;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.CellState;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        int dimension = board.getDimension();
        List<List<Cell>> matrix = board.getMatrix();
        for(int i = 0 ; i < dimension ; i++){
            for(int j = 0; j < dimension; j++){
                Cell curCell = matrix.get(i).get(j);
                if(curCell.getCellState().equals(CellState.EMPTY)){
                    curCell.setCellState(CellState.FILLED);
                    curCell.setPlayer(player);
                    return new Move(curCell,player);
                }
            }
        }
        throw new GameDrawException("Draw - All the cells are full.");
    }
}
