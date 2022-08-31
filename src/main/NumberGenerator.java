package main;


import java.util.*;

import static config.LotteryConfig.*;


public class NumberGenerator {

    public static Set<Integer> randomNumbers(){
        Random random = new Random();
        //used hashSet to avoid duplicate values
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() <NUMBERS_TO_GENERATE) {
            numbers.add(random.nextInt(MAX_VAL - MIN_VAL)+MIN_VAL);
        }
        return numbers;
    }

}
