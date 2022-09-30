package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private int strikeCnt = 0;
    private int ballCnt = 0;
    private List<Ball> ballList = new ArrayList<>();

    public Balls(String numberStr) {
        for(int i = 0 ; i < numberStr.length(); i++){
            ballList.add(new Ball(numberStr.charAt(i) - '0', i));
        }
    }

//    public void checkBallStatus(List<Ball> ballList){
//        for(Ball ball : ballList){
//            isStike()
//        }
//    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }
    public List<Ball> getBalls() {
        return ballList;
    }
}
