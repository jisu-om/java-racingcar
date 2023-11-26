package racingcar.domain;

import racingcar.utils.CarNamesValidator;

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


}
