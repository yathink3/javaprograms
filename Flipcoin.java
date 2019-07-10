package javaapplication1;
import java.util.*;
public class Flipcoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        Random r=new Random();
        int k=0;
        for(int i=0;i<in;i++){
            float rno=r.nextFloat();
            System.out.println(rno);
            if(rno<0.5) k++;
        }
        float perctail=((float)k/(float)in)*100;
        float perchead=((float)(in-k)/(float)in)*100;
        System.out.println("percentage of tails:"+perctail+",percentage of heads:"+perchead);
    }
}
