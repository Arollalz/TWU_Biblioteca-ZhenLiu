package com.twu.biblioteca.console;

import com.twu.biblioteca.login.Login;

import java.util.Scanner;

/**
 * Created by zhenliu on 9/29/15.
 */
public class LoginConsole {
    public static void askUserForLogining(){
        do {
            Scanner scanner= new Scanner(System.in);
            String answer1, answer2;
            System.out.println("Please enter your urser name(001-user):");
            answer1 = scanner.next();
            System.out.println("Please enter your urser password(123456):");
            answer2 = scanner.next();
            if (Login.userDB.get(answer1)!= null && Login.userDB.get(answer1).equals(answer2)){
                System.out.println("Welcome,"+answer1+"!");
                break;
            }
            else{
                System.out.println("Sorry, user name or password is wrong.\n");
            }
        }while(true);


    }
}
