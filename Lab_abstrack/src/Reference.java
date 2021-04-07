public class Reference extends LibaryBook{
    public String title_ref;
    public String contents;

    public Reference(String title_ref, String contents) {
        this.title_ref = title_ref;
        this.contents = contents;
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
        return "Title Reference : " + title_ref + "\n" + "Contents : " + contents;
    }
}
