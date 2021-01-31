public class Student {
    protected String code; // student code
    protected String name;
    protected double gpa;
    public Student() { }
    public Student(String c, String nm) {
    code = c;
    name = nm;
    }
    public Student(String c, String nm, double g) {
    code = c;
    name = nm;
    gpa = g;
    }
    public String getCode() {
    return code;
    }
    public String getName() {
    return name;
    }
    public double getGPA() {
    return gpa;
    }
    public void setGPA(double g) {
    gpa = g;
    }
    public String toString() {
    String s = " " + code + " " + name + " " + gpa + " " ; 
    return s;
    }
}   