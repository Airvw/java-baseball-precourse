package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomBallsTest {

    private final int startInclusive = 1;
    private final int endInclusive = 9;
    private RandomBalls randomBalls;
    private Balls balls;

    @BeforeEach
    void setUp(){
        randomBalls = new RandomBalls();
        balls = new Balls();
    }

    @Test
    @DisplayName("pickNumberInRange() 테스트")
    void getRandomTest(){
        int randomNum = pickNumberInRange(startInclusive, endInclusive);
        assertThat(randomNum).isGreaterThanOrEqualTo(startInclusive);
        assertThat(randomNum).isLessThanOrEqualTo(endInclusive);
    }

    @Test
    @DisplayName("랜덤 3자리 수 테스트")
    void getRandomNumberTest(){
        assertThat(randomBalls.getRandomNumber().length()).isEqualTo(3);
    }

    @Test
    @DisplayName("랜덤 Balls 테스트")
    void getRandomBalls(){
        String randomNum = randomBalls.getRandomNumber();
        assertThat(balls.makeBalls(randomNum).size()).isEqualTo(3);
    }
}
