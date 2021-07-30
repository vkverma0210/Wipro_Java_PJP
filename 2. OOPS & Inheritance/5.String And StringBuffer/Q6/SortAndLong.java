import java.util.*;

public class SortAndLong {

    static String sortLongString(String str1, String str2) {
        int l = str1.length();
        int n = str2.length();

        String ans = "";

        if (l > n) {
            ans += str2 + str1 + str2;
        } else {
            ans += str1 + str2 + str1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = "", str2 = "";
        str1 = s.nextLine();
        str2 = s.nextLine();

        System.out.println(sortLongString(str1, str2));
    }
}
