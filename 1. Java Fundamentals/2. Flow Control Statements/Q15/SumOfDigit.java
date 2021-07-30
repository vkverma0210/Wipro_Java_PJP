import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        System.out.println(sum);
    }
}