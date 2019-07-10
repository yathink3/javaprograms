
package javaapplication1;
import java.util.*;
public class stopwatch {
    int sec;
    int min;
    int hr;
    public stopwatch(int hr,int min,int sec){
        this.sec=sec;
        this.min=min;
        this.hr=hr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start time  hr mnute sec:");
        int hr=sc.nextInt();
        int min=sc.nextInt();
        int sec=sc.nextInt();
       stopwatch start=new stopwatch(hr,min,sec);
       System.out.println("enter end time  hr mnute sec:");
         hr=sc.nextInt();
         min=sc.nextInt();
         sec=sc.nextInt();
       stopwatch end=new stopwatch(hr,min,sec);
       
       
    }
}
