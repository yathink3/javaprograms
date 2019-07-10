
package javaapplication1;
public class distance {
    public static void main(String[] args){
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        double d=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println(d);
    }
}
