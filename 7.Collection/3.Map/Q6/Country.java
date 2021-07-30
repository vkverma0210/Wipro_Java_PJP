import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Country {
    private Hashtable<String, String> M1;

    public Country() {
        M1 = new Hashtable<String, String>();
    }

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capital) {
        Set<Entry<String, String>> set = M1.entrySet();

        Iterator<Entry<String, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<String, String> e = itr.next();

            if (e.getValue().equals(capital)) {
                return e.getKey();
            }
        }

        return null;
    }

    public Hashtable<String, String> capitalKey() {
        Hashtable<String, String> M2 = new Hashtable<String, String>();

        Set<Entry<String, String>> set = M1.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<String, String> e = itr.next();
            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    public ArrayList<String> allCountry() {
        ArrayList<String> list = new ArrayList<>();

        Set<Entry<String, String>> set = M1.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Entry<String, String> e = itr.next();
            list.add(e.getKey());
        }

        return list;
    }
}