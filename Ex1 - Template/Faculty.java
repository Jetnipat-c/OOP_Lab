/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07 
*/

public class Faculty
{
    private String name,address,phone,email,office,office_hours;
    private double salary;
    private MyDate hired_date;
    private Rank rank;

    public Faculty(String _name, String _address, String _phone, String _email, 
    String _office, double _salary, MyDate _hired_date, String _office_hours, 
    Rank _rank){
        setName(_name);
        setAddress(_address);
        setPhone(_phone);
        setEmail(_email);
        setOffice(_office);
        setSalary(_salary);
        setHired_date(_hired_date);
        setOffice_hours(_office_hours);
        setRank(_rank);
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

    public MyDate getHired_date(){
        return hired_date;
    }

    public String getOffice_hours(){
        return office_hours;
    }

    public Rank getRank(){
        return rank;
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

    public void setHired_date(MyDate _hired_date){
        this.hired_date =  _hired_date;
    }

    public void setOffice_hours(String _office_hours){
        this.office_hours = _office_hours;
    }

    public void setRank(Rank _rank){
        this.rank = _rank;
    }

    public String toString(){
        return name + "\n" +
                "- " + address + "\n" +
                "- " + phone + "\n" + 
                "- " + email + "\n" +
                "- " + office + "\n" +
                "- " + salary + "\n" +
                "- " + hired_date + "\n" +
                "- " + office_hours + "\n" +
                "- " + rank + "\n" ;
    }
}
