public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC3: String Reversal Logic using Loop
        String original = "madam";
        String reversed = "";

        // Logic to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check for Palindrome
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }
    }
}