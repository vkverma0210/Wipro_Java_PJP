import java.util.Scanner;

public class CharNumberSpecial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char character = s.next().charAt(0);

        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            System.out.println("Alphabhet");
        } else if (character >= 48 && character <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
