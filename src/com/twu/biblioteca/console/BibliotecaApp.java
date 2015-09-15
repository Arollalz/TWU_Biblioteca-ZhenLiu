package com.twu.biblioteca.console;

import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.BookStorage;
import com.twu.biblioteca.library.Library;
import com.twu.biblioteca.request.CustomerRequest;

import java.util.LinkedList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(Library.showWelcomeMessage());

        System.out.println("list of all books:");

        BookStorage.printAllBookList();
        String answer1, answer2;
        CustomerRequest request;
        Book book;
        Scanner scanner= new Scanner(System.in);
        do {
        System.out.print("Enter 1 to ListBooks, 2 CheckOut ,3 ReturnBook, 4 Quit: ");
        answer1 = scanner.next();
            switch (answer1) {
                case "1":
                    request = CustomerRequest.listBooks(null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "2":
                    System.out.print("Enter the book name you want to checkout:");
                    answer2 = scanner.next();
                    book = findBookInList(answer2, BookStorage.allBookList);
                    request = CustomerRequest.checkOut(book);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "3":
                    System.out.print("Enter the book name you want to return:");
                    answer2 = scanner.next();
                    book = findBookInList(answer2, BookStorage.lentBookList);
                    request = CustomerRequest.returnBook(book);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "4":
                    request = CustomerRequest.quit(null);
                    Library.handleSelectedMenuOptionRequest(request);
                    break;
                default:
                    request = CustomerRequest.invalidOption(null);
                    Library.handleSelectedMenuOptionRequest(request);
            }

        }while(!answer1.equals("4"));

    }

    private static Book findBookInList(String answer, LinkedList<Book> list) {
        for(Book book: list){
            if (book.getName().equals(answer)){
                return book;
            }
        }
        return null;
    }
}
