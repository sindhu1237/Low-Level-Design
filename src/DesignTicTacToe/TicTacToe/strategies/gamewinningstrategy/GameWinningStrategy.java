package DesignTicTacToe.TicTacToe.strategies.gamewinningstrategy;

import DesignTicTacToe.TicTacToe.models.Board;
import DesignTicTacToe.TicTacToe.models.Cell;
import DesignTicTacToe.TicTacToe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player playerToMove, Cell cell);
}
