package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.TotalRound;
import racingcar.view.OutputView;

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
        long currentRound = 0;
        while (currentRound < totalRound.getTotalRound()) {
            playRound();
            currentRound++;
        }
    }

    private void playRound() {
        //TODO round 실행 -> 실행결과 dto로 생성 () -> outputView 에 전달하여 라운드 결과 출력
        cars.play();

    }
}