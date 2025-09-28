package LibraryManager;
import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> libraryBooks = new ArrayList<>();

    public void displayBooks() {
        if(libraryBooks.isEmpty()) {
            System.out.println("No books in library :(");
        } else {
            System.out.println("These are the books available in our Library: ");
            for(int i = 0; i <libraryBooks.size(); i++) {
                System.out.println(i +". " + libraryBooks.get(i).getTitle());
            }
            System.out.println("Use issueBook or returnBook method to issue or return any book you liked :)");
        }

    }

    public void addBook(Book book) {
        for(Book books : libraryBooks){
            if(books.getTitle().equalsIgnoreCase(book.getTitle())){
                System.out.println("Book already exists!");
                return;
            }
        }
        libraryBooks.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void issueBook(int id) {
        for(Book book : libraryBooks) {
            if(book.getId() == id) {
                book.issueBook();
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Sorry, the book is currently unavailable.");
    }

    public void returnBook(int id){
        for(Book book : libraryBooks) {
            if (book.getId() != id) {
                book.returnBook();
                System.out.println("Thanks for returning on time!");
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }
}
