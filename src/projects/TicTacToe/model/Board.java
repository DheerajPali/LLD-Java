package projects.TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> matrix;
    int dimension;

    public Board(int dimension) {
        this.dimension = dimension;
        matrix = new ArrayList<>();
        for(int i = 0; i < dimension ; i++){
            matrix.add(new ArrayList<>());
            for(int j = 0; j < dimension; j++){
                matrix.get(i).add(new Cell(i,j));
            }
        }
    }

    public void displayBoard(){
        for(int i = 0; i < dimension ; i++){
            List<Cell> cells = matrix.get(i);
            for(Cell cell : cells){
                cell.displayCell();
            }
            System.out.println();
        }
    }

    public int getDimension() {
        return dimension;
    }
//
//    public void setDimension(int dimension) {
//        this.dimension = dimension;
//    }


    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getMatrix() {
        return matrix;
    }

    public void setMatrix(List<List<Cell>> matrix) {
        this.matrix = matrix;
    }

    //here we're going to create prototype of current board
    public Board boardPrototype(Board board){
        return new Board(board);
    }

    //I'm creating a copy constructor, which returns same object taken as input , and will update it with current state.
    public Board(Board board){
        int dimension = board.getDimension();
        this.dimension = dimension;
        matrix = new ArrayList<>();
        for(int i = 0; i < dimension ; i++){
            matrix.add(new ArrayList<>());
            for(int j = 0; j < dimension; j++){
                Cell cell = new Cell(i,j);
                cell.setCellState(board.getMatrix().get(i).get(j).getCellState());
                cell.setPlayer(board.getMatrix().get(i).get(j).getPlayer());
                matrix.get(i).add(cell);
            }
        }
    }
}
