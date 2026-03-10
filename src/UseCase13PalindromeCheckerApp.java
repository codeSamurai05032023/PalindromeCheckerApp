/**
 * UC13: Performance Comparison
 * Goal: Compare execution speed of different algorithms using nanoTime.
 */
public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        // Benchmarking Two-Pointer
        long startTP = System.nanoTime();
        boolean resTP = checkTwoPointer(input);
        long endTP = System.nanoTime();

        // Benchmarking Stack
        long startST = System.nanoTime();
        boolean resST = checkStack(input);
        long endST = System.nanoTime();

        // Standard Output
        System.out.println("input: " + input);
        System.out.println("Is Palindrome? " + resTP);

        System.out.println("\n--- Performance Results ---");
        System.out.println("Two-Pointer: " + (endTP - startTP) + " ns");
        System.out.println("Stack-Based: " + (endST - startST) + " ns");
    }

    public static boolean checkTwoPointer(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
            left++; right--;
        }
        return true;
    }

    public static boolean checkStack(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}