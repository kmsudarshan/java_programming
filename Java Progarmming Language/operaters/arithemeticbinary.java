import java.util.*;
public class arithemeticbinary {
    public static void main(String[] args) {
        //binary operation
        Scanner sc=new Scanner(System.in);
        int A=10;
        int B=5;

        System.out.println("add ="+(A+B));

        System.out.println("subctract ="+(A-B));

        System.out.println("multiply ="+(A*B));

        System.out.println("divide ="+(A/B));

        System.out.println("modulo(remainder) ="+(A%B));

        System.out.println("add,subctract,divide,multiply,divide ="+((A+B)+(A-B)-(A*B)/(A/B)%(A+B)));

        System.out.println("add,subctract,divide,multiply,divide ="+((A+B)+(A-B)-(A*B)/(A/B)%(A%B)));


    }
    
}
