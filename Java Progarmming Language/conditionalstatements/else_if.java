import java.util.*;
public class else_if {
    public static void main(String[] args) {
        System.out.println("enter your age");
         Scanner sc=new Scanner(System.in);
         int age=sc.nextInt();
         if(age>=18) {
         System.out.println("you can vote & drive");
         }
         else if(age<18 && age>=13) {
            System.out.println("teenage");
         } else {
            System.out.println("you are not adult");
         }
    }
}