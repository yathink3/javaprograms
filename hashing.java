package javaapplication1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class hashing {
    Node head;
    public void add(int data){
        Node newnode=new Node(data);
        if(this.head==null)  this.head=newnode;
       /* else{
            Node temp=this.head;
            while(temp.next!=null)   temp=temp.next;
            temp.next=newnode;
        } */
    }
     public void print(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        System.out.println();
    }
   public static void main(String args[]) throws IOException{
       hashing h[]=new hashing[11];
       String filesdata = new String(Files.readAllBytes(Paths.get("C:\\Users\\YATHIN\\Documents\\NetBeansProjectsbridge\\JavaApplication1\\src\\javaapplication1\\textfile.txt")));
        filesdata=filesdata.replaceAll("\n", " ");
        String[] arr=filesdata.split(" "); 
        for(int i=0;i<arr.length;i++){
             Integer value=Integer.parseInt(arr[i]);
             int key=value%11;
             if(h[key]==null){
                 Node temp=new Node(value);
                 h[key].head=temp;
                 h[key].print();
             //h[key].add(value);
             }
        }
        for(int i=0;i<11;i++){
            h[i].print();
        }
   }
}
