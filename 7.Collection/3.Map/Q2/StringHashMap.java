import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StringHashMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Vinay", "Kumar");
        map.put("Akash", "Yadav");
        map.put("Abhishek", "Pal");
        map.put("Ramkrishan", "Verma");

        Set<Entry<String, String>> set = map.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> e = itr.next();

            if (e.getKey().equals("Akash")) {
                System.out.println("Key Akash exists.");
                break;
            }
        }

        set = map.entrySet();
        itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> e = itr.next();

            if (e.getValue().equals("Verma")) {
                System.out.println("Key Verma exists.");
                break;
            }
        }

        set = map.entrySet();
        itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> e = itr.next();
            System.out.println(e);
        }
    }
}