/**
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * Goal: Clean the string by removing spaces and converting to lowercase.
 */
public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Step 1: Normalization (The "Cleanup" phase)
        // .replaceAll("\\s+", "") removes all whitespace
        // .toLowerCase() makes it case-insensitive
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Apply Two-Pointer logic on the clean string
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Output Results
        System.out.println("Original input: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("is palindrome? : " + isPalindrome);
    }
}
