/**
* Rank (lecturer, assistant, professor) in enumerated type
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public enum Rank
{
	LECTURER("Lecturer"), ASSISTANT("Assistant"), PROFESSOR("Professor");
	
	private final String srank;
	
	Rank(String s_rank)
	{	this.srank = s_rank;	}
	
	public String toString()
	{	return this.srank;	}
}
