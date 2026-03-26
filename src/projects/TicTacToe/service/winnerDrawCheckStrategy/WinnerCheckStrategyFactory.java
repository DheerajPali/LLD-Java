package projects.TicTacToe.service.winnerDrawCheckStrategy;

import projects.TicTacToe.model.constants.WinnerCheckStrategyType;

public class WinnerCheckStrategyFactory {

    public static WinnerCheckStrategy getWinnerCheckStrategy(WinnerCheckStrategyType winnerCheckStrategyType, int dimension){
        return switch (winnerCheckStrategyType){
            case WinnerCheckStrategyType.OrderOfN -> new OrderNWinnerCheckStrategy();
            case WinnerCheckStrategyType.OrderOfNsq -> new OrderNsqWinnerCheckStrategy();
            case WinnerCheckStrategyType.OrderOfOne -> OrderOneWinnerCheckStrategy.getOrderOneWinnerCheckStrategy(dimension);
        };
    }

}
