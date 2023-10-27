package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {
    private static final int MINIMUM_VALUE = 0;
    private static final int MAXIMUM_VALUE = 9;

    public static int generateRandomNumber() {
        return Randoms.pickNumberInRange(MINIMUM_VALUE, MAXIMUM_VALUE);
    }
}
