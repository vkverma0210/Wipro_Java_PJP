
/**
 * Palindrome
 */
import java.util.*;

public class Palindrome {

    static boolean isPalindrome(String str) {
        int l = str.length();

        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "";
        str = s.nextLine();

        if (isPalindrome(str)) {
            System.out.println("String is Palindrome.");
        } else {
            System.out.println("String is not a Palindrome.");
        }
    }
}