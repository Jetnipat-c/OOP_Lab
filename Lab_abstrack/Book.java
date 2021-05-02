import java.util.Arrays;

public class Book extends LibraryBook{
    public String title;
    public String[] another;
    public int num_isbn;
    public int num_pages;

    public Book (String title,String [] another, int num_isbn, int num_pages){
        this.title = title;
        this.another = another;
        this.num_isbn = num_isbn;
        this.num_pages = num_pages;
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
    public String toString(){
        return "Title : " + title + "\n" + "Another : " + Arrays.toString(another) + "\n" + "ISBN : " + num_isbn + "\n" + "NumOfPages : " + num_pages;
    }
}
