package racingcar.domain;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {
    @Test
    void create() {
        //given, when
        Car car = Car.from("name");

        //then
        assertThat(car).isNotNull();
    }

    @ParameterizedTest(name = "[{index}] Car 의 이름이 ''{0}'' 이면 예외 발생한다.")
    @ValueSource(strings = {"abcdefg", "", "  "})
    void cannotCreateBonusNumber(String element) {
        assertThatThrownBy(() -> Car.from(element))
                .isInstanceOf(IllegalArgumentException.class);
    }
}