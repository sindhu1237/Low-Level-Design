package DesignTicTacToe.TicTacToe.strategies.botplayingstrategy;

import DesignTicTacToe.TicTacToe.models.Board;
import DesignTicTacToe.TicTacToe.models.Move;
import DesignTicTacToe.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Player player, Board board);
//   public default Move decideMove(Player player, Board board) {
//        return null;
//    }
}
