package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomBallTest {

    private final int startInclusive = 1;
    private final int endInclusive = 9;
    private RandomBall randomBall;

    @BeforeEach
    void setUp(){
        randomBall = new RandomBall();
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
        assertThat(randomBall.getRandomNumber().size()).isEqualTo(3);
    }
}
