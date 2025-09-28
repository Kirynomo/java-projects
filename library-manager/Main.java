package LibraryManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l = new Library();
        int choice;

        //Pre-load some sample books:
        l.addBook(new Book("Atomic Habits", "James Clear", 101));
        l.addBook(new Book("Angels and Demons", "Dan Brown", 102));
        l.addBook(new Book("Murder of Roger Ackroyd", "Agatha Christie", 103));

        do {
            System.out.println("\n========== Library Menu ==========");
            System.out.println("1. Display All Books");
            System.out.println("2. Add a Book");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");

            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    l.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Book Title: ");
                    String title = sc.next();
                    System.out.print("Enter Author: ");
                    String author = sc.next();
                    l.addBook(new Book(title, author, id));
                    break;
                case 3:
                    System.out.print("Enter Book ID you wish to issue: ");
                    int issueId = sc.nextInt();
                    l.issueBook(issueId);
                    break;
                case 4:
                    System.out.print("Enter Book ID you wish to return: ");
                    int returnId = sc.nextInt();
                    l.returnBook(returnId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1 - 5.");
            }
        } while(choice != 5);
        sc.close();
    }
}
