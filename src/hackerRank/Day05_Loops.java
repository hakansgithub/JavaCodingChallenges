package hackerRank;

import java.util.Scanner;

public class Day05_Loops {

    /*
    Given an integer, , print its first  multiples.
    Each multiple  (where ) should be printed on a new line in the form: n x i = result.
     */
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + i * n);
        }
    }
}
