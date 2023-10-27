package racingcar.domain;

import racingcar.utils.NumberGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {
    private static final int MOVEMENT_THRESHOLD = 4;
    private String name;
    private List<Boolean> roundResultHistory = new ArrayList<>();

    private Car(String name) {
        this.name = name;
    }

    public static Car create(String name) {
        return new Car(name);
    }

    public void saveRoundResult() {
        roundResultHistory.add(move(getRandomNumber()));
    }

    public int calculateScore() {
        int score = 0;
        for (Boolean roundResult : roundResultHistory) {
            if (roundResult) {
                score++;
            }
        }
        return score;
    }

    private boolean move(int number) {
        return (number >= MOVEMENT_THRESHOLD);
    }

    private int getRandomNumber() {
        return NumberGenerator.generateRandomNumber();
    }

    public String getName() {
        return name;
    }
}
