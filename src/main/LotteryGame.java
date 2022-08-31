package main;

import java.util.List;
import java.util.Set;

public class LotteryGame {
    public static void main(String[] args){
        Set<Integer> generated = NumberGenerator.randomNumbers();
        List<Integer> input = UserInputManager.getInput();
        System.out.println("Your lottery numbers are: " + input);
        System.out.println("Today's lucky numbers are: " + generated);
        int guessed = LotteryService.howManyGuessed(generated,input);
        if(guessed==0) System.out.println("Bummer :( You guessed " + guessed+ " numbers");
        else System.out.println("Congratulations! You guessed "+ guessed+" numbers !");
        if(guessed==6) System.out.println("You win the main prize!");

    }
}
