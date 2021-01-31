import java.util.ArrayList;

public class StudentList {
ArrayList<Student> arrList = new ArrayList<Student>(); 

    public StudentList() {  }


    
    public void addStudent(String _name, String _code, double _gpa) {
        
        arrList.add(new Student(_name,_code,_gpa) );
        //System.out.println(arrList.toString());
    }

    public void removeStudentByCode(String _code) {
        //System.out.println(arrList.get(0).code);	
      for (Student num : arrList) { 		      
           //System.out.println(num.code);
           if (num.code == _code){
            //System.out.println("find"); 
            //System.out.println(arrList.remove(num));
            arrList.remove(num);
            System.out.println(">> Remove student code : " + num.code + " " + "done" );
            break;
           }
           else System.out.println("Not find"); 	
      }
      System.out.println(">> After remove "+arrList.toString());
    }

    public void showAllStudentInfo() {
        System.out.println(arrList.toString());
    }

}
