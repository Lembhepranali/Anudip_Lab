package com.examples;

import java.sql.SQLOutput;
import java.util.Scanner;

/*class SingleInherit{
    int a,b;
    Scanner sc=new Scanner(System.in);
    public void input() {
        System.out.println("enter two numbers:");
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
    }
}
class Derived extends SingleInherit
{
    int c;
    public void output()
    {
        c=a+b;
        System.out.println("the addition of two numbers:"+c);
    }
}
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.input();
        obj.output();
    }
}
*/
import java.util.Scanner;
class Age {
    int a;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("enter your age:");
        a = sc.nextInt();
    }
}
class Vote extends Age {
    public void check() {
        if (a >= 18) {
            System.out.println("you are eligible for vote!");

        } else {
            System.out.println("you are not eligible for vote.");
        }
    }
}
public class SingleInheritanceDemo{
    public static void main(String[] args) {
        Vote obj=new Vote();
        obj.input();
        obj.check();

    }
}




