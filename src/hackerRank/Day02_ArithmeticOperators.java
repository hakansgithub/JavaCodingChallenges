package hackerRank;

import java.util.Scanner;

public class Day02_ArithmeticOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        double a = (tip_percent * meal_cost) / 100;
        double b = (tax_percent * meal_cost) / 100;
        double c = meal_cost + a + b;

        int totalCost = (int) Math.round(c);

        System.out.println("The total meal cost is " + totalCost + " dollars.");

        scanner.close();
    }
}
