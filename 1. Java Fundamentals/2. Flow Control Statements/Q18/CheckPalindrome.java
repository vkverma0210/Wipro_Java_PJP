import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int curr = temp % 10;
            rev = rev * 10 + curr;
            temp /= 10;
        }

        if (num == rev) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
