public class BookRecord {
    private User user;
    private Book book;
    private String date;
    private boolean returnStatus;

    public BookRecord(User user, Book book) {
        this.user = user;
        this.book = book;
        this.date = "date"; // TODO jati bela record garyo tetibela ko date auto set huna paryo
        this.returnStatus = false;
    }


    // <==================Getters===============>
    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public String getDate() {
        return date;
    }

    public boolean isReturnStatus() {
        return returnStatus;
    }
// <===========Setters============>
    public void setUser(User user) {
        this.user = user;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReturnStatus(boolean returnStatus) {
        this.returnStatus = returnStatus;
    }
}
