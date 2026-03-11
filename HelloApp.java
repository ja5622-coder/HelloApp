/**
 * DisplayName.java - UC2: Display Hello with Command-Line Argument
 * Accepts a user's name as a command-line argument and displays
 * a personalized greeting.
 */

class DisplayName {
    public static void main(String[] args) {

        // Get the name from command-line argument
        String name = args[0];

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");

    }
}