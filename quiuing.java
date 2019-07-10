package javaapplication1;
public class quiuing {
    Node front;
    Node rear;
    public void queue(){
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int data){
         Node newnode=new Node(data);
        if(this.front==null){  this.front=newnode;this.rear=newnode;}
        else{
            this.rear.next=newnode;
            this.rear=newnode;
        }
    }
    public void dequeue(){
        if(this.front==null) System.out.println("dequeue not possible");
        else{
            if(this.front==this.rear) this.rear=null;
            this.front=this.front.next;
        }
    }
    public boolean isempty(){
        if(this.front==null) return true;
        return false;
    }
    public int size(){
        Node temp=this.front;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        return n;
    }
    public void print(){
        Node temp=this.front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        quiuing q=new quiuing();
        q.queue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.print();
    }
}
