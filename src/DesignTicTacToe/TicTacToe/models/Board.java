package DesignTicTacToe.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;  // 2D matrix
    public Board(int dimension) {
        // for very index we created an arrayList
        this.board = new ArrayList<>();
        for(int i=0; i<dimension; i++) {
            //for every index we created vertical arrayList i.e; column wise
            this.board.add(new ArrayList<>());
            for(int j=0; j<dimension; j++){
                // At every cell we added an empty cell
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }

    // Getter and setter methods for Board
    public List<List<Cell>> getBoard() {
        return board;
    }
    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void display() {
        for(int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                if (board.get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    System.out.print("|  |");
                } else {
                    System.out.print("| " + board.get(i).get(j).getPlayer().getSymbol() + " |");
                }
            }
            System.out.println();
        }
    }
}
