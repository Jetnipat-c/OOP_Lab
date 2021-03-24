abstract class LibaryBook implements  Comparable<LibaryBook> {
    protected  int ID;
    private boolean available;
    public abstract boolean isAvailable();
    public abstract boolean setAvailable(boolean available);

    @Override
    public int compareTo(LibaryBook x) {
        return this.ID - x.ID;
    }


}
