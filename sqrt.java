package javaapplication1;

import java.util.Scanner;

public class sqrt {
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the element");
        double t=sc.nextDouble();
        double c=t;
        double ep=Math.pow(Math.E, -15);
        while(Math.abs(t-(c/t))>ep*t)
            t=((c/t)+t)/2;
        System.out.println(t);
    }
}
