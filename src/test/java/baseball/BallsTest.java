package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls balls;
    private List<Ball> playerBallList;

    public BallsTest() {
    }

    @BeforeEach
    void setUp(){
        balls = new Balls();
        playerBallList = balls.makeBalls("456");
    }

    @ParameterizedTest
    @DisplayName("String으로 Balls 생성 테스트")
    @CsvSource(value = {"0:4", "1:5", "2:6"}, delimiter = ':')
    void getBalls(int position, int number){
        assertThat(playerBallList.get(position).getNumber()).isEqualTo(number);
    }

}
