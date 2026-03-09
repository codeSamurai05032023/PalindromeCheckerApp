/**
 * UC1: Application Entry & Welcome Message
 * This class serves as the container for the Palindrome Checker logic.
 */
public class PalindromeCheckerApp {

    // Version constant - demonstrates the use of static/final for app metadata
    private static final String VERSION = "1.0.0";

    /**
     * The entry point of the application.
     * The 'static' keyword allows the JVM to run this without instantiating the class.
     */
    public static void main(String[] args) {
        // Step 1: Display Application Name
        System.out.println("========================================");
        System.out.println("    WELCOME TO PALINDROME CHECKER App   ");
        System.out.println("========================================");

        // Step 2: Display Application Version
        System.out.println("Application Version: " + VERSION);
        System.out.println("Status: System Ready...");
        System.out.println("----------------------------------------");

        // Logic for next Use Cases (UC2, UC3, etc.) would start here
    }
}