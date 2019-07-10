
package javaapplication1;

public class pimerange {
    public static void main(String[] args){
        
        for(int i=2;i<1000;i++){
            if(isprime(i)) System.out.print(i+" ");
        }
    }
    public static boolean isprime(int n){
        int flag=0;
            for(int j=2;j<n;j++){
                if(n%j==0) flag=1;
            }
            if(flag==0) return true;
            else return false;
    }
}
