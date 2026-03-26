package projects.TicTacToe.model;

import projects.TicTacToe.exception.BoardNotFoundException;
import projects.TicTacToe.exception.DuplicateSymbolException;
import projects.TicTacToe.exception.InvalidNumberOfPlayersException;
import projects.TicTacToe.exception.MultipleBotFoundException;
import projects.TicTacToe.model.constants.GameStatus;
import projects.TicTacToe.model.constants.PlayerType;

import java.util.HashSet;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private List<Move> moves;
    private List<Board> boardStates;
    private int noOfMaps;


    private Game(Board board, List<Board> boardStates, Player currentPlayer, GameStatus gameStatus, List<Move> moves, int noOfMaps, List<Player> players) {
        this.board = board;
        this.boardStates = boardStates;
        this.currentPlayer = currentPlayer;
        this.gameStatus = gameStatus;
        this.moves = moves;
        this.noOfMaps = noOfMaps;
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void addNewBoardState(Board board){
        this.boardStates.add(new Board(board));
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Board> getBoardStates() {
        return boardStates;
    }

    public void setBoardStates(List<Board> boardStates) {
        this.boardStates = boardStates;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNoOfMaps() {
        return noOfMaps;
    }

    public void setNoOfMaps(int noOfMaps) {
        this.noOfMaps = noOfMaps;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public static Builder builder(){
        return new Builder();
    }


    public static class  Builder{
        private Board board;
        private List<Player> players;
        private Player currentPlayer;
        private GameStatus gameStatus;
        private List<Move> moves;
        private List<Board> boardStates;
        private int noOfMaps;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setBoardStates(List<Board> boardStates) {
            this.boardStates = boardStates;
            return this;
        }

        public Builder setCurrentPlayer(Player currentPlayer) {
            this.currentPlayer = currentPlayer;
            return this;
        }

        public Builder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }

        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Builder setNoOfMaps(int noOfMaps) {
            this.noOfMaps = noOfMaps;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private void validate(){
            if(board == null) throw new BoardNotFoundException("No board found in the game");
            validateNoOfPlayers();
            validateUniqueSymbols();
            validateSingleBotPlayerInGame();
        }

        public void validateSingleBotPlayerInGame(){
            int count = 0;
            for(Player player : players){
                if(player.getPlayerType() == PlayerType.BOT) count++;
                if(count >= 2) throw new MultipleBotFoundException("You can not take more that 1 bot in a game");
            }
        }

        public void validateUniqueSymbols(){
            HashSet<Character> symbols = new HashSet<>();
            for(Player player : players){
                symbols.add(player.getSymbol());
            }
            if(players.size() != symbols.size()) throw  new DuplicateSymbolException("2 players can not have same symbols");
        }

        public void validateNoOfPlayers(){
            if(players.size() < 2) throw new InvalidNumberOfPlayersException("At least 2 players required to start the game");
            if(players.size() != board.getDimension() - 1)  throw new InvalidNumberOfPlayersException("There must be " +( board.getDimension() -1 )+ " players to start the game in board of size " + board.getDimension());
        }

        public Game build(){
            validate();
            return new Game(board,boardStates,currentPlayer,gameStatus,moves,noOfMaps,players);
        }


    }


}
