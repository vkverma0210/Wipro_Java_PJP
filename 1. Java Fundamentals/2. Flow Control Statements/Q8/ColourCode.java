import java.util.Scanner;

public class ColourCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char code = s.next().charAt(0);

        switch (code) {
        case 'R':
            System.out.println(code + "->Red");
            break;

        case 'B':
            System.out.println(code + "->Blue");
            break;

        case 'G':
            System.out.println(code + "->Green");
            break;

        case 'O':
            System.out.println(code + "->Orange");
            break;

        case 'Y':
            System.out.println(code + "->Yellow");
            break;

        case 'W':
            System.out.println(code + "->White");
            break;

        default:
            System.out.println("Invalid Code");
            break;
        }
    }
}
