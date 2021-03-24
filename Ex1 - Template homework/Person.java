/**
 * This is a class that holds personal info.
 * 
 * @author Jetnipat Thankeatphangan <6035512021@psu.ac.th>
 * @date 2021-02-03T08:53+07
 * 
 */

public class Person {
    /* This filed holds info of a person */
    private String name, address, phone, email;
    protected Person p_person;

    public Person() {}
    public Person(String _name, String _address, String _phone, String _email) {
        setName(_name);
        setAddress(_address);
        setPhone(_phone);
        setEmail(_email);
    }
    public Person getP_person() {
        return p_person;
    }
    public void setP_person(Person p_person) {
        this.p_person = p_person;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String _name) {
        this.name = _name;
    }
    public void setAddress(String _address) {
        this.address = _address;
    }
    public void setPhone(String _phone) {
        this.phone = _phone;
    }
    public void setEmail(String _email) {
        this.email = _email;
    }
    public String toString() {
        return "Name : " + name + "\n" + "Address : " + address + "\n" + "Phone : " + phone + "\n" + "Email : " + email + "\n";
    }
}
