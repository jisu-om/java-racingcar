package racingcar.domain;

import racingcar.utils.TotalRoundValidator;

public class TotalRound {
    private final int totalRound;

    private TotalRound(int totalRound) {
        this.totalRound = totalRound;
    }

    public static TotalRound from(int totalRound) {
        TotalRoundValidator.validatePositive(totalRound);
        return new TotalRound(totalRound);
    }

    public int getTotalRound() {
        return totalRound;
    }
}