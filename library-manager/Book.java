package LibraryManager;

public class Book {

    private final String title;
    private final String author;
    private final int id;
    private final boolean isIssued;

    public Book(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.isIssued = false;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }
}
