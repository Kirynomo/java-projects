package LibraryManager;

public class Book {

    private String title;
    private String author;
    private int id;
    private boolean isIssued;

    public Book(String title, String author, int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.isIssued = false;
    }

//    public Book(String title, int id){
//        this.title = "Murakami";
//        this.id = 119;
//        this.isIssued = false;
//    }
//
//    public Book(String title){
//        this.title = "French Dictionary";
//        this.isIssued = false;
//    }

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

    public void issueBook() { isIssued = true; }

    public void returnBook() { isIssued = false; }
}
