package com.company;
import java.util.*;
public class

Task_1 {
    public static void main(String[] args) {
        int ans, guess;
        final int max = 100;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ans = rand.nextInt(max) + 1;
        for(int i = 0 ; i<6 ; i++) {
            System.out.println("Guess a number between 1 and 100 :");
            guess = sc.nextInt();
            if(guess  == ans){
                System.out.println("You guessed correctly.");
                break;
            }
            else if(guess< ans) {
                System.out.println("Your guess is too low.");
            }
            else if (guess > ans) {
                System.out.println("Your guess is too high.");

            }
            if (i>6){
                System.out.println();
                System.out.println("The answer was : " +ans);
            }
        }
    }

}
