package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {
    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }
}
