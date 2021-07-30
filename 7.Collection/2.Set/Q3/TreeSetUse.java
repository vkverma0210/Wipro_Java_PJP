import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUse {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Vinay Kumar Verma");
        ts.add("Ramkrishan");
        ts.add("Akash");
        ts.add("Abhishek");
        ts.add("Vivek");

        System.out.println("Original Tree Set: - " + ts);

        Iterator<String> itr1 = ts.descendingIterator();
        System.out.println("Elements in Reverse Order: - ");
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        Iterator<String> itr2 = ts.iterator();
        String temp = "Tarun";

        boolean ans = false;

        while (itr2.hasNext()) {
            if (itr2.next().equals(temp)) {
                ans = true;
                break;
            }
        }

        if (ans)
            System.out.println(temp + " exists.");
        else
            System.out.println(temp + " doesnot exists.");
    }

}