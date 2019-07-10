
package javaapplication1;
import java.util.*;
public class coupons {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        discrand(n);
    }
    public static void discrand(int n){
        Random r=new Random();
        List<Integer> myList = new ArrayList<Integer>();
        int count=0,i=0;
        while(count<n){
            int rn=r.nextInt(n);
           if( myList.contains(rn)) ;
           else{
                myList.add(rn);
                count++;
           }
           i++;
        }
        
        System.out.println(i);
        System.out.println(myList);
    }
}
