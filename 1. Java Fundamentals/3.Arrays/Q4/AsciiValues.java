import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int ascii[] = new int[n];
        for (int i = 0; i < n; i++) {
            ascii[i] = s.nextInt();
        }

        for (int i = 0; i < ascii.length; i++) {
            System.out.print((char) (ascii[i]) + " ");
        }
        System.out.println();
    }
}
