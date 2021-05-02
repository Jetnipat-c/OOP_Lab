abstract class LibraryBook implements  Comparable<LibraryBook> {
    protected  int ID;
    private boolean available;
    public abstract boolean isAvailable();
    public abstract boolean setAvailable(boolean available);

    @Override
    public int compareTo(LibraryBook x) {
        return this.ID - x.ID;
    }


}
