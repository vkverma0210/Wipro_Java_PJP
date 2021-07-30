package Q1;

import java.util.Scanner;

/**
 * Square
 */
public class Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer: - ");
        String str = s.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println("The square is " + num * num);
            System.out.println("The work has been done successfil");
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}