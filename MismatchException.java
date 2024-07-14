package com.examples;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();  // Try to read an integer
            System.out.println("You entered: " + number);
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: You entered a non-integer value.");
        } finally {
            scanner.close();  // Close the scanner
        }
    }
}