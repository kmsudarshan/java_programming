public class logicaloperaters {
    public static void main(String[] args) {
        //logical AND - &&
        System.out.println((3>2) && (2<3));
        System.out.println((3>2) && (2>3));
        System.out.println((3<2) && (2<3));
        System.out.println((3<2) && (2>3));

        //logical OR - ||
        System.out.println((3>2) || (2<3));
        System.out.println((3>2) || (2>3));
        System.out.println((3<2) || (2<3));
        System.out.println((3<2) || (2>3));

        //logical not - !()
        System.out.println(!(2>3));
        System.out.println(!(3>2));
    }
    
}
