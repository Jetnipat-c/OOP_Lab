public class Book {
    private String title;
    private int numberOfPage;
    private String authorName;

    public Book() {

    }

    public Book(String _title) {
        this.title = _title;
    }

    public Book(String _title, int _numberOfpage) {
        this.title = _title;
        this.numberOfPage = _numberOfpage;
    }

    public Book(String _title, int _numberOfpage, String _authorName) {
        this.title = _title;
        this.numberOfPage = _numberOfpage;
        this.authorName = _authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    public int getNumberOfpage() {
        return numberOfPage;
    }

    public void setNumberOfpage(int _numberOfpage) {
        this.numberOfPage = _numberOfpage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String _authorName) {
        this.authorName = _authorName;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject)
            return true;
        if (anotherObject == null || getClass() != anotherObject.getClass())
            return false;
        Book book = (Book) anotherObject;
        if (numberOfPage != book.numberOfPage)
            return false;
        if (authorName != book.authorName)
            return false;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = title.hashCode();
        int result2 = authorName.hashCode();
        result = prime * result + numberOfPage + result2;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", numberofPage=" + numberOfPage + '\'' + ", authorName='"
                + authorName + '}';
    }

}