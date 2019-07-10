package javaapplication1;
import java.util.*;
public class usernamerep {

    public static void main(String[] args) {
        String s1="Hello <<UserName>>, How are you?";
        String s2="<<UserName>>";
        Scanner sc=new Scanner(System.in);
        String in=sc.next();
        while(in.length()<3){
            System.out.println("enter name with atleast 3 character:");
            in=sc.next();
        }
        System.out.println(s1.replace(s2, in));
        
    }

    
}
