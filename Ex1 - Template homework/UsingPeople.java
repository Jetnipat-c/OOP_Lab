/**
 * This is a class to test your code files
 *
 * @author Kullawat Chaowanawatee <kullawat.c@phuket.psu.ac.th>
 * @date 2021-0203T08:32+07
 */

public class UsingPeople {
	public static void main(String args[]) {
		Person per, std, emp, fac, stf, stf2;
		per = new Person("Liu YiFei", "505 Olive street, XiTaMen, China", "0989889989", "yifei@gmail.com");
		System.out.println(per);

		std = new Student("Antonia", "999 Phuket", "01111111", "Antonia@gmail.com", YearStatus.FRESHMAN);
		System.out.println(std);

		emp = new Employee("Brute", "0000 Surath", "02222222", "Brute@gmail.com", "Nexthop", 35000,
				new MyDate(27, 11, 1998));
		System.out.println(emp);

		fac = new Faculty("Catacomb", "1111 Bangkok", "03333333", "Catacomb@gmail.com", "pp", 99980,
				new MyDate(27, 11, 1998), "0800 - 1630", Rank.ASSISTANT_PROFESSOR);
		System.out.println(fac);

		stf = new Staff("Future", "55555 Lampoon", "0444444444", "Future@gmail.com", "KBTG", 29999,
				new MyDate(10, 2, 1950), "title");
		System.out.println(stf);

	}
}