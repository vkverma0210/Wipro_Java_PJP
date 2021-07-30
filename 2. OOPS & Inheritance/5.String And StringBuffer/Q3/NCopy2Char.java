import java.util.*;

public class NCopy2Char {

    static String nCopyString(String str) {
        int n = str.length();
        String temp = str.substring(0, 2);

        String ans = "";

        for (int i = 0; i < n; i++) {
            ans += temp;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        System.out.println(nCopyString(str));
    }
}
