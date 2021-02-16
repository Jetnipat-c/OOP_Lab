/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07
 */

public class Student extends Person {
    /* This filed holds info of a person */
    // private String name,address,phone,email;
    private YearStatus year_status;

    public Student(String _name, String _address, String _phone, String _email, YearStatus _year_status) {
        super(_name, _address, _phone, _email);
        setYear_status(_year_status);
    }

    public YearStatus getYear_status() {
        return year_status;
    }

    public void setYear_status(YearStatus _year_status) {
        this.year_status = _year_status;
    }

    public String toString() {
        String tmp;
        tmp = super.toString();
        tmp = tmp + "Year Study : " + year_status + "\n";
        return tmp;
    }
}
