package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.NumberGenerator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @DisplayName("자동차는 0~9의 랜덤한 값을 뽑는다")
    @Test
    void generateNumber() {
        int number = NumberGenerator.generateRandomNumber();
        Assertions.assertThat(number).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
    }

}