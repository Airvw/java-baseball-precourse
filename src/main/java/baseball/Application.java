package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        baseBall();
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        try{
            String isReplay = Console.readLine();
            if(!"1".equals(isReplay) && !"2".equals(isReplay)) throw new IllegalArgumentException();
            if("1".equals(isReplay)) baseBall();
            if("2".equals(isReplay)) System.exit(0);
        }catch (IllegalArgumentException e){
            System.exit(0);
        }
    }

    private static void baseBall() {
        Balls balls = new Balls();
        boolean gamePlay = true;
        while(gamePlay) {
            String playerNum = getStringNumber();
            List<Ball> playerBallList = balls.makeBalls(playerNum);
            Play play = balls.checkPlayerBalls(playerBallList);
            output(play.getBallCnt(), play.getStrikeCnt());
            gamePlay = !play.isGameOver();
        }
    }

    private static void output(int ballCnt, int strikeCnt) {
        if(ballCnt > 0) System.out.print(ballCnt + "볼 ");
        if(strikeCnt > 0) System.out.print(strikeCnt + "스트라이크 ");
        if(ballCnt == 0 && strikeCnt == 0) System.out.print("낫싱");
        System.out.println();
    }

    private static String getStringNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String numberStr = "";
        try {
            numberStr = Console.readLine();
            if(numberStr.length() != 3) throw new IllegalArgumentException("wrong input");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.exit(0);
        }
        return numberStr;
    }
}
