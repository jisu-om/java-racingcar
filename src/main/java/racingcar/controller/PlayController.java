package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.TotalRound;
import racingcar.dto.CarDto;
import racingcar.dto.CarsDto;
import racingcar.dto.WinnerNamesDto;
import racingcar.view.OutputView;

import java.util.List;

public class PlayController {
    private final OutputView outputView;
    private final Cars cars;
    private final TotalRound totalRound;

    public PlayController(OutputView outputView, Cars cars, TotalRound totalRound) {
        this.outputView = outputView;
        this.cars = cars;
        this.totalRound = totalRound;
    }

    public static PlayController of(OutputView outputView, Cars cars, TotalRound totalRound) {
        return new PlayController(outputView, cars, totalRound);
    }

    public void play() {
        outputView.printStartResult();
        long currentRound = 0;
        while (currentRound < totalRound.getTotalRound()) {
            playRound();
            currentRound++;
        }
        printWinners();
    }

    private void playRound() {
        cars.play();
        List<CarDto> carDtos = cars.provideCars().stream()
                .map(car -> CarDto.of(car.provideName(), car.providePosition()))
                .toList();
        CarsDto carsDto = CarsDto.from(carDtos);
        outputView.printResult(carsDto);
    }

    private void printWinners() {
        List<Car> winners = cars.decideWinner();
        WinnerNamesDto winnerNamesDto = WinnerNamesDto.from(winners);
        outputView.printWinners(winnerNamesDto);
    }
}