import java.util.*;

public class StringWithoutX {

    static String removeX(String str) {
        int n = str.length();

        if (str.charAt(0) == 'x' && str.charAt(n - 1) == 'x')
            return str.substring(1, n - 1);
        else if (str.charAt(0) == 'x')
            return str.substring(1);
        else if (str.charAt(n - 1) == 'x')
            return str.substring(0, n - 1);
        else
            return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(removeX(str));
    }
}
