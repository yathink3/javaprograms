
package javaapplication1;
import java.util.*;
public class sumofthreezero
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=sc.nextInt();
        List arr=new ArrayList();
        int m=0;
        System.out.println("enter n distinct values:");
        for(int i=0;i<n;i++){ 
            int val=sc.nextInt();
            if(arr.contains(val)) continue;
            else{
                arr.add(val);
                m++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                for(int k=j+1;k<m;k++){
                    if((int)arr.get(i)+(int)arr.get(j)+(int)arr.get(k)==0){
                            System.out.println(arr.get(i)+" + "+arr.get(j)+" + "+arr.get(k)+" = 0");
                            count++;
                        }
                }
            }
        }
        if(count==0) System.out.println("not exist");
        else System.out.println("count="+count);
    }
}
