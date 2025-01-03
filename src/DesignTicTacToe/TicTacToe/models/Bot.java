package DesignTicTacToe.TicTacToe.models;

import DesignTicTacToe.TicTacToe.factories.BotPlayingStrategyFactory;
import DesignTicTacToe.TicTacToe.strategies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(String name, char symbol, BotDifficultyLevel DifficultyLevel){
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = DifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(DifficultyLevel);
    }
    public BotDifficultyLevel getBotDifficultyLevel(){
        return botDifficultyLevel;
    }
    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public Move decideMove(Board board) {
        return botPlayingStrategy.makeMove(this, board);
    }
}
