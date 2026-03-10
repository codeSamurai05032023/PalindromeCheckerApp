public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        // Step 1: Call the recursive function
        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        // Step 2: Print Result
        System.out.println("input: " + input);
        System.out.println("is palindrome? : " + isPalindrome);
    }

    /**
     * Recursive method to check if a string is a palindrome.
     */
    public static boolean checkPalindrome(String str, int start, int end) {
        // Base Condition 1: If pointers cross, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters at pointers don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Check the inner substring
        return checkPalindrome(str, start + 1, end - 1);
    }
}
