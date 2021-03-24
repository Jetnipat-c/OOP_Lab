/**
* Year Status (Freshman, sophomore, junior, senior) in enumerated type
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public enum YearStatus
{
	FRESHMAN("Freshman"), SOPHOMORE("Sophomore"), JUNIOR("Junior"), SENIOR("Senior");
	
	private final String ys;
	
	YearStatus(String s_ys)
	{	ys = s_ys;	}
	
	public String toString()
	{	return ys;	}
}
