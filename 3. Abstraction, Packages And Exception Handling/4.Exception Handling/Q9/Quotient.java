import java.util.Scanner;

/**
 * Quotient
 */
public class Quotient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the 2 numbers");
            int a = s.nextInt();
            int b = s.nextInt();

            int Quotient = a / b;
            System.out.println("The qoutient of " + a + " / " + b + " = " + Quotient);
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}