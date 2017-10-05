package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of each item ordered. Enter 0 when done.");
        double num;
        double sum = 0.0;
        do {
            num = input.nextDouble();
            sum+=num;
        } while (num != 0);

        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println("Total:");
        System.out.println("$" + sum);

        double tax = sum * .025;
        tax = Math.round(tax * 100.0) / 100.0;
        System.out.println("Tax: $" + tax);

        double total = sum + tax;
        total = Math.round(total * 100.0) / 100.0;
        System.out.println("Your total with tax is : $" + total);

        double tip = total * .175;
        tip = Math.round(tip * 100.0) / 100.0;
        System.out.println("(Suggested tip: $" + tip + ")");

        System.out.println("Please enter tip ammount");
        double tip2 = input.nextDouble();

        double total2 = total + tip2;
        total2 = Math.round(tip2 * 100.0) / 100.0;
        System.out.println("You total with tip is:");
        System.out.println("$" + total + tip2);
    }
}
