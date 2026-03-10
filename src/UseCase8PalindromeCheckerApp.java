/**
 * UC8: Linked List Based Palindrome Checker
 * Goal: Use a Singly Linked List, find the middle, reverse the second half, and compare.
 */

// Define Node outside or as a static nested class
class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        // 1. Convert String to Singly Linked List
        Node head = new Node(input.charAt(0));
        Node current = head;
        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        // 2. Find the Middle using Fast and Slow Pointers
        // 
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse the Second Half
        // 
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // 4. Compare Halves
        Node firstHalf = head;
        Node secondHalf = prev; // Head of the reversed second half
        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // 5. Output
        System.out.println("input: " + input);
        System.out.println("is palindrome? : " + isPalindrome);
    }
}