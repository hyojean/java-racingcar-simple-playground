import domain.RacingGame;
import view.InputView;
import view.ResultView;

public class Application {
    public static void main(final String... args) {
        final var carNames = InputView.inputCarNames();
        final var tryCount = InputView.inputTryCount();

        final var racingGame = new RacingGame(carNames, tryCount);
        racingGame.start();

        ResultView.printWinners(racingGame.getWinners());
    }
}