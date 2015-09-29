package com.twu.biblioteca.console;

import com.twu.biblioteca.library.*;
import com.twu.biblioteca.request.CustomerRequest;

import java.util.LinkedList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(Library.showWelcomeMessage());
        LoginConsole.askUserForLogining();

        System.out.println("Books:");
        BookStorage.printAllBookList();

        System.out.println("Movies:");
        MovieStorage.printAllMovieList();

        String answer1, answer2;
        CustomerRequest request;
        Book book;
        Movie movie;
        Scanner scanner= new Scanner(System.in);
        do {
        System.out.println("Enter 1 to ListBooksAndMovies, 2 CheckOutBook ,3 CheckOutMovie 4 ReturnBook, 5 Quit: ");
        answer1 = scanner.next();
            switch (answer1) {
                case "1":
                    request = CustomerRequest.listBooks(null,null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "2":
                    System.out.print("Enter the book name you want to checkout:");
                    answer2 = scanner.next();
                    book = findBookInList(answer2, BookStorage.allBookList);
                    request = CustomerRequest.checkOut(book, null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "3":
                    System.out.print("Enter the movie name you want to checkout:");
                    answer2 = scanner.next();
                    movie  = findMovieInList(answer2, MovieStorage.allMovieList);
                    request = CustomerRequest.checkOut(null,movie);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "4":
                    System.out.print("Enter the book name you want to return:");
                    answer2 = scanner.next();
                    book = findBookInList(answer2, BookStorage.lentBookList);
                    request = CustomerRequest.returnBook(book, null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "5":
                    request = CustomerRequest.quit(null, null);
                    Library.handleSelectedMenuOptionRequest(request);
                    break;
                default:
                    request = CustomerRequest.invalidOption(null ,null);
                    Library.handleSelectedMenuOptionRequest(request);
            }

        }while(!answer1.equals("4"));

    }

    private static Movie findMovieInList(String answer, LinkedList<Movie> list) {
        for(Movie movie: list){
            if (movie.getName().equals(answer)){
                return movie;
            }
        }
        return null;
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
