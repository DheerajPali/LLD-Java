package projects.TicTacToe;

import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Bot;
import projects.TicTacToe.model.Player;
import projects.TicTacToe.model.constants.BotDifficultyLevel;
import projects.TicTacToe.model.constants.PlayerType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id = 1;
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Please enter the size of the board");
        int dimension = sc.nextInt();
        int noOfPlayers = dimension-1;
        System.out.println("Do you want a bot in the game ? Y for Yes, N for No");
        String botAnswer = sc.next();

        if(botAnswer.equals("Y")){
            noOfPlayers--;
            Player botPlayer = new Bot(id++,"Kalu",'O', BotDifficultyLevel.EASY);
            players.add(botPlayer);
        }

        while(id < noOfPlayers){
            System.out.println("Please enter player name");
            String playerName = sc.nextLine();
            System.out.println("Please Enter symbol for player " + playerName);
            char symbol = sc.next().charAt(0);

            Player newPlayer = new Player(id++,playerName,PlayerType.HUMAN,symbol);
            players.add(newPlayer);
        }

        Collections.shuffle(players);
    }
}
