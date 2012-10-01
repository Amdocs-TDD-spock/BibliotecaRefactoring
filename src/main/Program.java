package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        while (true) {
            displayStartMenu();

            if (Menu.chooseOptionFromMenu()) break;
        }
    }

    public static void reserveBook() {
        System.out.println(" Please enter the number of the book you wish to checkout: ");
        int bookChoice = 0;
        try {
            bookChoice = getUserInput();
        } catch (Exception e) {
             System.out.println("Enter a valid integer!!");

        }
        if(bookChoice>0 && bookChoice<=4)
            displaySuccessfulResrvationMsg();
        else
            displayUnsuccessfulReservationMsg();
    }

    private static void displayUnsuccessfulReservationMsg() {
        System.out.println("\n");
        System.out.println("Sorry we don't have that book yet.");
    }

    public static void displaySuccessfulResrvationMsg() {
        System.out.println("\n");
        System.out.println(" Thank You! Enjoy the book.");
    }

    public static void displayBookList() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
    }

    public static void displayMovieList() {
        System.out.println(new Movie("Rocky", "John G. Avildsen", "10"));
        System.out.println(new Movie("Rocky II", "John G. Avildsen", "9"));
        System.out.println(new Movie("Rocky III", "John G. Avildsen", "8"));
        System.out.println(new Movie("Rocky IV", "John G. Avildsen", "7"));
        System.out.println(new Movie("Rocky V", "John G. Avildsen", "8"));
        System.out.println(new Movie("Drainage", "Francisco Trindade", "N/A"));
        System.out.println(new Movie("The Shawshank Redemption", "Frank Darabont", "10"));
        System.out.println(new Movie("The Godfather", "Francis Ford Coppola", "7"));
        System.out.println(new Movie("Inception", "Frank Darabont", "10"));
        System.out.println(new Movie("Pulp Fiction", "Quentin Tarantino", "6"));
    }

    public static String getStringInput() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userChoice = reader.readLine();
        return userChoice;

    }

    public static int getUserInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int userChoice = Integer.parseInt(reader.readLine());
            return userChoice;
        } catch (Exception e) {

        }
        return 0;
    }

    public static void displayStartMenu() {
        System.out.println("**********************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Check out Book                              *");
        System.out.println("*         3. Check Library Number                        *");
        System.out.println("*         4. Movie Listing                               *");
        System.out.println("*         5. Login                                       *");
        System.out.println("*         9. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");
    }

    public static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    public static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }

    public static boolean loggedIn() {
        return loggedIn;
    }


    public static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }

}

