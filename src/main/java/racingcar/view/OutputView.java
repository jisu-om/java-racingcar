package racingcar.view;

public class OutputView {
    private static final OutputView instance = new OutputView();
    private static final String START_RESULT_MESSAGE = "실행 결과";
    private static final String RESULT_FORMAT = "%s : %s";
    private static final String MOVE_SYMBOL = "-";
    private static final String WINNER_MESSAGE_FORMAT = "최종 우승자 : %s";


    private OutputView() {
    }

    public static OutputView getInstance() {
        return instance;
    }

    public void printError(String errorMessage) {
        System.out.println(errorMessage);
    }


}
