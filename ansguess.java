package javaapplication1;

import java.util.Scanner;

public class ansguess {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n=N;
        while(N>1){
            if(N%2!=0){ System.out.println("not power of two"); System.exit(0); }
            N=N/2;
        }
        System.out.println("answer is"+binarysearch(n));
    }
   public static int binarysearch(int n){
       Scanner sc=new Scanner(System.in);
        int f=0,l=n,mid;
        while(f<l){
            mid=(f+l)/2;
            System.out.println("enter if ("+f+" - "+mid+")-->0   or  ("+(mid+1)+" - "+l+")-->1");
            int m=sc.nextInt();
            if(m==0) l=mid;
            else f=mid+1;
        }
        if(f==l) return f;
        return -1;
    }
}
