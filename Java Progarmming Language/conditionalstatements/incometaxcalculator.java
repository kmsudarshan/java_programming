import java.util.*;
public class incometaxcalculator {
    public static void main(String[] args) {
        int tax;
        System.out.println("enter your income");
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<500000) {
            tax=0;
            System.out.println("you are not requried to pay tax as your income is below five lakh rupees ");
        } else if(income>=500000 && income<1000000) {
            tax=(int)(income*0.2f);
            System.out.println("the tax need to be paid is "+ tax);
        }  else {
            tax=(int)(income*0.3f);
            System.out.println("the tax need to be paid is "+ tax);
        }
    }
    
}