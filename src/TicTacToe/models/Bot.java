package TicTacToe.models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    public Bot(String name, char symbol, BotDifficultyLevel DifficultyLevel){
        super(symbol, name, PlayerType.BOT);
        this.botDifficultyLevel = DifficultyLevel;
    }
    public BotDifficultyLevel getBotDifficultyLevel(){
        return botDifficultyLevel;
    }
    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
