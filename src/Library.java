import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create some books and users
        Book book1 = new Book(12, "Atomic Habits",10, "James Clear");


        User user1 = new User("Abhisek", "abhisekbagdas", 5566);

        //show available options: available books, borrow book, return book, exit
        System.out.println("Welcome to the Library");
        System.out.println("Enter 1: Show available books ");
        System.out.println("Enter 2: Borrow Book");
        System.out.println("Enter 3: Insert Book");
        System.out.println("Enter 4: Return Book");
        System.out.println("Enter 5: Update Book");
        System.out.println("Enter 6: Delete a Book");
        System.out.println("Enter 7: Exit");
        System.out.println("Choose an option: ");
        int option = input.nextInt();
        // show available Books
        if(option == 1){
            System.out.println("Available books");
            try {
                Connection conn = DatabaseConnection.connect();
                /*
                * to insert vales
                * String query = "INSERT INTO book"+"(bookNumber, bookName, bookAuthor, bookQuantity"+"VALUES(?,?,?,?)";
                * PreparedStatement ps = conn.prepareStatement(query);
                * if(ps.exexutionUpdate() > 0){
                *   System.out.println(Books added);
                * }
                * else{
                 *   System.out.println("fail to add books");
                 * }
                * */
                ArrayList<Book> bookList = new ArrayList<>();
                String query = "SELECT bookNumber,bookName, bookQuantity,bookAuthor FROM book";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet bookSet = ps.executeQuery();
                while(bookSet.next()){
                    int bookNumber = bookSet.getInt("booknumber");
                    String bookName = bookSet.getString("bookname");
                    int bookQuantity = bookSet.getInt("bookquantity");
                    String authorName = bookSet.getString("authorName");
                    Book book = new Book(
                            bookSet.getInt("bookNumber"),
                            bookSet.getString("bookName"),
                            bookSet.getInt("bookQuantity"),
                            bookSet.getString("bookAuthor"));
                    bookList.add(book);
                }
                for(Book book: bookList){
                    System.out.println("Book Number: "+book.getBookNumber());
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        // borrowing books
        else if(option == 2){
            System.out.println("Borrow section");
            //TODO kun book borrow garne ho tyo chahi dinu parxha
            //TODO borrow garera sakesi message dekhauna parxa
            System.out.println("Before: "+ book1.getBookQuantity());
            user1.borrowBook(book1, user1);
            System.out.println("After: " + book1.getBookQuantity());
        }
        // Insert books
        else if (option == 3) {
            System.out.println("Insert Section");
            try {
                Connection conn = DatabaseConnection.connect();
                String query = "INSERT INTO book" +
                        "(bookNumber, bookName, bookAuthor, bookQuantity) " +
                        "VALUES (?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,book1.getBookNumber());
                ps.setString(2, book1.getBookName());
                ps.setString(3, book1.getBookAuthor());
                ps.setInt(4,book1.getBookQuantity());
                if(ps.executeUpdate() > 0){
                    System.out.println("book added to database");
                }else{
                    System.out.println("Failed to add");
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        // Returning books
        else if(option == 4){
            System.out.println("working on returning books");
        }
        // Update Books
        else if(option == 5){
            System.out.println("Update Section");
            try {
                Connection conn = DatabaseConnection.connect();
                System.out.println("enter book ID: ");
                int bookID = input.nextInt();
                System.out.println("enter book Number: ");
                int bookNumberToUpdate = input.nextInt();
                String query = "UPDATE book SET bookNumber= ? WHERE  bookID = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, bookNumberToUpdate);
                ps.setInt(2, bookID);
                if (ps.executeUpdate()>0){
                    System.out.println("Book Update");
                }
                else {
                    System.out.println("Book update Failed");
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        // delete books
        else if(option == 6){
            System.out.println("Delete section");
            try {
                Connection conn = DatabaseConnection.connect();
                System.out.println("enter book ID: ");
                int bookID = input.nextInt();
                String query = "DELETE from book WHERE  bookID = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, bookID);
                if (ps.executeUpdate()>0){
                    System.out.println("Book Deleted");
                }
                else {
                    System.out.println("Book delete Failed");
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        // exiting
        else if (option == 7) {
            System.out.println("Exiting..");
        }
        // invalid Option
        else{
            System.out.println("invalid option");
        }
        //TODO need to figure out where to keep the books and users?
    }
}