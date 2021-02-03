/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07 
*/

public class Employee
{
    /* This filed holds info of a person */
    private String name,address,phone,email,office;
    private double salary;
    private MyDate my_date;

    public Employee(String _name, String _address, String _phone, 
                    String _email, String _office, double _salary, MyDate _my_date){
        setName(_name);
        setAddress(_address);
        setPhone(_phone);
        setEmail(_email);
        setOffice(_office);
        setSalary(_salary);
        setMy_date(_my_date);
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public String getOffice(){
        return office;
    }

    public double getSalary(){
        return salary;
    }

    public MyDate getMy_date(){
        return my_date;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public void setAddress(String _address){
        this.address = _address;
    }

    public void setPhone(String _phone){
        this.phone = _phone;
    }

    public void setEmail(String _email){
        this.email = _email;
    }

    public void setOffice(String _office){
        this.office =  _office;
    }

    public void setSalary(double _salary){
        this.salary = _salary;
    }

    public void setMy_date(MyDate _my_date){
        this.my_date =  _my_date;
    }

    public String toString(){
        return name + "\n" +
                "- " + address + "\n" +
                "- " + phone + "\n" + 
                "- " + email + "\n" +
                "- " + office + "\n" +
                "- " + salary + "\n" +
                "- " + my_date + "\n";
    }

}
