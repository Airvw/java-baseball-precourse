package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls balls;

    @BeforeEach
    void setUp(){
        balls = new Balls("456");
    }

    @Test
    @DisplayName("numberStr을 Balls로 변경 테스트")
    void getBalls(){
        assertThat(balls.getBalls().size()).isEqualTo(3);
        assertThat(balls.getBalls().get(0).getNumber()).isEqualTo(4);
        assertThat(balls.getBalls().get(0).getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("Balls들의 스트라이크 테스트")
    void getStrikeCnt(){
        assertThat(balls.getStrikeCnt()).isEqualTo(1);
    }
}
