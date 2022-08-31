package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static config.LotteryConfig.*;

public class UserInputManager {
    public static List<Integer> getInput(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        System.out.println("Enter your lottery numbers (between 1 and 99) :");
        int counter =1;
        while(input.size()< NUMBERS_TO_GENERATE){
            System.out.println("Enter your " + counter + " number: ");
            int num = scanner.nextInt();
            if(input.contains(num)){
                System.out.println("Found duplicate value! please enter another number");
            }else if(num>MAX_VAL || num < MIN_VAL){
                System.out.println("Value out of range! Please enter a number between 1 and 99");
            }else{
                input.add(num);
                counter++;
            }

        }
        return input;
    }
}
