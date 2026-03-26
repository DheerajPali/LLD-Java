package projects.TicTacToe.controller;

import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Game;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.GameStatus;
import projects.TicTacToe.model.constants.WinnerCheckStrategyType;
import projects.TicTacToe.service.GameService;
import projects.TicTacToe.service.winnerDrawCheckStrategy.WinnerCheckStrategy;
import projects.TicTacToe.service.winnerDrawCheckStrategy.WinnerCheckStrategyFactory;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }


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

    public Move executeMove(Game game, Player player){
       return gameService.executeMove(game, player);
    }

    public Player checkWinner(Game game, Move lastPlayedMove){
        WinnerCheckStrategy winnerCheckStrategy = WinnerCheckStrategyFactory.getWinnerCheckStrategy(WinnerCheckStrategyType.OrderOfOne, game.getBoard().getDimension());
        return winnerCheckStrategy.checkWinner(game.getBoard(), lastPlayedMove);
    }

}
