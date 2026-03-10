import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * UC6: Queue + Stack Based Palindrome Check
 * Goal: Compare FIFO (Queue) and LIFO (Stack) outputs.
 */
public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";

        // Step 1: Initialize Data Structures
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 2: Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        // Step 3: Compare Dequeue vs Pop
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            // Dequeue gives the first character added, Pop gives the last
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Print Result (Same format as UC5)
        System.out.println("input: " + input);
        System.out.println("is palindrome? : " + isPalindrome);
    }
}