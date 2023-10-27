package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.utils.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
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

    public void play() {
        prepareGame();
        Cars cars = createCars();
        for (int i = 0; i < numberOfRounds; i++) {
            playRound(cars);
        }
        showResult(cars);
    }

    private void prepareGame() {
        OutputView.printStartMessage();
        carNames = getCarNames();
        numberOfRounds = getNumberOfRounds();
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

    private Cars createCars() {
        List<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(Car.create(carName));
        }
        Cars cars = Cars.create(carList);
        return cars;
    }

    private void playRound(Cars cars) {
        for (Car car : cars.getCars()) {
            car.saveRoundResult();
        }
    }

    private void showResult(Cars cars) {
        OutputView.printResultStartMessage();
        List<List<Boolean>> histories = new ArrayList<>();
        for (Car car : cars.getCars()) {
            histories.add(car.getRoundResultHistory());
        }
        OutputView.printResult(numberOfRounds, carNames, histories);

        String winnerName = getWinnerName(cars);
        OutputView.printWinnerMessage(winnerName);

    }

    private String getWinnerName(Cars cars) {  //TODO 메서드 이름 고민
        List<Car> winners = cars.calculateWinner();
        if (winners.size() > 1) {
            List<String> names = new ArrayList<>();
            for (Car winner : winners) {
                names.add(winner.getName());
            }
            return String.join(", ", names);
        }
        return winners.get(0).getName();
    }
}
