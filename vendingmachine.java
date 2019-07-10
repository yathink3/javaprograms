
package javaapplication1;
import java.util.*;
public class vendingmachine {
    public static void main(String args[]){
        int[] notes={1,2,5,10,50,100,500,1000};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter do you want to change:");
        int amount=sc.nextInt();
        int sum=0;
        for(int i=7;i>=0;i--)
            if(amount/notes[i]>0){
                int count=amount/notes[i];
                System.out.println(notes[i]+" * "+count+" = "+notes[i]*count);
                sum=sum+count;
                amount=amount%notes[i];
            }
        System.out.println("minimum no of notes:"+sum);

    }
    
}
