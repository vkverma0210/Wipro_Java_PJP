import java.util.HashSet;
import java.util.Iterator;

public class Employee {
    public static void main(String[] args) {
        HashSet<String> emp = new HashSet<>();

        emp.add("Vinay Kumar Verma");
        emp.add("Ramkrishan");
        emp.add("Abhishek Pal");
        emp.add("Akash");
        emp.add("Vivek");

        Iterator<String> itr = emp.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}