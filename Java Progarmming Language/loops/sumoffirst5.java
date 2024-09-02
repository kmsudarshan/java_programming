import java.util.*;
public class sumoffirst5 {
    public static void main(String[] args) {
        //while loop.
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i;
        i=1;
        int n=sc.nextInt();
        while(i<=n) {
            System.err.print(i+" ");
            System.out.println(" ");
            sum=sum+i;
            i++;
        }
        System.err.println("the sum is "+ sum);
    }
    
}
