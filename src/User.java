import java.sql.SQLOutput;

public class User {
    // attributes -> name, username, contact
    String name;
    String userName;
    int contact;

    // behaviours -> check is registered?, borrow, return.
    public void isRegistered() {
        System.out.println("Need to work checking registered?");
    }

    public void borrowBook() {
        System.out.println("need to work to Borrow book");
    }

    public void returnBook() {
        System.out.println("need to work to return book");
    }
}