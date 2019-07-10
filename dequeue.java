package javaapplication1;
public class dequeue {
     Node front;
    Node rear;
    public void dqueue(){
        this.front=null;
        this.rear=null;
    }
     public void addfront(String data){
         Node newnode=new Node(data);
        if(this.front==null){  this.front=newnode;this.rear=newnode;}
        else{
            Node temp=this.front;
            this.front=newnode;
            newnode.next=temp;
        }
    }
      public void addrear(String data){
         Node newnode=new Node(data);
        if(this.front==null){  this.front=newnode;this.rear=newnode;}
        else{
            this.rear.next=newnode;
            newnode.pre=this.rear;
            this.rear=newnode;
        }
    }
      public void removefront(){
        if(this.front==null) System.out.println("removefront not possible");
        else{
            if(this.front==this.rear) this.rear=null;
            this.front=this.front.next;
        }
    }
       public void removerear(){
        if(this.front==null) System.out.println("removerear not possible");
        else{
            if(this.front==this.rear) this.front=null;
            this.rear=this.rear.pre;
        }
    }
       public boolean palindrome(){
            if(this.front==this.rear || this.front==null) return true;
            Node temp1=this.front;
            Node temp2=this.rear;
            while(temp1!=temp2){
            if(!((String)temp1.data).equals((String)temp2.data)) return false;
            temp1=temp1.next;
            temp2=temp2.pre;
            }
             return true;  
        }
       public static void main(String args[]){
           dequeue d=new dequeue();
           d.dqueue();
           d.addrear("a");
           d.addrear("a");
           d.addrear("b");
           d.addrear("b");
           d.addrear("a");
           d.addrear("a");
           System.out.println("dequeue is palindrome "+d.palindrome());
       }
            
}
