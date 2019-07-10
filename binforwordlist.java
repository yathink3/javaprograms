package javaapplication1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class binforwordlist {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        String filesdata = new String(Files.readAllBytes(Paths.get("C:\\Users\\YATHIN\\Documents\\NetBeansProjectsbridge\\JavaApplication1\\src\\javaapplication1\\textfile.txt")));
        String s=filesdata.replaceAll("\n", " ");
        String[] arr=s.split(" ");        
        Arrays.sort(arr);
        for(int k=0;k<arr.length;k++)
            System.out.println(arr[k]);
        System.out.println(binarysearch("from",arr)); 
    }
    public static int binarysearch(String key ,String arr[]){
        int n=arr.length;
        int f=0,l=n-1,mid;
        while(f<=l){
            mid=(f+l)/2;
            if(key.equals(arr[mid])) return mid;
            else if(key.compareTo(arr[mid])<0) l=mid-1;
            else f=mid+1;
        }
        return -1;
    }
}
