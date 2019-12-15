package hackerRank;

import java.util.Scanner;

public class Day06_LetsReview {

    Scanner scanner = new Scanner(System.in);
    String s;
    int t;

    public int setTestCase () {
        t = scanner.nextInt();
        scanner.nextLine();
        return t;
    }

    public void setString () {
        s = scanner.nextLine();
    }

    public void printEvenIndexChar () {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                System.out.println(s.charAt(i));
            }
        }
    }

    public void printOddIndexChar () {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i % 2 != 0) {
                System.out.println(s.charAt(i));
            }
        }
    }


    public static void main (String[] args) {

        Day06_LetsReview num = new Day06_LetsReview();
        int t = num.setTestCase();

        for (int a0 = 0; a0 < t; a0++) {
            num.setString();
            num.printEvenIndexChar();
            System.out.print(" ");
            num.printOddIndexChar();
            System.out.println("\n");
        }
    }
}
