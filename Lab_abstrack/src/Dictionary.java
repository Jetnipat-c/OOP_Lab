public class Dictionary extends LibaryBook{
    public String title_lg1;
    public String title_lg2;
    public String publisher;

    public Dictionary(String title_lg1, String title_lg2, String publisher) {
        this.title_lg1 = title_lg1;
        this.title_lg2 = title_lg2;
        this.publisher = publisher;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean setAvailable(boolean available) {
        return false;
    }

    @Override
    public String toString() {
        return "Title language 1 : " + title_lg1 + "\n" + "Title language 2 : " + title_lg2 + "\n" + "Publisher : " + publisher;
    }
}
