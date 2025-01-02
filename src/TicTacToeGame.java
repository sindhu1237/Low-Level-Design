import TicTacToe.models.*;
import exceptions.InValidGameBuildException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TicTacToeGame {
    public static void main(String[] args) throws InValidGameBuildException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of the game : ");
        int dimension = sc.nextInt();
        System.out.println("Will there be any bot ? y/n");
        String isBot = sc.next();
        List<Player> players = new ArrayList<>();
        int numberOfHumanPlayers = dimension - 1;
        if (isBot.equals('y')) {
            numberOfHumanPlayers -= 1;
            System.out.println("What is the name of bot : ");
            String name = sc.next();
            System.out.println("What is the symbol of the bot: ");
            String symbol = sc.next();
            players.add(new Bot(name, symbol.charAt(0), BotDifficultyLevel.EASY));

        }
        for(int i=0;i<numberOfHumanPlayers; i++) {
            System.out.println("What is the name of player : " + (i+1));
            String name = sc.next();
            System.out.println("What is the symbol of the player: " + (i+1));
            String symbol = sc.next();
            players.add(new Player(name,  symbol.charAt(0), PlayerType.HUMAN ));
        }
       /* Game game = Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();

        */
    }
}