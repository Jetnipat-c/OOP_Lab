/**
* Employee subclass was inherited from Person class.
* Consist of main informations about employee
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public class Employee extends Person
{
	protected String office;
	protected int salary;
	protected MyDate hired_date;
	
	public String getOffice()
	{	return office;	}
	
	public int getSalary()
	{	return salary;	}
	
	public MyDate getHiredDate()
	{	return hired_date;	}
	
	public void setOffice(String s_office)
	{	office = s_office;	}
	
	public void setSalary(int i_salary)
	{	salary = i_salary;	}
	
	public void setHiredDate(MyDate h_date)
	{	hired_date = h_date;	}
	
	public String toString()
	{
		String tmp;
		
		tmp = super.toString();
		tmp += " - Office: " + getOffice() + "\n";
		tmp += " - Salary: " + getSalary() + "\n";
		tmp += " - Date-when-hired: " + getHiredDate() + "\n";
		
		return tmp;
	}
	
	public Employee() {}
	
	public Employee(Employee e_employee)
	{
		this(new Person(e_employee.getName(), e_employee.getAddr(), e_employee.getPhone(), e_employee.getEmail()),
				e_employee.getOffice(), e_employee.getSalary(), e_employee.getHiredDate());
	}
	
	public Employee(Person p_person, String s_office, int i_salary, MyDate md_hdate)
	{
		super(p_person);
		setOffice(s_office);
		setSalary(i_salary);
		setHiredDate(md_hdate);
	}
	
	public Employee(String s_name, String s_addr, String s_phone, String s_email, String s_office, int i_salary, MyDate md_hdate)
	{
		this(new Person(s_name, s_addr, s_phone, s_email), s_office, i_salary, md_hdate);
	}
}
