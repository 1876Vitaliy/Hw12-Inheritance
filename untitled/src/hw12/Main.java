package hw12;

import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your bid: ");
        double bid = scanner.nextDouble();

        Random random = new Random();
        int number = random.nextInt(10);

        CalcProgram calc;

        if (number < 3) {
            calc = new Less3();
        } else if (number <= 7) {
            calc = new More3Less7();
        } else {
            calc = new More7();
        }
        System.out.println("Your number is " + number);
        double winCash = calc.calcProgram(bid, number);
        System.out.println("Your win cash: " + winCash);
    }
}