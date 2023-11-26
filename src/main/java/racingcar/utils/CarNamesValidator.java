package racingcar.utils;

import org.junit.platform.commons.util.StringUtils;

import java.util.HashSet;
import java.util.List;

import static racingcar.exception.ErrorMessage.*;

public class CarNamesValidator {
    private static final String CAR_NAME_DELIMITER = ",";
    private static final int CAR_NAME_MAXIMUM_SIZE = 5;

    public static List<String> safeSplit(String input) {
        validateEmpty(input);
        validateStartsOrEndsWithDelimiter(input, CAR_NAME_DELIMITER);
        return List.of(input.split(CAR_NAME_DELIMITER));
    }

    private static void validateEmpty(String input) {
        if (StringUtils.isBlank(input)) {
            throw new IllegalArgumentException(INVALID_CAR_NAMES.getMessage());
        }
    }

    private static void validateStartsOrEndsWithDelimiter(String input, String delimiter) {
        if (input.startsWith(delimiter) || input.endsWith(delimiter)) {
            throw new IllegalArgumentException(INVALID_CAR_NAMES.getMessage());
        }
    }

    public static void validateDuplicate(List<String> input) {
        if (input.size() != new HashSet<>(input).size()) {
            throw new IllegalArgumentException(DUPLICATE_CAR_NAMES.getMessage());
        }
    }

    public static void validateName(String name) {
        validateNotNull(name);
        validateLength(name);
    }

    private static void validateNotNull(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException(INVALID_BLANK_CAR_NAME.getMessage());
        }
    }

    private static void validateLength(String name) {
        if (name.length() > CAR_NAME_MAXIMUM_SIZE) {
            throw new IllegalArgumentException(INVALID_CAR_NAME_LENGTH.getMessage());
        }
    }
}
