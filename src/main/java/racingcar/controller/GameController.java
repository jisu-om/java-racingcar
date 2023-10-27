package racingcar.controller;

import racingcar.utils.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

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

    private List<String> getCarNames() {
        String input = InputView.readInput();
        return Validator.validateCarNames(input);
    }

    private int getNumberOfRoundsFromUser() {
        String input = InputView.readInput();
        return Validator.validateNumberOfRounds(input);
    }
}
