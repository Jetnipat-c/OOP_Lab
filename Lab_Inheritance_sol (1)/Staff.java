/**
* Staff class was inherited from Employee class.
* It contains only `title` field
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public class Staff extends Employee
{
	protected String title;
	
	public String getTitle()
	{	return title;	}
	
	public void setTitle(String s_title)
	{	title = s_title;	}
	
	public String toString()
	{
		String tmp;
		
		tmp = super.toString();
		tmp += " - Title: " + getTitle() + "\n";
		
		return tmp;
	}
	
	public Staff() {}
	
	public Staff(Employee e_employee, String s_title)
	{
		super(e_employee);
		setTitle(s_title);
	}
	
	public Staff(String s_name, String s_addr, String s_phone, String s_email, String s_office, int i_salary, MyDate md_hdate, String s_title)
	{
		this(new Employee(s_name, s_addr, s_phone, s_email, s_office, i_salary, md_hdate), s_title);
	}
}
