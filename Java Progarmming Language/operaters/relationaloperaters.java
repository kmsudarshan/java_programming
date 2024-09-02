public class relationaloperaters {
    public static void main(String[] args) {
        //equal to ==
        //1st   false
        int A=2;
        int B=3;
        System.out.println((A==B));

        //2nd  true
        int a=2;
        int b=2;
        System.out.println((a==b));  

         //not equal to ==
        //1st   true
        int A0=2;
        int B0=3;
        System.out.println((A0!=B0));

        //2nd  false
        int a1=2;
        int b1=2;
        System.out.println((a1!=b1));

        //greater than  >
        //1st false
        int A1=2;
        int B1=3;
        System.out.println((A1>B1));

        //2nd true 
        int A2=4;
        int B2=3;
        System.out.println((A2>B2));

        //lesser than <
        //1st true
        int A3=2;
        int B3=3;
        System.out.println((A3<B3));

        //2nd false
        int A4=4;
        int B4=3;
        System.out.println((A4<B4));

        //greater than or eaqual to >=
        int A5=20;                   // teat case 1
        int B5=15;
        System.out.println((A5>=B5));

        int A6=15;                   // teat case 2  
        int B6=20;
        System.out.println((A6>=B6));

        int A7=15;                   // teat case 3
        int B7=15;
        System.out.println((A7>=B7));

        //lesser than or equal to   <=
        int A8=20;                   // teat case 1
        int B8=15;
        System.out.println((B8<=A8));

        int A9=15;                   // teat case 2  
        int B9=20;
        System.out.println((B9<=A9));

        int A10=15;                   // teat case 3
        int B10=15;
        System.out.println((B10<=A10));
    }
}