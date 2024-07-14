package com.examples;
import java.sql.SQLOutput;
import java.util.Scanner;
class EmpDetails{
    int id;
    String name;
    double salary;
    Scanner sc=new Scanner(System.in);
    public void inputData()
    {
        System.out.println("enter your employee id:");
        id= sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name:");
        name= sc.nextLine();
        System.out.println("enter your salary:");
        salary=sc.nextDouble();
    }
    public void displayData()
    {
        System.out.println("welcome to new job opportunity at Accenture");
        System.out.println("Verify your details:");
        System.out.println("Your employee id:+"+id);
        System.out.println("your name is:"+name);
        System.out.println("your salary is:"+salary);

    }
}
public class OOPDemo {
    public static void main(String[] args) {
        EmpDetails obj=new EmpDetails();
        obj.inputData();
        obj.displayData();
    }
}
