package racingcar.domain;

import racingcar.utils.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private static final int MOVEMENT_THRESHOLD = 4;
    private String name;
    private List<Integer> roundResultList = new ArrayList<>();

    public void saveRoundResult() {

    }

    private boolean move(int number) {
        return (number >= MOVEMENT_THRESHOLD);
    }

    private int getRandomNumber() {
        return NumberGenerator.generateRandomNumber();
    }


}
