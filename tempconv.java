package javaapplication1;
import java.util.*;
public class tempconv {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for Celsius to Fahrenheit or 1 for Fahrenheit to Celsius:");
        int h=sc.nextInt();
        if(h==1){
           float c=sc.nextFloat();
           float f= (c*9/5)+32 ;
           System.out.println(c+" Celsius to Fahrenheit is: "+f);
        }
        else{
            float f=sc.nextFloat();
            float c=(f-32)*5/9;
            System.out.println(f+" Fahrenheit to Celsius: "+c);
        }
    }
}
