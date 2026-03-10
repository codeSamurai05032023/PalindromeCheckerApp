/**
 * UC11: Object-Oriented Palindrome Service
 * Goal: Encapsulate logic within a service class.
 */

// Service class to handle the logic (Encapsulation)
class PalindromeService {

    /**
     * Checks if a string is a palindrome.
     * This method is reusable and decoupled from the main app.
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Using our efficient two-pointer logic inside the service
        String cleanStr = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Step 1: Instantiate the service object
        PalindromeService service = new PalindromeService();

        // Step 2: Call the method via the object
        boolean result = service.checkPalindrome(input);

        // Step 3: Output
        System.out.println("input: " + input);
        System.out.println("is palindrome? (via Service): " + result);
    }
}
