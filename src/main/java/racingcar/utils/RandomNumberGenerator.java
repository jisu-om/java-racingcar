package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.constants.Constants.MAXIMUM_RANDOM_NUMBER;
import static racingcar.constants.Constants.MINIMUM_RANDOM_NUMBER;

public class RandomNumberGenerator {
    public static int generate() {
        return Randoms.pickNumberInRange(MINIMUM_RANDOM_NUMBER, MAXIMUM_RANDOM_NUMBER);
    }
}
