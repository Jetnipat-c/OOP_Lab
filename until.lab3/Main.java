import java.util.Arrays;  
public class Main {
    public static void main(String[] args) {
        StudentList people = new StudentList();
        System.out.println("########## addStudent ##########" + "\n");
        people.addStudent("021","Cheer",4.00);
        people.addStudent("000","Meen",3.99);
        people.addStudent("999","Chachaya",3.00);
        people.addStudent("091","test",1.99);
        System.out.println("########## showAllStudentInfo ##########");
        people.showAllStudentInfo();
        System.out.println("########## removeStudentByCode ##########");
        people.removeStudentByCode("888");
        System.out.println("########## showAllStudentInfo ##########");
        people.showAllStudentInfo();
        System.out.println("########## searchStudentByCode ##########");
        System.out.println(">> Result search : "+ " " + people.searchStudentByCode("777")+ "\n"); 
        System.out.println("########## getNumberOfStudent ##########");
        people.getNumberOfStudent();
    }  
}