package baseball;

public class Play {
    private int strikeCnt = 0;
    private int ballCnt = 0;

    public boolean isGameOver(){
        return strikeCnt == 3;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }

    public void checkStatusCnt(BallStatus ballStatus){
        if(ballStatus.isStrike()) strikeCnt++;
        if(ballStatus.isBall()) ballCnt++;
    }
}
