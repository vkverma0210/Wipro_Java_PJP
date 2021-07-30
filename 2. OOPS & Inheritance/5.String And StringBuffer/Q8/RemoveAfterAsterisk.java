
/**
 * RemoveAfterAsterisk
 */
import java.util.*;

public class RemoveAfterAsterisk {

    static StringBuffer removeAfterAsterisk(String str) {
        int n = str.length();
        boolean valid[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            valid[i] = true;
        }

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '*') {
                valid[i] = false;

                if (i - 1 >= 0)
                    valid[i - 1] = false;

                if (i + 1 < n)
                    valid[i + 1] = false;
            }
        }

        StringBuffer ans = new StringBuffer("");
        for (int i = 0; i < n; i++) {
            if (valid[i]) {
                ans.append(str.charAt(i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(removeAfterAsterisk(str));
    }
}