package DesignTicTacToe.TicTacToe.factories;

import DesignTicTacToe.TicTacToe.models.BotDifficultyLevel;
import DesignTicTacToe.TicTacToe.strategies.botplayingstrategy.BotPlayingStrategy;
import DesignTicTacToe.TicTacToe.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        if (difficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new RandomBotPlayingStrategy();
        }
        return null;
    }
}
