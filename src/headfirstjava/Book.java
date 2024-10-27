package headfirstjava;

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    public Book(String t) {
        this.title = t;
    }
    @Override
    public String toString() {
        return this.title;
    }

}
