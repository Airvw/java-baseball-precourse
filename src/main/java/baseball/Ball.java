package baseball;

public class Ball {
    private int number;
    private int position;

    public Ball(int number, int postion) {
        this.number = number;
        this.position = postion;
    }


    public BallStatus getBallStatus(Ball randomBall) {
        if(number == randomBall.number && position == randomBall.position) return BallStatus.STRIKE;
        if(number == randomBall.number) return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

    public int getNumber() {
        return number;
    }

    public int getPosition() {
        return position;
    }
}
