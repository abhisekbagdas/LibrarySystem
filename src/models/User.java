package models;

public class User{
    //attributes -> nam, username, contact
    private String name;
    private String username;
    private int contact;

    public User(String name, String username, int contact) {
        this.name = name;
        this.username = username;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    //TODO check is registered?, borrow, return
    public void isRegistered(){
        System.out.println("need to work on checking registered?");
    }

    public void borrowBook(User user, Book book){
        if(book.getBookQuantity() > 0){
            BookRecord record = new BookRecord(user, book);
            book.decreaseQuantity();
        }else{
            System.out.println("models.Book not available");
        }
    }
    //TODO return a book
    public void returnBook(){
        System.out.println("need to work on return book");
    }
}
