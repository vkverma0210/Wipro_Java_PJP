import java.util.ArrayList;
import java.util.Iterator;

public class StringArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");
        list.add("String 5");
        list.add("String 6");
        list.add("String 7");

        printAll(list);
    }

    static void printAll(ArrayList<String> list) {
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}