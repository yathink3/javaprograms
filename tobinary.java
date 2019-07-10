package javaapplication1;

public class tobinary {
    public static void main(String args[]){
        int x=0;
        int x1=(x&0x0F)<<4;
        int x3=(x<<4);
        int x2=x>>4;
        int y=x1|x2;
        System.out.println(y+" "+Integer.toBinaryString(x1)+" "+Integer.toBinaryString(x2));
    }
}
