public class Book {
    // attributes -> book number, name, quantity, author
    // TODO create the attribute
    private int bookNumber;
    private String bookName;
    private int bookQuantity;
    private String bookAuthor;

    public Book(int bookNumber, String bookName, int bookQuantity, String bookAuthor) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.bookQuantity = bookQuantity;
        this.bookAuthor = bookAuthor;

    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // behaviour -> increase-quantity, decrease-quantity
    public void decreaseQuantity() {

        this.bookQuantity--;
        System.out.println("Need to work to increase");
    }

    public void increaseQuantity() {

        this.bookQuantity++;
        System.out.println("Need to work to decrease");
    }

}