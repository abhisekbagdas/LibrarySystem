public class User {
    // attributes -> name, username, contact
    private String name;
    private String userName;
    private int contact;


    public User(String name, String userName, int contact) {
        this.name = name;
        this.userName = userName;
        this.contact = contact;
    }

    // getters and setters
    // getter of Name
    public String getName() {
        System.out.println(name);
        return name;
    }

    // setter of Name
    public void setName(String name) {

        this.name = name;
    }

    // getter of UserName
    public String getUserName() {
        System.out.println(userName);
        return userName;
    }

    //    setter of User Name
    public void setUserName(String userName) {

        this.userName = userName;
    }

    //    getter of Contact
    public int getContact() {
        System.out.println(contact);
        return contact;
    }

    //    setter of Contact
    public void setContact(int contact) {

        this.contact = contact;
    }

    // behaviours -> check is registered?, borrow, return.

    public void isRegistered() {

        System.out.println("Need to work checking registered?");
    }

    // borrow books
//    TODO Borrow a book
    public void borrowBook(Book book, User user) {
        System.out.println("need to work to Borrow book");

        if (book.getBookQuantity() > 0) {
            BookRecord record = new BookRecord(user, book);
            book.decreaseQuantity();

            System.out.println("Book borrowed successfully!!");

        } else {
            System.out.println("Book not available");
        }

    }

    // return books
    // TODO return books
    public void returnBook() {

        System.out.println("need to work to return book");
    }
}