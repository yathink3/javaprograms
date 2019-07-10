package javaapplication1;
import java.util.*;
public class anagram {
    public static void main(String[] aargs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string1:");
        String s1=sc.nextLine();
        System.out.println("enter first string:2");
        String s2=sc.nextLine();
        char[] st1=s1.toCharArray();
        Arrays.sort(st1);
        char[] st2=s2.toCharArray();
        Arrays.sort(st2);
        if(st1.length==st2.length){
            if(Arrays.equals(st1, st2))
             System.out.println("strings are anagram");
            else System.out.println("strings are not anagram");
        }
        else System.out.println("strings are not anagram");
    }
}
