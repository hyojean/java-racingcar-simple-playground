package domain;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private List<String> carNames;
    private int tryCount;
    private List<Car> cars;

    public RacingGame(List<String> carNames, int tryCount) {
        this.carNames = carNames;
        this.tryCount = tryCount;
        this.cars = this.carNames.stream().map(it -> new Car(it)).toList();
    }

    public void start() {
        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            for (Car car : cars) {
                car.move(new Random().nextInt(10));
            }
        }
    }

    public List<Car> getWinners() {
        int maxPosition = cars.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .get()
                .getPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
    }

    public List<Car> getCars() {
        return cars;
    }
}
