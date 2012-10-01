package main;

public class Menu {



    public boolean chooseOptionFromMenu() {
        int userChoice= Program.getUserInput();

        if (userChoice == 1) {
            Program.displayBookList();
        }
        else if (userChoice == 2) {
            Program.reserveBook();
        }
        else if (userChoice == 3) {
            if (loggedIn()) {
                System.out.println("\n");
                System.out.println("Your library number is " + Program.savedLibraryNumber);
            } else {

                System.out.println("\n");
                System.out.println("Please talk to Librarian. Thank you.");
            }
        }
        else if (userChoice == 4) {
            Program.displayMovieList();
        }
        else if (userChoice == 5) {
            clearLogin();
            System.out.println("Enter your library number");
            try {
                String libraryNumber = Program.getStringInput();
                if (Program.validLibraryNumber(libraryNumber)) {
                    try {
                        System.out.println("Enter your Password: ");
                        String password = Program.getStringInput();
                        if (Program.validPassword(password)) {
                            Program.loggedIn = true;
                            Program.savedLibraryNumber = libraryNumber;
                        }
                    } catch (Exception e) {

                    }
                }
            } catch (Exception e) {

            }

        } else if (userChoice == 9) {
            System.out.println("Quitting...");
            return true;
        } else {
            System.out.println("\n");
            System.out.println("Enter a valid integer!!");
        }
        return false;
    }

    public static boolean loggedIn() {
        return Program.loggedIn;
    }

    public static void clearLogin() {
        Program.loggedIn = false;
        Program.savedLibraryNumber = "";
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
}
