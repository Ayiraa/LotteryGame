package main;

import java.util.List;
import java.util.Set;

public class LotteryService {
    public static int howManyGuessed(Set<Integer> generated, List<Integer> input){
        int guessed = 0;
        for (Integer integer : input) {
            if (generated.contains(integer)) {
                guessed++;
            }
        }

        return guessed;
    }
}
