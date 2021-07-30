import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char character = s.next().charAt(0);

        if (Character.isLowerCase(character)) {
            System.out.println(character + "->" + Character.toUpperCase(character));
        } else if (Character.isUpperCase(character)) {
            System.out.println(character + "->" + Character.toLowerCase(character));
        }
    }
}
