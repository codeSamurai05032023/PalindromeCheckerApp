import java.util.*;

/**
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Goal: Use Polymorphism to choose algorithms at runtime.
 */

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean check(String text);
}

// 2. Implementation A: Two-Pointer Strategy
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }
}

// 3. Implementation B: Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

// 4. The Context Class (The Service)
class PalindromeService {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String text) {
        return strategy.check(text);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        PalindromeService service = new PalindromeService();

        // Dynamically injecting the Two-Pointer Strategy
        service.setStrategy(new TwoPointerStrategy());

        System.out.println("input: " + input);
        System.out.println("Is Palindrome? " + service.executeCheck(input));
    }
}