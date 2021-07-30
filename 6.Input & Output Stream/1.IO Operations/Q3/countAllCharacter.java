import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeMap;

public class countAllCharacter {

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

        Map<String, Integer> map = new TreeMap<>();

        String str;
        while ((str = br.readLine()) != null) {
            str = str.trim();
            String[] words = str.split(" ");

            for (String word : words) {
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1);
                }
            }
        }
        ;

        Set<Entry<String, Integer>> set = map.entrySet();
        Iterator<Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Entry<String, Integer> mSet = it.next();

            bw.write(mSet.getKey() + " : " + mSet.getValue() + "\n");
        }

        br.close();
        bw.close();
        s.close();
    }
}