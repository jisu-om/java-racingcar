package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validator;

public class InputView {

    public static String getCarNames() {
        return Console.readLine();
    }

    public static int getNumberOfRoundsFromUser() {
        String input = Console.readLine();
        return Validator.validateNumberOfRounds(input);
    }
}
