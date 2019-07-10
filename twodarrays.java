
package javaapplication1;
import java.util.*;
import java.io.*;
public class twodarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("enter the size of 2d array m&n");
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the "+m*n+"elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        PrintWriter out = new PrintWriter(System.out,true); 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               out.print(arr[i][j]+" ");
            }
            out.println();
        }
        //OutputStream g = new FileOutputStream("test.txt");
        
    }

    
}
