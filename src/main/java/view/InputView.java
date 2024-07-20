package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final int MAX_LENGTH_CARNAME = 5;
    private static final Scanner scanner = new Scanner(System.in);

    public static List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        final List<String> carNames = Arrays.stream(scanner.nextLine().split(",")).toList();
        carNames.forEach(carName -> {
            if (carName.length() > MAX_LENGTH_CARNAME) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        });
        return carNames;
    }

    public static int inputTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }
}
