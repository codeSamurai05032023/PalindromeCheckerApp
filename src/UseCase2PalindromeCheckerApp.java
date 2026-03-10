public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String original = "madam";
        String reverse = "";

        // Logic to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        // Conditional statement to check for Palindrome
        if (original.equals(reverse)) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }

        // Program exits
    }
}