package com.twu.biblioteca.console;

import com.twu.biblioteca.library.*;
import com.twu.biblioteca.request.CustomerRequest;
import com.twu.biblioteca.user.User;

import java.util.LinkedList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(Library.showWelcomeMessage());
        LoginConsole.askUserForLogining();
        System.out.println("================BOOKS AND MOVIES===========================");
        System.out.println("Books:");
        BookStorage.printAllBookList();

        System.out.println("Movies:");
        MovieStorage.printAllMovieList();
        System.out.println("===========================================================");
        String answer1, answer2;
        CustomerRequest request;
        Book book;
        Movie movie;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("-------------------------");
            System.out.println("Enter:\n1 -> ListBooks & Movies\n2 -> CheckOutBook\n3 -> CheckOutMovie\n4 -> ReturnBook\n5 -> ReturnMovie\n6 -> showUserInformation\n7 -> Quit ");
            System.out.println("-------------------------");
            answer1 = scanner.next();
            switch (answer1) {
                case "1":
                    request = CustomerRequest.listBooks(null,null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "2":
                    System.out.print("Enter the book name you want to checkout:");
                    answer2 = scanner.next();
                    book = findBookInList(answer2, BookStorage.allBookList,"That book is not available.");
                    request = CustomerRequest.checkOut(book, null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "3":
                    System.out.print("Enter the movie name you want to checkout:");
                    answer2 = scanner.next();
                    movie  = findMovieInList(answer2, MovieStorage.allMovieList,"That movie is not available.");
                    request = CustomerRequest.checkOut(null,movie);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "4":
                    System.out.print("Enter the book name you want to return:");
                    answer2 = scanner.next();
                    book = findBookInList(answer2, BookStorage.lentBookList,"That is not a valid book to return.");
                    request = CustomerRequest.returnBookOrMovie(book, null);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "5":
                    System.out.print("Enter the movie name you want to return:");
                    answer2 = scanner.next();
                    movie = findMovieInList(answer2,MovieStorage.lentMovieList,"That is not a valid movie to return.");
                    request = CustomerRequest.returnBookOrMovie(null,movie);
                    Library.handleSelectedMenuOptionRequest(request);
                    continue;
                case "6":
                    User user = UserDB.userHashMap.get(LoginConsole.getUserName());
                    user.showUserInformation();
                    continue;
                case "7":
                    request = CustomerRequest.quit(null, null);
                    Library.handleSelectedMenuOptionRequest(request);
                    break;
                default:
                    request = CustomerRequest.invalidOption(null ,null);
                    Library.handleSelectedMenuOptionRequest(request);
            }

        }while(!answer1.equals("7"));

    }

    private static Movie findMovieInList(String answer, LinkedList<Movie> list, String notFoundMessage) {
        for(Movie movie: list){
            if (movie.getName().equals(answer)){
                return movie;
            }
        }
        System.out.println(notFoundMessage);
        return null;
    }

    private static Book findBookInList(String answer, LinkedList<Book> list,String notFoundMessage) {
        for(Book book: list){
            if (book.getName().equals(answer)){
                return book;
            }
        }
        System.out.println(notFoundMessage);
        return null;
    }
}
