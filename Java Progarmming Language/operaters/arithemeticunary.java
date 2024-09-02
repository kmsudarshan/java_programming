
public class arithemeticunary {
    public static void main(String[] args){
//increment unary operater
        //pre-increment
        System.out.println("pre-increment");
        int a=10;
        int b=++a;
        System.out.println("a ="+a);
        System.out.println("b ="+b);

        //post-increment
        System.out.println("post-increment");
        int c=10;
        int d=c++;
        System.out.println("c ="+c);
        System.out.println("d ="+d);

        //pre-deecrement
        System.out.println("pre-decrement");
        int e=10;
        int f=--e;
        System.out.println("e ="+e);
        System.out.println("f="+f);

        //post-decrement
        System.out.println("post-decrement");
        int g=10;
        int h=g--;
        System.out.println("g="+g);
        System.out.println("h="+h);
    }
}