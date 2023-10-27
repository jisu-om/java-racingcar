package racingcar.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validator {

    public static final int MAXIMUM_NAME_LENGTH = 5;

    public static List<String> validateCarNames(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 입력해주세요.(이름은 쉼표(,) 기준으로 구분)");
        }

        if (input.startsWith(",")) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 여러개 입력하는 경우 쉼표(,)를 사용해주세요.");
        }

        if (input.endsWith(",")) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름을 여러개 입력하는 경우 쉼표(,)를 사용해주세요.");
        }

        List<String> nameList = Arrays.asList(input.split(","));
        for (String name : nameList) {
            if (name.length() > MAXIMUM_NAME_LENGTH) {
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 공백 포함 5자 이하 여야 합니다.");
            }
            if (name.isBlank()) {
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 공백일 수 없습니다.");
            }
            //TODO 자동차 이름이 같을 경우?
        }
        return nameList;
    }

    public static int validateNumberOfRounds(String input) {
        //TODO 0, 숫자가 아닌 값은 예외 처리
        int intInput = validateNumeric(input);
        validateIsZero(intInput);
        return intInput;
    }

    public static int validateNumeric(String input) {
        int intValue;
        try {
            intValue = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 1 이상의 숫자를 입력해주세요.");
        }
        return intValue;
    }

    public static void validateIsZero(int input) {
        if (input == 0) {
            throw new IllegalArgumentException("[ERROR] 1 이상의 숫자를 입력해주세요.");
        }
    }


}
