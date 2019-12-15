package hackerRank;

import java.util.Scanner;

public class Day03_ConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        scanner.close();
        String answer = "";

        /*
        Given an integer, , perform the following conditional actions:
        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
        Complete the stub code provided in your editor to print whether or not  is weird.
         */

        if (n % 2 == 1) {
            answer = "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                answer = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                answer = "Weird";
            } else if (n > 20) {
                answer = "Not Weird";
            }
        }
        System.out.println(answer);
    }
}
