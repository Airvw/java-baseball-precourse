package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball randomBall;
    private Ball pickBall;


    @BeforeEach
    void setUp(){
        randomBall = new Ball(9, 0);
    }

    @Test
    @DisplayName("스트라이크 테스트")
    void strikeTest(){
        pickBall = new Ball(9, 0);
        assertThat(pickBall.getBallStatus(randomBall)).isEqualTo("strike");
    }

    @Test
    @DisplayName("볼 테스트")
    void ballTest(){
        pickBall = new Ball(9, 1);
        assertThat(pickBall.getBallStatus(randomBall)).isEqualTo("ball");
    }

    @Test
    @DisplayName("낫싱 테스트")
    void nothingTest(){
        pickBall = new Ball(8, 0);
        assertThat(pickBall.getBallStatus(randomBall)).isEqualTo("nothing");
    }
}
