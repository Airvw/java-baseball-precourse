package baseball;

public class Ball {
    private int number;
    private int position;
    public Ball(int number, int postion) {
        this.number = number;
        this.position = postion;
    }


    public String getBallStatus(Ball randomBall) {
        if(number == randomBall.number && position == randomBall.position) return "strike";
        if(number == randomBall.number) return "ball";
        return "nothing";
    }
}
