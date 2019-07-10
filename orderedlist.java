package javaapplication1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;
import static javaapplication1.unorderedlist.print;
import static javaapplication1.unorderedlist.printtofile;
public class orderedlist {
    Node head;
    Node tail;
    public static void add(orderedlist list,int data){
        Node newnode=new Node(data);
        if(list.head==null){  list.head=newnode;list.tail=newnode;}
        else{
            Node temp=list.tail;
            temp.next=newnode;
            newnode.pre=temp;
            list.tail=newnode;
        }
    }
    public static boolean ispresent(orderedlist list,int data){
            Node temp=list.head;
            while(temp!=null) {
                if((temp.data).equals(data)) return true;
                temp=temp.next;
            }
          return false; 
    }
    public static void remove(orderedlist list,int data){
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
            temp.pre=temppre;
        }
        
    }
    public static void sort(orderedlist list){
        mergesort(list.head,list.tail,list);
    }
    public static void print(orderedlist list){
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
     public static orderedlist twolistsort(orderedlist l1,orderedlist l2){
        Node temp1=l1.head;
        Node temp2=l2.head;
        orderedlist l3=new orderedlist();
        while(temp1!=l1.tail.next && temp2!=l2.tail.next){
            if((int)temp1.data<(int)temp2.data){
                l3.add(l3,(int)temp1.data);
                temp1=temp1.next;
            }
            else{
                l3.add(l3,(int)temp2.data);
                temp2=temp2.next;
            }
        }
        while(temp1!=l1.tail.next){
            l3.add(l3,(int)temp1.data);
            temp1=temp1.next;
        }
        while(temp2!=l2.tail.next){
            l3.add(l3,(int)temp2.data);
            temp2=temp2.next;
        }
        return l3;
    }
    public static void mergesort(Node f,Node l,orderedlist list){
        if(f!=l){
            Node temp1=f;
            Node temp2=l;
            while(temp1.next!=temp2 && temp1!=temp2){
                temp1=temp1.next; temp2=temp2.pre;
            }
            mergesort(f,temp1,list);
            mergesort(temp1.next,l,list);
            merge(f,temp1,l);
        } 
    }
        public static void merge(Node f,Node mid,Node l){
            orderedlist l1=new orderedlist();
            orderedlist l2=new orderedlist();
            Node temp1=f;
            while(temp1!=mid.next){
                l1.add(l1,(int) temp1.data);
                temp1=temp1.next;
                
            }
            Node temp2=mid.next;
            while(temp2!=l.next){
                l2.add(l2,(int) temp2.data);
                temp2=temp2.next;
                
            }
            orderedlist l3=twolistsort(l1,l2);
            temp1=f;
            temp2=l3.head;
            while(temp2!=null){
                temp1.data=temp2.data;
                temp1=temp1.next;
                temp2=temp2.next;
                
            }
    }
        public static void printtofile(orderedlist list) throws IOException{
        File f;
        f = new File("C:\\Users\\YATHIN\\Documents\\NetBeansProjectsbridge\\JavaApplication1\\src\\javaapplication1\\textfile.txt");
        FileWriter fw=new FileWriter(f);
        Node temp=list.head;
        while(temp!=null){
            fw.write((String)(temp.data).toString()+" ");
            temp=temp.next;
        }
        fw.flush();
        System.out.println();
    }
    public static void main(String args[]) throws IOException{
        String filesdata = new String(Files.readAllBytes(Paths.get("C:\\Users\\YATHIN\\Documents\\NetBeansProjectsbridge\\JavaApplication1\\src\\javaapplication1\\textfile.txt")));
        orderedlist list=new orderedlist();
        filesdata=filesdata.replaceAll("\n", " ");
        String[] arr=filesdata.split(" "); 
        for(int i=0;i<arr.length;i++){
             list.add(list,Integer.parseInt(arr[i]));
        }
        print(list);
        sort(list);
        print(list);
        System.out.println("enter word to search:");
        Scanner sc=new Scanner(System.in);
        int ans=sc.nextInt();
        if(list.ispresent(list,ans)){
            list.remove(list,ans);
            System.out.println(ans+" is removed from the list");
        }
        else{
            orderedlist l1=new orderedlist();
            l1.add(l1,ans);
            list=twolistsort(list,l1);
            System.out.println(ans+" is added to the list");
        }
        print(list); 
        printtofile(list);  
    }
}
