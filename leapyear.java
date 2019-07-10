package javaapplication1;
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        while((Integer.toString(in)).length()!=4){
            System.out.println("pls enter year of 4 digit:");
            in=sc.nextInt();
        }
        if(in%4==0){
            if(in%100==0){
                if(in%400==0) System.out.println(in+"is leap year");
                else
                System.out.println(in+"is not leap year");
            }
            else
            System.out.println(in+"is leap year");
        }
        else
        System.out.println(in+"is not leap year");
        
    }
}
