/**
*/

public class Staff extends Employee {
    protected String title;

    public Staff() {

    }

    public Staff(String _name, String _address, String _phone, String _email, String _office, double _salary,
            MyDate _my_date, String s_title) {
        super(_name, _address, _phone, _email, _office, _salary, _my_date);
        setTitle(s_title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String s_title) {
        this.title = s_title;
    }

    public String toString() {
        String tmp;
        tmp = super.toString();
        tmp = tmp + "Tile : " + title + "\n";
        return tmp;
    }
}
