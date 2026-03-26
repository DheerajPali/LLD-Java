package projects.TicTacToe.service;

import projects.TicTacToe.model.Cell;
import projects.TicTacToe.model.Game;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.BotDifficultyLevel;
import projects.TicTacToe.model.constants.CellState;
import projects.TicTacToe.model.constants.PlayerType;
import projects.TicTacToe.service.botPlayingStrategy.BotPlayingStrategy;
import projects.TicTacToe.service.botPlayingStrategy.BotPlayingStrategyFactory;

import java.util.Scanner;

public class GameService {

    public Move executeMove(Game game, Player player){
        if(player.getPlayerType().equals(PlayerType.HUMAN)){
            return executeMoveHumanPlayer(game,player);
        }else{
           return executeMoveBotPlayer(game, player);
        }
    }

    private Move executeMoveHumanPlayer(Game game, Player player){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the row for the target cell: " + player.getName());
            int row = sc.nextInt();
            System.out.println("Enter the col for the target cell: " + player.getName());
            int col = sc.nextInt();

            Cell cell = game.getBoard().getMatrix().get(row).get(col);

            if (cell.getCellState() == CellState.FILLED) {
                System.out.println("The cell is already filled, please enter a valid combination of row & column.");
            } else {
                cell.setPlayer(player);
                cell.setCellState(CellState.FILLED);
                return new Move(cell, player);
            }
        }
    }

    private Move executeMoveBotPlayer(Game game, Player botPlayer){
        System.out.println("It's " + botPlayer.getName() + "'s turn now!");
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(BotDifficultyLevel.EASY);
        return botPlayingStrategy.makeMove(game.getBoard(), botPlayer);
    }
}
