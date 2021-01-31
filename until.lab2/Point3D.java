import java.util.Arrays;  
public class  Point3D {
    private double x,y,z;

    public Point3D() {
        set_X_Y_Z(0,0,0);
    }

    public Point3D(double _x, double _y, double _z) {
        set_X_Y_Z(_x, _y, _z);
    }

    public double get_X () { return this.x; }
    public void set_X (double _x) { this.x = _x; }

    public double get_Y () { return this.y; }
    public void set_Y (double _y) { this.y = _y; }

    public double get_Z () { return this.z; }
    public void set_Z (double _z) { this.z = _z; }

    public void set_X_Y_Z (double _x, double _y, double _z) { 
        this.x = _x; 
        this.y = _y; 
        this.z = _z; 
    }

    public void setTo(Point3D pt){
        this.x = pt.get_X();
        this.y = pt.get_Y();
        this.z = pt.get_Z();
    }

    @Override
    public String toString() {
        return "Point3D" + '\n' + "x : " + x + '\n' + "y : " + y + '\n' + "z : " + z + '\n';
    }

    public double[] midPoint(Point3D o1, Point3D o2) {
        System.out.println("Point 1 x : " + o1.x + ", y : " + o1.y + ", z : " + o1.z + '\n' 
        + "Point 2 x : " + o2.x + ", y : " + o2.y + ", z : " + o2.z + '\n');
        double Midpoint_X = ((Math.abs(o1.x)+Math.abs(o2.x))/2);
        double Midpoint_Y = ((Math.abs(o1.y)+Math.abs(o2.y))/2);
        double Midpoint_Z = ((Math.abs(o1.z)+Math.abs(o2.z))/2);
        double[] total = {Midpoint_X,Midpoint_Y,Midpoint_Z};
        // System.out.println("Midpoint_X = " + Midpoint_X);
        // System.out.println("Midpoint_Y = " + Midpoint_Y);
        // System.out.println("Midpoint_Z = " + Midpoint_Z);
        // for (int i = 0; i < total.length; i++) { 
        //     System.out.print( total[i]+ " ");     
        // }
        //System.out.println(Arrays.toString(total));
        return total;
    }

    public double distance(Point3D o1, Point3D o2) {
        double sum = Math.sqrt((Math.pow(o1.x-o2.x,2))+(Math.pow(o1.y-o2.y,2))+(Math.pow(o1.z-o2.z,2)));
        return sum;
    }

}