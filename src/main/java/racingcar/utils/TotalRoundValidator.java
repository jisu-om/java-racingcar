package racingcar.utils;

import static racingcar.exception.ErrorMessage.NOT_NUMERIC_INPUT;
import static racingcar.exception.ErrorMessage.NOT_POSITIVE_INPUT;

public class TotalRoundValidator {
    public static long safeParseLong(String input) {
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_NUMERIC_INPUT.getMessage());
        }
    }

    public static void validatePositive(long value) {
        if (value < 0) {
            throw new IllegalArgumentException(NOT_POSITIVE_INPUT.getMessage());
        }
    }
}
