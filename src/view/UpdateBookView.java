package view;

import controller.BookController;

import java.util.Scanner;

public class UpdateBookView {
    public static void showUpdateBookView() {
        Scanner input = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter book id: ");
        int bookid = input.nextInt();
        System.out.println("Enter book Number: ");
        int bookNumber = input.nextInt();
        bookController.updateBook(bookid, bookNumber);
    }
}
