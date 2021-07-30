package Q6;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String name = null;
            int sub1 = 0;
            int sub2 = 0;
            int sub3 = 0;

            try {
                name = s.nextLine();
                if (s.hasNextInt()) {
                    sub1 = s.nextInt();
                } else {
                    throw new NumberFormatException();
                }
                if (s.hasNextInt()) {
                    sub2 = s.nextInt();
                } else {
                    throw new NumberFormatException();
                }
                if (s.hasNextInt()) {
                    sub3 = s.nextInt();
                } else {
                    throw new NumberFormatException();
                }

                if (sub1 < 0)
                    throw new NegativeValueException();
                if (sub1 > 100)
                    throw new ValueOutOfRangeException();

                if (sub2 < 0)
                    throw new NegativeValueException();
                if (sub2 > 100)
                    throw new ValueOutOfRangeException();

                if (sub3 < 0)
                    throw new NegativeValueException();
                if (sub3 > 100)
                    throw new ValueOutOfRangeException();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (NegativeValueException e) {
                System.out.println(e.getMessage());
            } catch (ValueOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Name: " + name);
            System.out.println("Marks of subject A: " + sub1);
            System.out.println("Marks of subject B: " + sub2);
            System.out.println("Marks of subject C: " + sub3);
        }
    }
}
