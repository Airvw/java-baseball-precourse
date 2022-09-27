package baseball;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.*;

public class RandomBall {

    private final int startInclusive = 1;
    private final int endInclusive = 9;
    private int[] checkArr = new int[endInclusive + 1];
    public List<Integer> getRandomNumber() {
        List<Integer> result = new ArrayList<>();
        while(result.size() <  3){
            int randomNum = pickNumberInRange(startInclusive, endInclusive);
            result = isNotSame(result, randomNum);
        }

        return result;
    }

    private List<Integer> isNotSame(List<Integer> result, int randomNum) {
        if(checkArr[randomNum]++ == 0){
            result.add(randomNum);
        }
        return result;
    }
}
