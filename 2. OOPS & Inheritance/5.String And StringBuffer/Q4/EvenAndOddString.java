import java.util.*;

public class EvenAndOddString {

    static String evenAndOddBreak(String str) {
        int n = str.length();

        if (n % 2 == 0) {
            return (str.substring(0, n / 2));
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(evenAndOddBreak(str));
    }
}
