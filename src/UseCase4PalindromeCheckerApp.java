public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC4: Character Array Based Palindrome Check
        String original = "racecar";

        // Step 1: Convert string to char array
        char[] charArray = original.toCharArray();

        // Step 2: Initialize Two Pointers
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 3: Compare characters moving inward
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 4: Output Result
        System.out.println("Input: " + original);
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}