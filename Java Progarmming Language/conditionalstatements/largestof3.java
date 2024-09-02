import java.util.*;
public class largestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int number_1=sc.nextInt();
        System.out.println("enter the second number");
        int number_2=sc.nextInt();
        System.out.println("enter the third number");
        int number_3=sc.nextInt();
        if((number_1==number_2) && (number_2==number_1)) {
            System.out.println("the largest number is number 1 & number_2 "+ number_1);
        }else if((number_1==number_3) && (number_2==number_3)) {
            System.out.println("the largest number is number 1 & number_3 "+ number_1);
        }else if((number_2==number_3) && (number_3==number_2)) {
            System.out.println("the largest number is number 1 & number_2 "+ number_3);
        }  else if((number_1>number_2) && (number_1>number_3)) {
            System.out.println("the largest number is number_1 "+ number_1);
        } else if(number_2>number_3) {
            System.out.println("the largest number is number_2 "+ number_2);
        } else {
            System.out.println("the largest number is number 3"+ number_3);
        }
    
}
}