/**
 * This is a class that holds student info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T09:10+07
 */

public class Faculty extends Employee {
    private String office_hours;
    private Rank rank;

    public Faculty(String _name, String _address, String _phone, String _email, String _office, double _salary,
            MyDate _hired_date, String _office_hours, Rank _rank) {
        super(_name, _address, _phone, _email, _office, _salary, _hired_date);
        setMy_date(_hired_date);
        setOffice_hours(_office_hours);
        setRank(_rank);
    }

    public String getOffice_hours() {
        return office_hours;
    }

    public Rank getRank() {
        return rank;
    }

    public void setOffice_hours(String _office_hours) {
        this.office_hours = _office_hours;
    }

    public void setRank(Rank _rank) {
        this.rank = _rank;
    }

    public String toString() {
        String tmp;
        tmp = super.toString();
        return tmp + "Office hours : " + office_hours + "\n" + "Rank : " + rank + "\n";
    }
}
