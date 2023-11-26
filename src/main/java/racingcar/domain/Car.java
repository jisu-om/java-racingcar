package racingcar.domain;

import racingcar.utils.CarNamesValidator;

import static racingcar.constants.Constants.MOVE_THRESHOLD;

public class Car {
    private final String name;
    private long position;

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

    public String provideName() {
        return name;
    }

    public long providePosition() {
        return position;
    }
}
