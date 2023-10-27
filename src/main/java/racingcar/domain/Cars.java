package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars create(List<Car> cars) {
        return new Cars(cars);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public List<Car> calculateWinner() {
        cars.sort((s1, s2) -> s2.calculateScore() - s1.calculateScore());

        int numberOfWinner = getNumberOfWinner();

        if (numberOfWinner != 0) {
            List<Car> winners = new ArrayList<>();
            for (int i = 0; i < numberOfWinner; i++) {
                winners.add(cars.get(i));
            }
            return Collections.unmodifiableList(winners);
        }
        return Collections.unmodifiableList(Arrays.asList(cars.get(0)));
        //String으로의 변환은 컨트롤러에서 String.join()
    }

    private int getNumberOfWinner() {
        int numberOfWinner = 0;
        for (int i = 0; i < cars.size() - 1; i++) {
            if (cars.get(i).calculateScore() != cars.get(i + 1).calculateScore()) {
                break;
            }
            numberOfWinner++;
        }
        return numberOfWinner;
    }
}
