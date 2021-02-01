import java.util.ArrayList;

public class StudentList {
ArrayList<Student> arrList = new ArrayList<Student>(); 

    public StudentList() {  }


    
    public void addStudent(String _code, String _name, double _gpa) {
        
        arrList.add(new Student(_code,_name,_gpa) );
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
            System.out.println(">> Remove student code : " + num.code + " " + "done" + "\n");
            break;
           }
           else System.out.println(">> Not find"); 	
      }
    //   System.out.println(">> After remove "+arrList.toString() + "\n");
    }

    public void showAllStudentInfo() {
        System.out.println(">>" + arrList.toString() + "\n" );
    }

    public boolean searchStudentByCode(String _code){
        boolean x = true;
        for (Student num : arrList) { 		      
            if (num.code == _code){
             System.out.println(">> Student code : " + num  );
             x = true;
             break;
            }
            else {
                x = false;
            };
            
       }
       return x;
    }

    public void getNumberOfStudent() {
        System.out.println(">> All Student : " + arrList.size() + " " + "people" );
    }

}
