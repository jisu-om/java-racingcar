package racingcar.controller;

import racingcar.view.OutputView;

public class GameController {

    private static final GameController instance = new GameController();

    public static GameController getInstance() {
        return instance;
    }

    private GameController() {
    }

    public void printStart() {
        OutputView.printStartMessage();
    }

    public void play() {

    }

    public void printResult() {

    }

    public void determineWinner() {

    }
}
