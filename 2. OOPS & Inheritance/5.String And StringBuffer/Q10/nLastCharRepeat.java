import java.util.*;

public class nLastCharRepeat {

    static String n_LastCharRepeat(String str, int n) {
        String temp = str.substring(str.length() - n);
        String ans = "";
        int i;
        for (i = 0; i < n; i++) {
            ans += temp;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        int n = s.nextInt();

        System.out.println(n_LastCharRepeat(str1, n));
    }
}
