import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        // TODO create some books and users
        System.out.println("Books Part!!");
        Book book1 = new Book(201, "Book 1", 34, "Author 1");
        System.out.println(book1.getBookNumber());
        System.out.println(book1.getBookAuthor());


        System.out.println("\nUser Part!!!");
        User user1 = new User("Name1", "UserName1", 123456);
        System.out.println(user1.getName());

        System.out.println("Book Part!!!");
        BookRecord record = new BookRecord(user1, book1);
        // show options available: books, borrow books, return book, exit
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the library");
        System.out.println("Enter 1: Show available Books");
        System.out.println("Enter 2: Borrow Books");
        System.out.println("Enter 3: Return Books");
        System.out.println("Enter 4: Exit");
        System.out.print("Choose an option: ");
        int option = scan.nextInt();


        if (option == 1) {
            System.out.println("These Books are Available");
        } else if (option == 2) {
            System.out.println("Borrowing Books");
            // TODO which book to borrow
            // TODO borrow garera saki sake pachi message print garna parxa

            user1.borrowBook(book1, user1);
        } else if (option == 3) {
            System.out.println("Returning Books");
        } else if (option == 4) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid Input. Please Enter The Available Options");
        }

        // TODO need ot figure out where to keep the Books?
    }
}
