import java.util.TreeSet;
import java.util.Iterator;

class Country {
    TreeSet<String> ts = new TreeSet<>();

    public TreeSet<String> saveCountryName(String countryName) {
        ts.add(countryName);
        return ts;
    }

    public String getCountry(String countryName) {
        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            if (itr.next().equals(countryName))
                return countryName;
        }

        return null;
    }
}