package main;

public class User {
    public static boolean loggedIn() {
        return Program.loggedIn;
    }

    public boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }

    public void reserveBook() {
        System.out.println(" Please enter the number of the book you wish to checkout: ");
        int bookChoice = 0;
        try {
            bookChoice = Program.getUserInput();
        } catch (Exception e) {
             System.out.println("Enter a valid integer!!");

        }
        if(bookChoice>0 && bookChoice<=4)
            displaySuccessfulResrvationMsg();
        else
            displayUnsuccessfulReservationMsg();
    }

    public void displayUnsuccessfulReservationMsg() {
        System.out.println("\n");
        System.out.println("Sorry we don't have that book yet.");
    }

    public void displaySuccessfulResrvationMsg() {
        System.out.println("\n");
        System.out.println(" Thank You! Enjoy the book.");
    }

    public void login() {
        System.out.println("Enter your library number");
        try {
            String libraryNumber = Program.getStringInput();
            if (validLibraryNumber(libraryNumber)) {
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
    }
}
