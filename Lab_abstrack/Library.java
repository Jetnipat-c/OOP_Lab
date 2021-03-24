public class Library {
    public static void main(String[] args){
        String[] a = {"cheer","meen"};
        Book x = new Book("OOP",a,555,99);
        System.out.println(x);
        Reference y = new Reference("OOP LAB","Abstract & Interface");
        System.out.println(y);
        Dictionary z = new Dictionary("Thai","English","PSU");
        System.out.println(z);
    }
}
