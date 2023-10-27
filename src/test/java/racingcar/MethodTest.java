package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.controller.GameController;
import racingcar.view.OutputView;

import static org.assertj.core.api.Assertions.*;

public class MethodTest {

    @Test
    void 시작_문구를_출력한다() {
        OutputView.printStartMessage();
        GameController gameController = GameController.getInstance();
//        assertThat(gameController.printStart());
    }


}
