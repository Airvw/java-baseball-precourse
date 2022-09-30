package baseball;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomBall {

    private final int startInclusive = 1;
    private final int endInclusive = 9;
    private int[] checkArr = new int[endInclusive + 1];

    public String getRandomNumber() {
        String result = "";
        while(result.length() <  3){
            int randomNum = pickNumberInRange(startInclusive, endInclusive);
            result += isNotSame(randomNum);
        }

        return result;
    }

    private String isNotSame(int randomNum) {
        StringBuilder sb = new StringBuilder();
        if(checkArr[randomNum]++ == 0){
            sb.append(randomNum);
        }
        return sb.toString();
    }
}
