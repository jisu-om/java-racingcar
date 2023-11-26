package racingcar.domain;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars from(List<Car> cars) {
        return new Cars(cars);
    }

    public void play() {
        cars.forEach(Car::play);
    }

    public List<Car> decideWinner() {
        int maxPosition = cars.stream()
                .mapToInt(Car::providePosition)
                .max()
                .getAsInt();

        return cars.stream()
                .filter(car -> car.isEqualPosition(maxPosition))
                .toList();
    }

    public List<Car> provideCars() {
        return List.copyOf(cars);
    }
}
