
package javaapplication1;
import java.util.*;
public class gambler {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter stake ,goals & number of times");
        int stake=sc.nextInt();
        int goal=sc.nextInt();
        int n=sc.nextInt();
        int bets=0,wins=0;
        for(int i=0;i<n;i++){
            int cash=stake;
            while(cash>0 && cash<goal){
                if(Math.random()<0.5) cash++;
                else cash--;
                bets++;
            }
            if(cash==goal) wins++;
        }
        System.out.println("no of wins="+wins);
        System.out.println("no of lose="+(n-wins));
        System.out.println("no of bets="+bets);
        System.out.println("percentages of wins="+((float)wins/(float)n)*100);
        System.out.println("percentages of lose="+(((float)n-(float)wins)/(float)n)*100);
        
        
        
    }
    
}
