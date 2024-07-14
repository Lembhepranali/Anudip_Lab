package com.examples;
import java.util.Scanner;
 class CarDetails{
     String Color;
     String Brand;
     double Price;

     Scanner sc=new Scanner(System.in);
             public void getDetails()
             {
                 System.out.println("give the car deatails:");
                 Brand=sc.nextLine();
                 Color=sc.nextLine();
                 Price=sc.nextDouble();

             }
     public void printDetails()
     {
         System.out.println("Name of the Brand:"+Brand);
         System.out.println("Name of the Color:"+Color);
         System.out.println("Price of the Car:"+Price);

     }
 }



public class car {
    public static void main(String[] args) {
        CarDetails obj = new CarDetails();
        obj.getDetails();
        obj.printDetails();
    }
}
