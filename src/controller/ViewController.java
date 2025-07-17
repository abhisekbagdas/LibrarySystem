package controller;

import view.AddBookView;
import view.AvailableBooksView;
import view.DeleteBookView;
import view.UpdateBookView;

public class ViewController {
    public static void getAddBookView() {
        AddBookView.showAddBookView();
    }

    public static void getAvailableBooks() {
        AvailableBooksView.showAvailableBooksView();
    }

    public static void getBorrowBookView() {
        //TODO views related to borrow a book
        System.out.println("working on borrowing books");
        //TODO kun book borrow garne ho tyo chahi dinu parxha
        //TODO borrow garera sakesi message dekhauna parxa
//        System.out.println("Before: " + book1.getBookQuantity());
//        user1.borrowBook(user1, book1);
//        System.out.println("After: " + book1.getBookQuantity());

    }

    public static void getUpdateBookView() {
        UpdateBookView.showUpdateBookView();
    }

    public static void getDeleteBookView() {
        //TODO views while deleting a book
        DeleteBookView.showDeleteBookView();
    }
}
