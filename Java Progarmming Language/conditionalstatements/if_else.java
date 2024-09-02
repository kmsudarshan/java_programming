import java.util.*;
public class if_else {
    public static void main(String[] args) {
      //problem 1
        System.out.println("enter your age");
         Scanner sc=new Scanner(System.in);
         int age=sc.nextInt();
         if(age>=18) {
         System.out.println("you can vote & drive");
         }
         if(age<18 && age>=13) {
            System.out.println("teenage");
         } if(age<18) {
            System.out.println("you are not adult");
         }
         //problem 2
         System.out.println("enter the value of a");
         int a=sc.nextInt();
         System.out.println("enter the value of b");
         int b=sc.nextInt();
         if(a>b) {
            System.out.println("a is greater ="+ a);
         } else {
            System.out.println("b is greater ="+ b);
         } 
         //problem 3
         System.out.println("enter the number");
         int number=sc.nextInt();
         if(number%2==0) {
            System.out.println("it is even ="+ number);
         } else {
            System.out.println("it is odd ="+ number);
         }

    }
}