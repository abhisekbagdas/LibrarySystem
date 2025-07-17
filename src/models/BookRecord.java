package models;

public class BookRecord {
    private User user;
    private Book book;
    private String date;
    private boolean isReturned;

    public BookRecord(User user, Book book) {
        this.user = user;
        this.book = book;
        //TODO jati bela add gareko ho record tyo date hunu parxa
        this.date = "date";
        this.isReturned = false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
