/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07
 */

public class Employee extends Person {
    /* This filed holds info of a person */
    private String office;
    private double salary;
    private MyDate my_date;
    public Employee() {
    }
    public Employee(String _name, String _address, String _phone, String _email, String _office, double _salary,
            MyDate _my_date) {
        super(_name, _address, _phone, _email);
        setOffice(_office);
        setSalary(_salary);
        setMy_date(_my_date);
    }
    public String getOffice() {
        return office;
    }
    public double getSalary() {
        return salary;
    }
    public MyDate getMy_date() {
        return my_date;
    }
    public void setOffice(String _office) {
        this.office = _office;
    }
    public void setSalary(double _salary) {
        this.salary = _salary;
    }
    public void setMy_date(MyDate _my_date) {
        this.my_date = _my_date;
    }
    public String toString() {
        String tmp;
        tmp = super.toString();
        tmp = tmp + "Office : " + office + "\n" + "Salary : " + salary + "\n" + "Date : " + my_date + "\n";
        return tmp;
    }
}
