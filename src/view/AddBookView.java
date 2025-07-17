package view;

import controller.BookController;
import models.Book;

import java.util.Scanner;

public class AddBookView {
    public static void showAddBookView(){
        Scanner input = new Scanner(System.in);
        BookController bookcontroller = new BookController();
        System.out.println("Enter book name: ");
        String bookName = input.nextLine();
        System.out.println("Enter book number");
        int bookNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter author name: ");
        String authorName = input.nextLine();
        System.out.println("Enter quantity");
        int quantity = Integer.parseInt(input.nextLine());
        Book book = new Book(bookNumber,bookName, quantity,authorName);
        bookcontroller.storeBook(book);
    }
}
