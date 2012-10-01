package main;

public class User {
    public static boolean loggedIn() {
        return Program.loggedIn;
    }

    public void login() {
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
    }
}
