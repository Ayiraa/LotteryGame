import java.util.*;


public class NumberGenerator {

    public static Set<Integer> randomNumbers(){
        Random random = new Random();
        //used hashSet to avoid duplicate values
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < LotteryConfig.NUMBERS_TO_GENERATE) {
            numbers.add(random.nextInt(LotteryConfig.MAX_VAL - LotteryConfig.MIN_VAL)+LotteryConfig.MIN_VAL);
        }
        return numbers;
    }

}
