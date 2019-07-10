package javaapplication1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class unorderedlist {
    Node head;
    public static void add(unorderedlist list,String data){
        Node newnode=new Node(data);
        if(list.head==null)  list.head=newnode;
        else{
            Node temp=list.head;
            while(temp.next!=null)   temp=temp.next;
            temp.next=newnode;
        }
    }
    public static void insert(unorderedlist list,int pos,String data){
        int count=0;
        Node temp=list.head;
        if(pos==0){
            list.head.data=data;
        }
        else{ 
            Node tempnext=temp;
            while(count!=pos ) {
                 if(tempnext.next==null) break;
                 tempnext=temp.next;
                 temp=temp.next;
                 count++;
            }
            
            //temp.next=temp.next;  
        }
        
    }
    public static boolean isempty(unorderedlist list){
        if(list.head==null) return true;
        return false;
    }
    public static int size(unorderedlist list){
        Node temp=list.head;
        int count=0;
            while(temp!=null) {
                temp=temp.next;
                count++;
            }
          return count;
    }
    public static boolean ispresent(unorderedlist list,String data){
            Node temp=list.head;
            while(temp!=null) {
                if((temp.data).equals(data)) return true;
                temp=temp.next;
            }
          return false; 
    }
    public static int index(unorderedlist list,String data){
            Node temp=list.head;
            int count=0;
            while(temp!=null) {
                if((temp.data).equals(data)) return count;
                temp=temp.next;
                count++;
            }
          return -1; 
    }
    public static void remove(unorderedlist list,String data){
        Node temp=list.head;
        if((list.head.data).equals(data)){
            list.head=temp.next;
        }
        else{ 
            Node temppre=list.head;
            while(!temp.data.equals(data) ) {
                 temppre=temp;
                 if(temp.next==null) break;
                 temp=temp.next;
            }
            temppre.next=temp.next;  
        }
        
    }
    public static void print(unorderedlist list){
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        System.out.println();
    }
    public static void printtofile(unorderedlist list) throws IOException{
        File f;
        f = new File("C:\\Users\\YATHIN\\Documents\\NetBeansProjectsbridge\\JavaApplication1\\src\\javaapplication1\\textfile.txt");
        FileWriter fw=new FileWriter(f);
        Node temp=list.head;
        while(temp!=null){
            fw.write((String)temp.data+" ");
            temp=temp.next;
        }
        fw.flush();
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        String filesdata = new String(Files.readAllBytes(Paths.get("C:\\Users\\YATHIN\\Documents\\NetBeansProjectsbridge\\JavaApplication1\\src\\javaapplication1\\textfile.txt")));
        unorderedlist list=new unorderedlist();
        filesdata=filesdata.replaceAll("\n", " ");
        String[] arr=filesdata.split(" "); 
        for(int i=0;i<arr.length;i++)
             list.add(list,arr[i]);
        print(list);
        System.out.println("enter word to search:");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        if(list.ispresent(list,str1)){
            list.remove(list,str1);
            System.out.println(str1+" is removed from the list");
        }
        else{
            list.add(list,str1);
            System.out.println(str1+" is added to the list");
        }
        print(list); 
        printtofile(list);
    }
}
