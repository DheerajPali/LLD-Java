package projects.TicTacToe;

import projects.TicTacToe.controller.GameController;
import projects.TicTacToe.exception.GameDrawException;
import projects.TicTacToe.model.*;
import projects.TicTacToe.model.constants.BotDifficultyLevel;
import projects.TicTacToe.model.constants.GameStatus;
import projects.TicTacToe.model.constants.PlayerType;
import projects.TicTacToe.service.winnerDrawCheckStrategy.WinnerCheckStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id = 1;
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        GameController gameController = new GameController();

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Please enter the size of the board");
        int dimension = sc.nextInt();
        int noOfPlayers = dimension-1;
        System.out.println("Do you want a bot in the game ? Y for Yes, N for No");
        String botAnswer = sc.next();

        if(botAnswer.equals("Y")){
            Player botPlayer = new Bot(id++,"Kalu",'O', BotDifficultyLevel.EASY);
            players.add(botPlayer);
            System.out.println("Bot name as " + botPlayer.getName() + " Added ");
        }

        while(id <= noOfPlayers){
            System.out.println("Please enter player name");
            sc.nextLine(); //remember we're clearing buffer here, otherwise empty string will be here in playerName.
            String playerName = sc.nextLine();
            System.out.println("Please Enter symbol for player " + playerName);
            char symbol = sc.next().charAt(0);

            Player newPlayer = new Player(id++,playerName,PlayerType.HUMAN,symbol);
            players.add(newPlayer);
        }

        Collections.shuffle(players);

        Board board = new Board(dimension);
        Game game = gameController.createGame(board,players);

        int playerIndex = -1;
        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){

            //first we'll show the current board
            System.out.println("Current Board Status");
            gameController.displayBoard(game);
            playerIndex++;
            playerIndex = playerIndex % players.size();

            Move move = gameController.executeMove(game, players.get(playerIndex));
            game.getMoves().add(move);
            game.getBoardStates().add(new Board(game.getBoard()));
            try{
                Player player = gameController.checkWinner(game, move);
                if(player != null){
                    gameController.displayBoard(game);
                    game.setGameStatus(GameStatus.FINISHED);
                    System.out.println(player.getName() + " won the game!");
                }
            }
            catch(GameDrawException ex){
//                throw new GameDrawException("Game draw");
//                System.out.println("Game draw");
                game.setGameStatus(GameStatus.FINISHED);
            }
        }
        System.out.println("Final state of board ");
        gameController.displayBoard(game);
    }
}
