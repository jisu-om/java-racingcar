package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @DisplayName("이름이 하나만 입력된 경우 정상 처리")
    @Test
    void validateOneName() {
        List<String> nameList = Validator.validateCarNames("car1");
        assertThat(nameList).containsExactly("car1");
        assertThat(nameList.size()).isEqualTo(1);
    }

    @DisplayName(", 로 구분된 5자 이하의 이름이 여러개 입력된 경우 정상 처리")
    @Test
    void validateNames() {
        List<String> nameList = Validator.validateCarNames("car1,car23,car4");
        assertThat(nameList).containsExactly("car1", "car23", "car4");
        assertThat(nameList.size()).isEqualTo(3);
    }

    @DisplayName("6자 이상의 이름 하나만 입력될 경우 예외 발생")
    @Test
    void validateOneName_x() {
        assertThatThrownBy(() -> Validator.validateCarNames("number1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("여러 이름 중 하나가 6자 이상인 경우 예외 발생")
    @Test
    void validateNames_x() {
        assertThatThrownBy(() -> Validator.validateCarNames("number1,name"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("공백이 포함되어 6자 이상이 되는 경우에도 예외 발생")
    @Test
    void validateName_space_ex() {
        assertThatThrownBy(() -> Validator.validateCarNames("name1, name2"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름이 공백인 경우 예외 발생")
    @Test
    void validateName_blank_ex() {
        assertThatThrownBy(() -> Validator.validateCarNames("name1, "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("공백 입력 시 예외 발생")
    @Test
    void validateName_blank_ex2() {
        assertThatThrownBy(() -> Validator.validateCarNames(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName(",로 끝나는 경우 예외 발생")
    @Test
    void validateName_ends_with_ex() {
        assertThatThrownBy(() -> Validator.validateCarNames("name1,"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName(",로 시작하는 경우 예외 발생")
    @Test
    void validateName_starts_with_ex() {
        assertThatThrownBy(() -> Validator.validateCarNames(",name1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("게임 진행 횟수를 3을 입력하면 정상 진행")
    @Test
    void validate_number_of_rounds() {
        int number = Validator.validateNumberOfRounds("3");
        assertThat(number).isEqualTo(3);
    }

    @DisplayName("게임 진행 횟수를 0을 입력하면 예외 발생")
    @Test
    void validate_number_of_rounds_x1() {
        assertThatThrownBy(() -> Validator.validateNumberOfRounds("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("게임 진행 횟수를 문자를 입력하면 예외 발생")
    @Test
    void validate_number_of_rounds_x2() {
        assertThatThrownBy(() -> Validator.validateNumberOfRounds("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("게임 진행 횟수를 빈 문자열을 입력하면 예외 발생")
    @Test
    void validate_number_of_rounds_x3() {
        assertThatThrownBy(() -> Validator.validateNumberOfRounds(""))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("게임 진행 횟수를 공백을 입력하면 예외 발생")
    @Test
    void validate_number_of_rounds_x4() {
        assertThatThrownBy(() -> Validator.validateNumberOfRounds(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }




}