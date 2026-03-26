package projects.TicTacToe.service.winnerDrawCheckStrategy;

import projects.TicTacToe.exception.GameDrawException;
import projects.TicTacToe.model.Board;
import projects.TicTacToe.model.Move;
import projects.TicTacToe.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinnerCheckStrategy implements WinnerCheckStrategy {
    private static OrderOneWinnerCheckStrategy orderOneWinnerCheckStrategyInstance = null;
    private int dimension;
    private int eligibleMapForWinning;
    //create var for boardstate....
    private List<Board> boardStates;
    // Now I'm going to create 2*dimension + 3 hashmaps to monitor game in O(1).

    private List<HashMap<Character, Integer>> rowMapList;
    private List<HashMap<Character, Integer>> colMapList;
    private HashMap<Character, Integer> leftDiagonalMap;
    private HashMap<Character, Integer> rightDiagonalMap;
    private HashMap<Character, Integer> cornerMap;

    //now in the constructor we'll create all required maps based on dimension.
    private OrderOneWinnerCheckStrategy(int dimension) {
        this.dimension = dimension;
        this.eligibleMapForWinning = (2 * dimension + 3);
        this.rowMapList = new ArrayList<>();
        this.colMapList = new ArrayList<>();
        this.leftDiagonalMap = new HashMap<>();
        this.rightDiagonalMap = new HashMap<>();
        this.cornerMap = new HashMap<>();
        this.boardStates = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            rowMapList.add(new HashMap<>());
            colMapList.add(new HashMap<>());
        }
    }

    public static OrderOneWinnerCheckStrategy getOrderOneWinnerCheckStrategy(int dimension) {
        if (orderOneWinnerCheckStrategyInstance == null) {
            orderOneWinnerCheckStrategyInstance = new OrderOneWinnerCheckStrategy(dimension);
        }
        return orderOneWinnerCheckStrategyInstance;
    }

    @Override
    public Player checkWinner(Board board, Move lastMove) {
        boardStates.add(new Board(board));
        Player player = lastMove.getPlayer();
        char symbol = lastMove.getPlayer().getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();


        boolean winnerResult = (checkAndUpdateRowMap(row, symbol)
                || checkAndUpdateColMap(col, symbol)
                || (checkLeftDiagonal(row, col) && checkAndUpdateLeftDiagonal(symbol))
                || (checkRightDiagonal(row, col) && checkAndUpdateRightDiagonal(symbol))
                || (checkCorner(row, col) && checkAndUpdateCornerMap(symbol))
        );
//        System.out.println("eligible maps " + eligibleMapForWinning);
        if (winnerResult){
//            watchReplay(boardStates);
            return player;
        }
        else {
            if (checkForDraw()) {
                System.out.println("Game draw");
//                watchReplay(boardStates);
                throw new GameDrawException("Game has draw, well played");
            }
            return null;
        }
    }

    private boolean checkLeftDiagonal(int row, int col) {
        return row == col;
    }

    private boolean checkRightDiagonal(int row, int col) {
        return (row + col) == (dimension - 1);
    }

    private boolean checkCorner(int row, int col) {
        return (row == 0 && col == 0)
                || (row == dimension - 1 && col == dimension - 1)
                || (row == 0 && col == dimension - 1)
                || (row == dimension - 1 && col == 0);
    }

    private boolean checkAndUpdateRowMap(int row, char symbol) {
        HashMap<Character, Integer> rowMap = rowMapList.get(row);
        int previousSize = rowMap.size();
        rowMap.put(symbol, rowMap.getOrDefault(symbol, 0) + 1);
        if (previousSize == 1 && rowMap.size() > 1) {
            eligibleMapForWinning--;
        }
        return rowMap.get(symbol) == dimension;
    }

    private boolean checkAndUpdateColMap(int col, char symbol) {
        HashMap<Character, Integer> colMap = colMapList.get(col);
        int previousSize = colMap.size();
        colMap.put(symbol, colMap.getOrDefault(symbol, 0) + 1);
        if (previousSize == 1 && colMap.size() > 1) {
            eligibleMapForWinning--;
        }
        return colMap.get(symbol) == dimension;
    }

    private boolean checkAndUpdateLeftDiagonal(char symbol) {
        int previousSize = leftDiagonalMap.size();
        leftDiagonalMap.put(symbol, leftDiagonalMap.getOrDefault(symbol, 0) + 1);
        if (previousSize == 1 && leftDiagonalMap.size() > 1) {
            eligibleMapForWinning--;
        }
        return leftDiagonalMap.get(symbol) == dimension;
    }

    private boolean checkAndUpdateRightDiagonal(char symbol) {
        int previousSize = rightDiagonalMap.size();
        rightDiagonalMap.put(symbol, rightDiagonalMap.getOrDefault(symbol, 0) + 1);
        if (previousSize == 1 && rightDiagonalMap.size() > 1) {
            eligibleMapForWinning--;
        }
        return rightDiagonalMap.get(symbol) == dimension;
    }

    private boolean checkAndUpdateCornerMap(char symbol) {
        int previousSize = cornerMap.size();
        cornerMap.put(symbol, cornerMap.getOrDefault(symbol, 0) + 1);
        if (previousSize == 1 && cornerMap.size() > 1) {
            eligibleMapForWinning--;
        }
        return cornerMap.get(symbol) == 4;
    }

    private boolean checkForDraw() {
        return eligibleMapForWinning == 0;
    }

    private void watchReplay(List<Board> boards) {
        for (Board board : boards) {
            board.displayBoard();
        }
    }
}