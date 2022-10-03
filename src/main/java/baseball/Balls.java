package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private RandomBalls randomBalls = new RandomBalls();
    private List<Ball> randomBallList;

    public Balls() {
        this.randomBallList = makeBalls(randomBalls.getRandomNumber());
    }

    public List<Ball> makeBalls(String numberStr){
        List<Ball> ballList = new ArrayList<>();
        for(int i = 0; i < numberStr.length(); i++){
            ballList.add(new Ball(numberStr.charAt(i) - '0', i));
        }
        return ballList;
    }

    public Play checkPlayerBalls(List<Ball> playerBallList){
        Play play = new Play();
        playerBallList.stream().map(this::checkBall).forEach(play::checkStatusCnt);
        return play;
    }
    private BallStatus checkBall(Ball playerBall) {
        return randomBallList.stream().map(randomBall -> randomBall.getBallStatus(playerBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
