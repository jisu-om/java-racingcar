package racingcar.dto;

import racingcar.domain.Car;

import java.util.List;

public class WinnerNamesDto {
    private final List<String> names;

    private WinnerNamesDto(List<String> names) {
        this.names = names;
    }

    public static WinnerNamesDto from(List<Car> cars) {
        List<String> names = cars.stream()
                .map(Car::provideName)
                .toList();
        return new WinnerNamesDto(names);
    }

    public List<String> getNames() {
        return names;
    }

    public String getNameByIndex(int index) {
        return names.get(index);
    }

    public int getSize() {
        return names.size();
    }
}
