package javaapplication1;
import java.util.*;
public class tiktak {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int c=-1;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                arr[i][j]=c;
                c--;
            }
        int count=0;
        Random r=new Random();
        printtic(arr);
        while(count<=8){
            System.out.println("player A enter index value[0-2][0-2]");
            int x=sc.nextInt();
            int y=sc.nextInt();
            while(arr[x][y]>0){
                if(arr[x][y]==1)   System.out.println("you only enters that index, enter  another index value[0-2][0-2]");
                else    System.out.println("player B enters that index, enter  another index value[0-2][0-2]");
                x=sc.nextInt();
                y=sc.nextInt();
            }
            arr[x][y]=1;
            count++;
            printtic(arr);
            if(win(arr)==1) {
                System.out.println("player A WON the match");
                break;
            }
            if(count!=9){
            System.out.println("player B enters the index");
            do{
             x=r.nextInt(3);
             y=r.nextInt(3);
            }while(arr[x][y]>0);
            arr[x][y]=2;
            count++;
            printtic(arr);
            if(win(arr)==1) {
                System.out.println("player B WON the match");
                break;
            }
            }
        }
        if(win(arr)!=1) System.out.println("none of one WON the match");
        
    }
    public static void printtic(int arr[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]<0)  System.out.print("  ");
                else{
                    if(arr[i][j]==1)
                        System.out.print("X ");
                    else 
                        System.out.print("O ");
                }
                if(j<2) System.out.print("| ");
            }
            System.out.println();
            if(i<2) System.out.println("---------");
        }
    }
    public static int win(int arr[][]){
        for(int i=0;i<3;i++){
                if(arr[i][0]==arr[i][1] && arr[i][0]==arr[i][2] ) return 1;
                if(arr[0][i]==arr[1][i] && arr[0][i]==arr[2][i] ) return 1;  
        }
        if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2] ) return 1;
        if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0] ) return 1; 
        return 0;
    }
}
