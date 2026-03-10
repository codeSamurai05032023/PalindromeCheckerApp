public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the original string
        String original = "radar";
        String reversed = "";

        // Step 2: Loop through the string in reverse order
        // We start at the last index (length - 1) and move to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // Step 3: String Concatenation 
            // Note: This creates a new String object in memory each time
            reversed = reversed + original.charAt(i);
        }

        // Step 4: Content comparison using .equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}