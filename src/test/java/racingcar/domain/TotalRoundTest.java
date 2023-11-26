package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class TotalRoundTest {
    @Test
    void create() {
        //given, when
        TotalRound totalRound = TotalRound.from(1);

        //then
        assertThat(totalRound).isNotNull();
    }

    @ParameterizedTest(name = "[{index}] {0} 이면 TotalRound 생성 시 예외 발생한다.")
    @ValueSource(ints = {-100, 0})
    void exception(int element) {
        assertThatThrownBy(() -> TotalRound.from(element))
                .isInstanceOf(IllegalArgumentException.class);
    }
}