
public class Main {

    public static void main(String[] args) {
        Book myBook1 = new Book();
        Book myBook2 = new Book("Java Programming");
        Book myBook3 = new Book("Java Programming", 500);
        Book myBook4 = new Book("Java LAB1", 1000, "PSU");

        myBook1.setTitle("OOP s");
        myBook1.setNumberOfpage(1999);
        myBook1.setAuthorName("Jetnipat c");
        System.out.println("Get : " + myBook1.getTitle());
        myBook2.setTitle("OOP");
        myBook2.setNumberOfpage(1999);
        myBook2.setAuthorName("Jetnipat c");

        myBook3.setAuthorName("Jetnipat c");

        System.out.println(myBook1);
        System.out.println(myBook2);
        System.out.println(myBook3);
        System.out.println(myBook4);

        if (myBook1.equals(myBook2)) {
            System.out.println("Equals func : Book 1 and Book 2 are the same");
        } else
            System.out.println("Equals func : Book 1 and Book 2 are not the same");

        if (myBook1.hashCode() == myBook2.hashCode()) {
            System.out.println("HashCode func : Book 1 and Book 2 are the same");
        } else
            System.out.println("HashCode func : Book 1 and Book 2 are not the same");
    }
}