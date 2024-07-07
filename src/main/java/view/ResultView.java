package view;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public static void printWinners(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getCarName)
                .collect(Collectors.joining(","));

        System.out.println(String.format("%s가 최종 우승했습니다.", winnerNames));
    }

    public static void printPosition(List<Car> cars) {
        for (Car car: cars) {
            String position = "-".repeat(car.getPosition());
            System.out.println(String.format("%s : %s", car.getCarName(), position));
        }
        System.out.println();
    }
}
