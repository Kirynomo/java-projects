package LibraryManager;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryBooks = new ArrayList<>();

    public void displayBooks() {
        if(libraryBooks.isEmpty()) {
            System.out.println("No books in library :(");
        } else {
            System.out.println("These are the books available in our Library: ");
            for(int i = 0; i <libraryBooks.size(); i++) {
                System.out.println(i +". " + libraryBooks.get(i).getTitle());
            }
            System.out.println("Use issueBook or returnBook method to issue or return a book :)");
        }

    }

    public void returnBook(int id, Book book) {
        for(Book books : libraryBooks) {
            if(books.getId() != id){
                libraryBooks.add(book);
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Invalid return attempt.");
    }

    public void issueBook(int id, Book book) {
        for(Book books : libraryBooks) {
            if(books.getId() == id){
                libraryBooks.add(book);
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }
}
