package view;

import controller.BookController;
import models.Book;

import java.util.ArrayList;

public class AvailableBooksView {
    public static void showAvailableBooksView() {
        BookController bookController = new BookController();
        ArrayList<Book> bookList = bookController.getBooks();
        System.out.println("Available books");
        for(Book book: bookList){
            System.out.println("Book Number: " + book.getBookNumber());
        }
    }
}
