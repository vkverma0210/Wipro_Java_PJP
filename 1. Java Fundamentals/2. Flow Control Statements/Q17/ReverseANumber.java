import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int rev = 0;
        while (num != 0) {
            int curr = num % 10;
            rev = rev * 10 + curr;
            num /= 10;
        }

        System.out.println(rev);
    }
}