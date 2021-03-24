/**
* Superclass which collect all data of each ones
*
* @author	s5035512006
* @version	%I%, %G%
* @since	1.0
*/

public class Person
{
	/**
	* Name of person
	* @see getName()
	* @see setName()
	*/
	protected String name;
	
	/**
	* Address of person
	* @see getAddr()
	* @see setAddr()
	*/
	protected String addr;
	
	/**
	* Phone number of person
	* @see getPhone()
	* @see setPhone()
	*/
	protected String phone;
	
	/**
	* E-mail number of person
	* @see getEmail()
	* @see setEmail()
	*/
	protected String email;
	
	public String getName()
	{	return name;	}
	
	public String getAddr()
	{	return addr;	}
	
	public String getPhone()
	{	return phone;	}
	
	public String getEmail()
	{	return email;	}
	
	public void setName(String s_name)
	{	name = s_name;	}
	
	public void setAddr(String s_addr)
	{	addr = s_addr;	}
	
	public void setPhone(String s_phone)
	{	phone = s_phone;	}
	
	public void setEmail(String s_email)
	{	email = s_email;	}
	
	public String toString()
	{
		String tmp;
		
		tmp = "Name: " + getName() + "\n";
		tmp += "Address: " + getAddr() + "\n";
		tmp += "Phone: " + getPhone() + "\n";
		tmp += "Email: " + getEmail() + "\n";
		
		return tmp;
	}
	
	public Person() {}
	
	/**
	* @param s_name	Name
	* @param s_addr	Address
	* @param s_phone	Phone
	* @param s_email	E-Mail
	*/
	public Person(String s_name, String s_addr, String s_phone, String s_email)
	{
		setName(s_name);
		setAddr(s_addr);
		setPhone(s_phone);
		setEmail(s_email);
	}
	
	public Person(Person p_person)
	{
		this(p_person.getName(), p_person.getAddr(), p_person.getPhone(), p_person.getEmail());
	}
}
