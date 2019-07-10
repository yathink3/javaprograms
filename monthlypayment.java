package javaapplication1;
import java.util.*;
public class monthlypayment {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter loan amount p,no of years y and interest percent R: ");
        double p=sc.nextInt();
        double y=sc.nextInt();
        double r=sc.nextInt();
        double n=12*y;
        double R=r/(12*100);
        double ni=Math.pow((1+R),-n);
        double pay=(p*R)/(1-ni);
        System.out.println(pay);
    }
}
