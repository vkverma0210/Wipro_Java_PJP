package Q5;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) throws ArithmeticException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st integer number: ");
        int n1 = s.nextInt();
        System.out.println("Enter 2nd integer number: ");
        int n2 = s.nextInt();

        int result = 0;

        try {
            result = n1 / n2;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        System.out.println("Division is " + result);
    }
}
