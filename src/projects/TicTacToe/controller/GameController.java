package projects.TicTacToe.controller;

import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Game;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.GameStatus;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public Game createGame(Board board, List<Player> players){
        int dimension = board.getDimension();
        return Game.builder()
                .setBoard(board)
                .setGameStatus(GameStatus.IN_PROGRESS)
                .setPlayers(players)
                .setCurrentPlayer(players.get(0))
                .setMoves(new ArrayList<>())
                .setBoardStates(new ArrayList<>())
                .setNoOfMaps(2*dimension + 3)
                .build();
    }

    public void displayBoard(Game game){
        game.getBoard().displayBoard();
    }
}
