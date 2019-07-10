package javaapplication1;
public class Node<T> {
    T data;
    Node pre;
    Node next;
    Node(T d){
        data=d;
        next=null;
        pre=null;
        }
}
