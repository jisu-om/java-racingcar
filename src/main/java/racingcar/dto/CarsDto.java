package racingcar.dto;

import java.util.List;

public class CarsDto {
    private final List<CarDto> carDtos;

    private CarsDto(List<CarDto> carDtos) {
        this.carDtos = carDtos;
    }

    public static CarsDto from(List<CarDto> carDtos) {
        return new CarsDto(carDtos);
    }

    public List<CarDto> getCarDtos() {
        return carDtos;
    }
}
