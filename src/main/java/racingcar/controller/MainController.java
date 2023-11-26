package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.TotalRound;
import racingcar.utils.CarNamesValidator;
import racingcar.utils.TotalRoundValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;
    //private OrderController orderController;  //컨트롤러 추가하는 경우

    private MainController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public static MainController create() {
        return new MainController(InputView.getInstance(), OutputView.getInstance());
    }

    public void run() {
        Cars cars = createCars();

    }

//    private void initializeControllers() {
//        orderController = OrderController.of(inputView, outputView);
//    }

    private Cars createCars() {
        return readUserInput(() -> {
            List<String> carNames = inputView.readCarNames();
            List<Car> validCars = carNames.stream()
                    .map(Car::from)
                    .toList();
            return Cars.from(validCars);
        });
    }

    private TotalRound createTotalRound() {
        return readUserInput(() -> {
            long totalRound = inputView.readTotalRound();
            return TotalRound.from(totalRound);
        });
    }

    private <T> T readUserInput(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }
}
