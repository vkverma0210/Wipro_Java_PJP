import java.util.*;

public class BeforeAndAfterString {

    static StringBuffer charBeforeAndAfterString(String str1, String str2) {
        int l = str1.length();
        int n = str2.length();
        int j, k;
        StringBuffer ans = new StringBuffer("");

        for (int i = 0; i < l; i++) {
            boolean flag = true;
            for (j = 0, k = i; j < n && k < l; j++, k++) {
                if (str2.charAt(j) != str1.charAt(k)) {
                    flag = false;
                    break;
                }
            }

            if (j == n && flag) {
                if (i - 1 >= 0) {
                    ans.append(str1.charAt(i - 1));
                }

                if (i + n + 1 < l) {
                    ans.append(str1.charAt(i + n));
                }

                i += n;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();

        System.out.println(charBeforeAndAfterString(str1, str2));
    }
}
