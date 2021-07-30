import java.util.Scanner;

/**
 * Binary
 */
public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer number (1 to 255) :");
        int num = s.nextInt();
        String ans = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println(ans);
    }
}