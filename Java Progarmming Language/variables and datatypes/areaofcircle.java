import java.util.*;
public class areaofcircle{
    public static void main(String[] args) {
        System.out.println("enter the radius");
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float area=3.14f*radius*radius;
        System.err.println(area);
    }
    
}
