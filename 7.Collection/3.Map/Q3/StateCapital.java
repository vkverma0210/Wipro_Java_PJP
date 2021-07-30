import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class StateCapital {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.setProperty("Uttar Pradesh", "Lucknow");
        p.setProperty("Andra Pradesh", "Hyderabad");
        p.setProperty("Maharastra", "Mumbai");
        p.setProperty("Punjab", "Chandigarh");

        Set<Entry<Object, Object>> set = p.entrySet();
        Iterator<Entry<Object, Object>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<Object, Object> e = itr.next();
            System.out.println(e);
        }
    }
}