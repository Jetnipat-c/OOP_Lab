/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07 
*/

public class Student
{   
    /* This filed holds info of a person */
    private String name,address,phone,email;
    private YearStatus year_status;

    public Student(String _name, String _address, String _phone, String _email, YearStatus _year_status) {
        setName(_name);
        setAddress(_address);
        setPhone(_phone);
        setEmail(_email);
        setYear_status(_year_status);
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

    public YearStatus getYear_status(){
        return year_status;
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

    public void setYear_status(YearStatus _year_status){
        this.year_status = _year_status;
    }

    public String toString(){
        return name + "\n" +
                "- " + address + "\n" +
                "- " + phone + "\n" + 
                "- " + email + "\n" +
                "- " + year_status + "\n";
    }
}
