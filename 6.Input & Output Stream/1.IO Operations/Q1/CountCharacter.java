import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * CountCharacter
 */
public class CountCharacter {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file name: -");
        String fileName = s.nextLine();
        System.out.println("Enter the character to be counted: - ");
        char c = s.nextLine().charAt(0);
        System.out.println(c);
        File file = new File(fileName);
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader(file));

        int ch;
        do {
            ch = br.read();
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            }
            if (c >= 65 && c <= 90) {
                c += 32;
            }

            if (ch == c) {
                count++;
            }
        } while (ch != -1);

        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + c + "'.");
        br.close();
        s.close();
    }
}