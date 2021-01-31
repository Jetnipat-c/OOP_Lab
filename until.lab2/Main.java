import java.util.Arrays;  
public class Main {
    public static void main(String[] args) {
        Point3D myObj1 = new Point3D(5, -2.5, 6);
        Point3D myObj2 = new Point3D(-4.5, 6.6, -9);
        Point3D myObj0 = new Point3D();
        double midPoint[];
        double sum;
        System.out.println("myObj0 "+myObj0);
        myObj0.set_X(2.5);
        myObj0.set_Y(-1.5);
        myObj0.set_Z(0.9);
        
        System.out.println("myObj0 x :" + myObj0.get_X());
        System.out.println("myObj0 y :" + myObj0.get_Y());
        System.out.println("myObj0 z :" + myObj0.get_Z() + '\n');
        midPoint = myObj1.midPoint(myObj1,myObj2);
        System.out.println("MidPoint x, y ,z = " + Arrays.toString(midPoint));
        sum = myObj1.distance(myObj1,myObj2);
        System.out.println("Distance x, y ,z = " + String.format("%.3f", sum));
    }  
}