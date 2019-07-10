
package javaapplication1;
import java.util.*;
public class powerof2 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(n<0 || n>30) System.out.println("out of range");
        else{
            int k=1;
            for(int i=0;i<n;i++){
                System.out.println("2^"+i+"="+k);
                k=k*2;
            }
        }
    }  
}
