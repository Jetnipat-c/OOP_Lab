/**
* Student subclass was inherited from Person class.
* It has an extra field to contain the year status
* which has been declared in enumerated type.
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public class Student extends Person
{
	protected YearStatus ys;
	
	public YearStatus getYearStatus()
	{	return ys;	}
	
	public void setYearStatus(YearStatus s_ys)
	{	ys = s_ys;	}
	
	public String toString()
	{
		String tmp;
		
		tmp = super.toString();
		tmp += " - Year: " + getYearStatus() + "\n";
		
		return tmp;
	}
	
	public Student() {}
	
	public Student(Person p_person, YearStatus s_ys)
	{
		super(p_person);
		setYearStatus(s_ys);
	}
	
	public Student(String s_name, String s_addr, String s_phone, String s_email, YearStatus s_ys)
	{
		this(new Person(s_name, s_addr, s_phone, s_email), s_ys);
	}
}
