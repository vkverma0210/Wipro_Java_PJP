import java.util.Scanner;

public class CheckCharacterOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char firstChar = s.next().charAt(0);
        char secondChar = s.next().charAt(0);

        if (firstChar < secondChar) {
            System.out.println(firstChar + "," + secondChar);
        } else {
            System.out.println(secondChar + "," + firstChar);
        }
    }
}
