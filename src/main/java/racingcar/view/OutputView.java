package racingcar.view;

import java.util.ArrayList;
import java.util.List;

public class OutputView {
    public static final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ROUND_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    public static final String WINNER_MESSAGE_FORMAT = "최종 우승자 : %s";
    public static final String RESULT_MESSAGE = "실행 결과";


    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printAskNumberOfRounds() {
        System.out.println(ROUND_NUMBER_MESSAGE);
    }

    public static void printResultStartMessage() {
        System.out.println();
        System.out.println(RESULT_MESSAGE);
    }

    public static void printResult(int numberOfRounds, List<String> names, List<List<Boolean>> histories) {
        List<String> barImages = new ArrayList<>();
        for (int roundIndex = 0; roundIndex < numberOfRounds; roundIndex++) {
            String resultFormat = createResultFormat(names);
            if (roundIndex == 0) {
                barImages = makeBarImages(histories, roundIndex);
            }
            if (roundIndex != 0) {
                List<String> newBarImages = makeBarImages(histories, roundIndex);
                for (int i = 0; i < barImages.size(); i++) {
                    barImages.set(i, barImages.get(i) + newBarImages.get(i));
                }
            }
            String resultMessage = String.format(resultFormat, barImages.toArray());
            System.out.println(resultMessage);
        }
    }

    private static List<String> makeBarImages(List<List<Boolean>> histories, int roundIndex) {
        List<String> barImages = new ArrayList<>();
        for (List<Boolean> history : histories) {
            if (history.get(roundIndex)) {
                barImages.add("-");
                continue;
            }
            barImages.add("");
        }
        return barImages;
    }

    private static String createResultFormat(List<String> names) {
        //참여한 자동차 개수가 몇개인지 알아야 함
        //자동차의 score 알아야 함
        //"이름 : %s\n이름 : %s\n이름 : %s\n"
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name + " : %s\n");
        }
        return sb.toString();
    }

    public static void printWinnerMessage(String winnerName) {
        String winnerMessage = String.format(WINNER_MESSAGE_FORMAT, winnerName);
        System.out.println(winnerMessage);
    }


}
