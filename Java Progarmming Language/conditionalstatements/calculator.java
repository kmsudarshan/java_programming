import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("operater = ");
        char operater = sc.next().charAt(0);
        switch (operater) {
            case '+' :System.out.println(a+b);
                break;
            case '-' :System.out.println(a-b);
                break;
            case '*' :System.out.println(a*b);
                break;
            case '/' :System.out.println(a/b);
                break;
            case '%' :System.out.println(a%b);
                break;
            default:System.out.println("invalid operater");
        }

    }
    
}
