package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.CarNamesValidator;
import racingcar.utils.TotalRoundValidator;

import java.util.List;

public class InputView {
    private static final InputView instance = new InputView();
    private static final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TOTAL_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";


    private InputView() {
    }

    public static InputView getInstance() {
        return instance;
    }

    public List<String> readCarNames() {
        System.out.println(START_MESSAGE);
        String input = Console.readLine();
        List<String> carNamesInput = CarNamesValidator.safeSplit(input);
        CarNamesValidator.validateDuplicate(carNamesInput);
        return carNamesInput;
    }

    public long readTotalRound() {
        System.out.println(TOTAL_ROUND_MESSAGE);
        String input = Console.readLine();
        return TotalRoundValidator.safeParseLong(input);
    }

}
