package domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RacingGameTest {

    @Test
    void 자동차가_게임에_참여한다() {
        RacingGame game = new RacingGame(List.of("자동차1"), 5);
        assertThat(game.getCars().size()).isOne();
    }

    @Test
    void 가장_많이_이동한_자동차의_이름을_확인한다() {
        RacingGame game = new RacingGame(
                List.of(
                        "자동차1",
                        "자동차2",
                        "자동차3"
                ),
                5
        );
        game.getCars().get(0).move(8);
        assertThat(game.getWinners().get(0).getCarName()).isEqualTo("자동차1");
    }
    
}
