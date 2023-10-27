package racingcar.view;

public class OutputView {
    public static final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ROUND_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printAskNumberOfRounds() {
        System.out.println(ROUND_NUMBER_MESSAGE);
    }

    public static void printRoundResult() {

    }

    public static void printWinnerMessage(String winnerName) {
        System.out.println("최종 우승자 : " + winnerName);
    }


}
