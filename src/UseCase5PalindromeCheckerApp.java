import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        // 1. Create the Stack
        Stack<Character> stack = new Stack<>();

        // 2. Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 3. Pop and validate using boolean
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            // Compare the original string character with the popped character
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Print Result
        System.out.println("input: " + input);
        System.out.println("is palindrome? : " + isPalindrome);
    }
}