package racingcar.domain;

import racingcar.utils.TotalRoundValidator;

public class TotalRound {
    private final long totalRound;

    private TotalRound(long totalRound) {
        this.totalRound = totalRound;
    }

    public static TotalRound from(long totalRound) {
        TotalRoundValidator.validatePositive(totalRound);
        return new TotalRound(totalRound);
    }

    public long getTotalRound() {
        return totalRound;
    }
}
