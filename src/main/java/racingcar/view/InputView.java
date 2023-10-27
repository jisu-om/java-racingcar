package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

import java.util.List;

public class InputView {

    public static List<String> getCarNames() {
        return Validator.validateCarNames(Console.readLine());
    }

    public static int getNumberOfRoundsFromUser() {
        String input = Console.readLine();
        return Validator.validateNumberOfRounds(input);
    }
}
