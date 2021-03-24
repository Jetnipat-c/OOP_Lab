/**
* MyDate class is for containing date data.
* Consist of main informations about employee
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/
import java.lang.Integer;

public class MyDate
{
	private int day, month, year;
	
	public int getDay()
	{	return day;	}
	
	public int getMonth()
	{	return month;	}
	
	public int getYear()
	{	return year;	}
	
	public void setDay(int i_day)
	{	day = i_day;	}

	public void setMonth(int i_month)
	{	month = i_month;	}

	public void setYear(int i_year)
	{	year = i_year;	}
	
	public String toString()
	{
		String tmp;
		
		tmp = Integer.toString(getDay()) + "/";
		tmp += Integer.toString(getMonth()) + "/";
		tmp += Integer.toString(getYear());
		
		return tmp;
	}
	
	public MyDate() {}
	
	public MyDate(int i_day, int i_month, int i_year)
	{
		this.setDay(i_day);
		this.setMonth(i_month);
		this.setYear(i_year);
	}
}
