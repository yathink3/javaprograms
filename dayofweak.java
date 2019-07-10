package javaapplication1;
import java.util.*;
public class dayofweak {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+30*m0/12)%7;
        System.out.println(d0);
        
        
    }
}
