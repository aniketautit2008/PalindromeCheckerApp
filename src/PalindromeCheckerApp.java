public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        // Reverse the string manually
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional check
        if (word.equals(reversed)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}