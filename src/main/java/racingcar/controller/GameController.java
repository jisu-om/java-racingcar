package racingcar.controller;

import racingcar.utils.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {
    private static final GameController instance = new GameController();

    private int numberOfRounds;

    private List<String> carNames;

    public static GameController getInstance() {
        return instance;
    }

    private GameController() {
    }

    public void prepareGame() {
        OutputView.printStartMessage();
        carNames = getCarNames();
        numberOfRounds = getNumberOfRounds();
    }

    public void playRound() {

    }

    public void printResult() {

    }

    public void determineWinner() {

    }

    private List<String> getCarNames() {
        String input = InputView.readInput();
        return Validator.validateCarNames(input);
    }

    private int getNumberOfRounds() {
        OutputView.printAskNumberOfRounds();
        String input = InputView.readInput();
        return Validator.validateNumberOfRounds(input);
    }
}
