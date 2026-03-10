import java.util.ArrayDeque;
import java.util.Deque;

/**
 * UC7: Deque-Based Optimized Palindrome Checker
 * Goal: Use a Double-Ended Queue to compare front and rear characters.
 */
public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        // Step 1: Initialize the Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Step 2: Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Step 3: Compare first & last while removing them
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            // If the front and back characters don't match, it's not a palindrome
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Print Result
        System.out.println("input: " + input);
        System.out.println("is palindrome? : " + isPalindrome);
    }
}