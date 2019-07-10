package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extendprime {
     public static void main(String[] args){
        int[] hi=new int[1000];
        int count=0;
        for(int i=2;i<1000;i++){
            if(isprime(i)){
                hi[count]=i;
                count++;
                if(ispali(i))
                     System.out.print(i+" ");
            }  
            
        }
        System.out.println();
        ana(count,hi);
    }
     public static void ana(int n,int[] arr){
         List<Integer> Dim = new ArrayList<Integer>();
         for(int m=0;m<n;m++){
             int l=0;
             for(int j=m+1;j<n;j++){
                 String h=Integer.toString(arr[m]);
                 char[] st1=h.toCharArray();
                 Arrays.sort(st1);
                 String h2=Integer.toString(arr[j]);
                 char[] st2=h2.toCharArray();
                 Arrays.sort(st2);
                 if(h.length()==h2.length()){
                     if(Arrays.equals(st1, st2)){
                         if(Dim.contains(arr[m]) && Dim.contains(arr[j]));
                         else{
                         if(Dim.contains(arr[m])) {
                             System.out.print(" "+arr[j]+" ");
                             Dim.add(arr[j]);
                         }
                         else{
                             Dim.add(arr[m]);
                             Dim.add(arr[j]);
                             System.out.print(arr[m]+" "+arr[j]);
                         } 
                         l=1;
                     }
                     }
                }
                 }
             if(l==1){
             System.out.println();
             }
             }
        }
    public static boolean isprime(int n){
        int flag=0;
        for(int j=2;j<n;j++)
            if(n%j==0) flag=1;
        if(flag==0) return true;
        else return false;
    }
    public static boolean ispali(int n){
        String h=Integer.toString(n);
        String reverse = "";
        for(int i=h.length()-1;i>=0;i--)
            reverse = reverse + h.charAt(i);
        if(reverse.equals(h))  return true;
        return false;
    }
}
