package domain;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 자동차는_이름을_가지고_있다() {
        Car car = new Car("자동차1");
        assertThat(car.getCarName()).isEqualTo("자동차1");
    }

    @Test
    void 자동차의_시작위치는_0이다() {
        Car car = new Car("자동차1");
        assertThat(car.getPosition()).isZero();
    }

    @Test
    void 랜덤값이_4이상이면_전진한다() {
        Car car = new Car("자동차1");
        car.move(new Random().nextInt(4,10));
        assertThat(car.getPosition()).isOne();
    }

    @Test
    void 랜덤값이_3이하이면_정지한다() {
        Car car = new Car("자동차1");
        car.move(new Random().nextInt(0,4));
        assertThat(car.getPosition()).isZero();
    }
}