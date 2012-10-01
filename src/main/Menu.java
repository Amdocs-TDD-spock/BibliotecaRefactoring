package main;

public class Menu {

    User user=new User();
    public boolean chooseOptionFromMenu() {
        int userChoice= Program.getUserInput();

        if (userChoice == 1) {
            Program.displayBookList();
        }
        else if (userChoice == 2) {
            user.reserveBook();
        }
        else if (userChoice == 3) {
            if (User.loggedIn()) {
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
            Program.clearLogin();
            user.login();

        } else if (userChoice == 9) {
            System.out.println("Quitting...");
            return true;
        } else {
            System.out.println("\n");
            System.out.println("Enter a valid integer!!");
        }
        return false;
    }

    public void displayStartMenu() {
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
