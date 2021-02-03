/**
 * This is a class to test your code files
 *
 * @author Kullawat Chaowanawatee <kullawat.c@phuket.psu.ac.th>
 * @date 2021-0203T08:32+07
 */

public class UsingPeople
{
	public static void main(String args[])
	{
		Person per = new Person("Liu YiFei", "505 Olive street, XiTaMen, China", "0989889989", "yifei@gmail.com");
		System.out.println(per);
		
		Student std = new Student("Your Name", "1 Your Address", "055555555", "test@email.com", YearStatus.SOPHOMORE);
		System.out.println(std);
		
		Employee emp = new Employee("Liu YiFei", "505 Olive street, XiTaMen, China", "0989889989", "yifei@gmail.com",
							"KFC Central, Iowa",	//Office
							6200,	//Salary
							new MyDate(6,10,2008));	//Hired date
		System.out.println(emp);
		
		Faculty fac = new Faculty("C D",	//Name
							"43/34 Hatyai",	//Address
							"3333344444",	//Phone
							"cd@hellocd.com",	//E-mail
							"CoE PSU",	//Office
							42000,	//Salary
							new MyDate(1,1	,2009),	//Hired date
							"0800 - 1630",	//Office hours
							Rank.LECTURER);	//Rank
		System.out.println(fac);
	}
}
