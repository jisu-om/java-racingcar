package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OutputViewTest {

    @DisplayName("printResult() 메서드 작동 테스트1")
    @Test
    void printResult1() {
        int numberOfRounds = 1;
        List<String> names = Arrays.asList("test1", "test2", "test3");
        List<List<Boolean>> histories = Arrays.asList(Arrays.asList(true), Arrays.asList(false), Arrays.asList(false));
        OutputView.printResult(numberOfRounds, names, histories);
    }

    @DisplayName("printResult() 메서드 작동 테스트2")
    @Test
    void printResult2() {
        int numberOfRounds = 2;
        List<String> names = Arrays.asList("test1", "test2");
        List<List<Boolean>> histories = Arrays.asList(Arrays.asList(false, true), Arrays.asList(true, false));
        OutputView.printResult(numberOfRounds, names, histories);
    }

    @DisplayName("printResult() 메서드 작동 테스트3")
    @Test
    void printResult3() {
        int numberOfRounds = 3;
        List<String> names = Arrays.asList("test1", "test2", "333");
        List<List<Boolean>> histories = Arrays.asList(Arrays.asList(false, true, true), Arrays.asList(true, false, true), Arrays.asList(true, true, true));
        OutputView.printResult(numberOfRounds, names, histories);
    }



}