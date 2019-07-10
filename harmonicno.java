
package javaapplication1;
import java.util.*;
public class harmonicno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        while(n==0){
            System.out.println("pls enter no greater than 0");
            n=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            System.out.println("1/"+i+"="+(float)1/i);
            sum=sum+(float)(1/i);
        
        }
        System.out.println(sum);
    }
}
