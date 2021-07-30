import java.util.*;

public class Combine2String {

    static String combine2String(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int l = (l1 < l2) ? l1 : l2;
        String ans = "";
        int i;
        for (i = 0; i < l; i++) {
            ans += str1.charAt(i);
            ans += str2.charAt(i);
        }

        while (i < l1) {
            ans += str1.charAt(i);
            i++;
        }

        while (i < l2) {
            ans += str2.charAt(i);
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = "", str2 = "";
        str1 = s.nextLine();
        str2 = s.nextLine();

        System.out.println(combine2String(str1, str2));
    }
}
