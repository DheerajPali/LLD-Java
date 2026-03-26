package projects.TicTacToe.service.botPlayingStrategy;

import projects.TicTacToe.model.constants.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        return  switch (botDifficultyLevel){
            case EASY -> new RandomBotPlayingStrategy();
            case MEDIUM -> new RandomBotPlayingStrategy();
            case HARD -> new RandomBotPlayingStrategy();
        };
    }
}
