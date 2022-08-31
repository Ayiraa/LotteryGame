import java.util.*;

public class NumberGenerator {

    public static Set<Integer> randomNumbers(){
        Random random = new Random();
        //used hashSet to avoid duplicate values
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 6) {
            numbers.add(random.nextInt(98)+1);
        }
        return numbers;
    }

}
