import java.util.*;

public class RemoveFirstAndLast {

    static String removeFirstLast(String str) {
        int n = str.length();
        return str.substring(1, n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(removeFirstLast(str));
    }
}
