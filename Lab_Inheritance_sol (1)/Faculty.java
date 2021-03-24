/**
* Faculty class was inherited from Employee class.
* It contains a faculty member's office hours, rank
* which `rank` is an enumerated type consists
* lecturer, assistant and professor.
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public class Faculty extends Employee
{
	protected String office_hours;
	protected Rank rank;
	
	public String getOfficeHours()
	{	return office_hours;	}
	
	public Rank getRank()
	{	return rank;	}
	
	public void setOfficeHours(String s_oh)
	{	office_hours = s_oh;	}
	
	public void setRank(Rank r_rank)
	{	rank = r_rank;	}
	
	public String toString()
	{
		String tmp;
		
		tmp = super.toString();
		tmp += " - Office Hours: " + getOfficeHours() + "\n";
		tmp += " - Rank: " + getRank() + "\n";
		
		return tmp;
	}
	
	public Faculty() {}
	
	public Faculty(Employee e_employee, String s_oh, Rank r_rank)
	{
		super(e_employee);
		setOfficeHours(s_oh);
		setRank(r_rank);
	}
	
	public Faculty(String s_name, String s_addr, String s_phone, String s_email, String s_office, int i_salary, MyDate md_hdate, String s_oh, Rank r_rank)
	{
		this(new Employee(s_name, s_addr, s_phone, s_email, s_office, i_salary, md_hdate), s_oh, r_rank);
	}
}
