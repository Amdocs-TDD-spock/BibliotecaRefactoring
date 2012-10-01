package main;

public class Menu {

    private static boolean loggedIn = false;
    private static String savedLibraryNumber = "";

    public static boolean chooseOptionFromMenu() {
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
                System.out.println("Your library number is " + savedLibraryNumber);
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
                            loggedIn = true;
                            savedLibraryNumber = libraryNumber;
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
        return loggedIn;
    }

    public static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }
}
