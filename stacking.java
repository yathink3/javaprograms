package javaapplication1;
import java.util.Scanner;
public class stacking {
   Node top;
   public void stack(){
       this.top=null;
   }
   public void push(String data){
       Node temp=new Node(data);
       temp.next=top;
       top=temp;
   }
   public void pop(){
       if(top==null) System.out.println("stack is empty");
       else  top=top.next;
   }
   public void peek(){
       if(top==null) System.out.println("stack is empty");
        else   System.out.println((String)top.data);
   }
   public boolean isempty(){
       if(top==null) return true;
       return false;
   }
   public int size(){
       Node temp=top;
       int count=0;
       while(temp!=null){
           count++;
           temp=temp.next;
       }
       return count;
   }
   public void print(){
       Node temp=top;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
       }
       System.out.println();
   }
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       stacking s=new stacking();
       s.stack();
       System.out.println("enter a expression:");
       String data=sc.nextLine();
       for(int i=0;i<data.length();i++){
           if("(".equals(data.charAt(i))) s.push("(");
           if(")".equals(data.charAt(i))) s.pop();
       }
       if(s.isempty()) System.out.println("expression is balanced");
       else System.out.println("expression is not balanced");
   }
}
