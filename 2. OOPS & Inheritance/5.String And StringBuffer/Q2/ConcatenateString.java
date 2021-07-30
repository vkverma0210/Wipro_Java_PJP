import java.util.*;

public class ConcatenateString {

    static String concatenate_String(String str1, String str2) {
        String ans = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            ans = str1.substring(0, str1.length() - 2) + str2;
        } else {
            ans = str1 + str2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = "", str2 = "";
        str1 = s.nextLine();
        str2 = s.nextLine();

        System.out.println(concatenate_String(str1, str2));
    }
}
