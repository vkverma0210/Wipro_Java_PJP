import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Number is not-prime");
        } else {
            System.out.println("Number is prime");
        }
    }
}
