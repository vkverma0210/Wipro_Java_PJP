import java.util.*;

public class CalculatorUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter integer num1: - ");
        int num1 = s.nextInt();

        System.out.print("Enter integer num2: - ");
        int num2 = s.nextInt();

        System.out.println("Value of " + num1 + " ^ " + num2 + " : " + Calculator.powerInt(num1, num2));
        System.out.print("Enter double numd1: - ");
        double numd1 = s.nextDouble();

        System.out.print("Enter double numd2: - ");
        double numd2 = s.nextDouble();
        System.out.println("Value of " + numd1 + " ^ " + numd2 + " : " + Calculator.powerDouble(numd1, numd2));
    }
}
