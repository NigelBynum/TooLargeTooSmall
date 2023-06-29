/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Guess the Number!");
        int n = 20;
        int guess = 0;
        int counter = 0;

        while (guess != n) {
            System.out.println("You Guessed:");
            guess = in.nextInt();
            counter++;

            if (guess > n) {
                System.out.println("Too Large");
            } else if (guess < n) {
                System.out.println("Too Large");
            } else {
                System.out.println("Your Correct!");
                System.out.println("It took you " + counter + " times to guess correctly");
            }
        }
    }
}
