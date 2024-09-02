import java.util.*;
public class typepromotion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //type1 mtd1
        char a='a';
        char b='b';
        char c=(char) (b-a);
        System.out.println((int)b);
        System.out.println((int)a);
        System.out.println(b-a);
        System.out.println((int)c);
        //type2
        short d=5;
        byte e=25;
        char f='c';
        byte ef=(byte) (d+e+f);
        System.out.println(ef);
        //type 3 mtd 2
        int ab=10;
        float bc=25.34f;
        long cd=25;
        double de=54;
        double ans=ab+bc+cd+de;
        System.out.println(ans);
        //type4 
        int ab1=10;
        float bc2=25.34f;
        long cd3=25;
        double de4=54;
        //int ans1=(int) (ab1+bc2+cd3+de4);
        //float ans1=(float) (ab1+bc2+cd3+de4);
        long ans1=(long) (ab1+bc2+cd3+de4);
        System.out.println(ans1);

        /*wrong
        byte b_=5;
        byte a_=b*2;
        System.out.println(a);
        */

        //right one
        byte b_=5;
        byte a_=(byte)(b*2);
        System.out.println((byte)a);
}
}