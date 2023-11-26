package racingcar.view;

import racingcar.dto.CarDto;
import racingcar.dto.CarsDto;

import java.util.List;

public class OutputView {
    private static final OutputView instance = new OutputView();
    private static final String START_RESULT_MESSAGE = "실행 결과";
    private static final String RESULT_FORMAT = "%s : %s";
    private static final String MOVE_SYMBOL = "-";
    private static final String WINNER_MESSAGE_FORMAT = "최종 우승자 : %s";


    private OutputView() {
    }

    public static OutputView getInstance() {
        return instance;
    }

    public void printError(String errorMessage) {
        System.out.println(errorMessage);
    }

    public void printStartResult() {
        printLine();
        System.out.println(START_RESULT_MESSAGE);
    }

    private void printLine() {
        System.out.println();
    }

    public void printResult(CarsDto carsDto) {
        List<CarDto> carDtos = carsDto.getCarDtos();
        carDtos.forEach(this::printCarResult);
        printLine();
    }

    private void printCarResult(CarDto car) {
        String positionImage = MOVE_SYMBOL.repeat(car.getPosition());
        String resultMessage = String.format(RESULT_FORMAT, car.getName(), positionImage);
        System.out.println(resultMessage);
    }

    public void printWinners() {
        String.format(WINNER_MESSAGE_FORMAT, );
    }
}
