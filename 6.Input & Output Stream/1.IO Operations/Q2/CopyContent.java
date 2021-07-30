import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * CopyContent
 */
public class CopyContent {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        String inputFileName = s.nextLine();
        System.out.println("Enter the output file name: ");
        String outputFileName = s.nextLine();

        File fileIn = new File(inputFileName);
        File fileOut = new File(outputFileName);

        BufferedReader br = new BufferedReader(new FileReader(fileIn));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));

        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        }
        ;
        System.out.println("File is copied");
        br.close();
        bw.close();
        s.close();
    }
}