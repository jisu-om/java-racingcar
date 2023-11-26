package racingcar.domain;

import racingcar.utils.CarNamesValidator;
import racingcar.utils.RandomNumberGenerator;

import static racingcar.constants.Constants.MOVE_THRESHOLD;

public class Car {
    private final String name;
    private int position;

    private Car(String name) {
        this.name = name;
    }

    public static Car from(String name) {
        CarNamesValidator.validateName(name);
        return new Car(name);
    }

    public void play() {
        int randomNumber = RandomNumberGenerator.generate();
        moveOrStop(randomNumber);
    }

    private void moveOrStop(int randomNumber) {
        if (randomNumber >= MOVE_THRESHOLD) {
            position++;
        }
    }

    public boolean isEqualPosition(int value) {
        return position == value;
    }

    public String provideName() {
        return name;
    }

    public int providePosition() {
        return position;
    }
}
