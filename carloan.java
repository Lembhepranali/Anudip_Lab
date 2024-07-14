package com.examples;
import java.util.*;
public class carloan implements loancalculator {
    // Declare instance variables
    public double princiamt, loanamt, roi = 9.0; // Assuming a 9% rate of interest for car loans
    int years;
    Scanner sc = new Scanner(System.in);

    // Implementing the method declared in the 'loancalculator' interface to display principle amount
    @Override
    public void displayprinciamt() {
        // Prompt user to enter principle amount
        System.out.println("Enter principle amount for car loan:");
        // Read and store the principle amount
        princiamt = sc.nextDouble();
        // Prompt user to enter the number of years
        System.out.println("Enter the number of years for car loan:");
        // Read and store the number of years
        years = sc.nextInt();
    }

    // Implementing the method declared in the 'loancalculator' interface to calculate loan amount
    @Override
    public void calculate() {
        // Calculate loan amount using the formula: (principle * years * rate of interest) / 100
        loanamt = (princiamt * years * roi) / 100;
        // Display the calculated interest for the specified years
        System.out.println("Your interest for the specified years on car loan is: " + loanamt);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the 'carloan' class
        carloan obj = new carloan();
        // Call the method to display principle amount
        obj.displayprinciamt();
        // Call the method to calculate loan amount
        obj.calculate();
    }
}

