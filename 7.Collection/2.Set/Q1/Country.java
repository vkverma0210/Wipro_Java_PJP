import java.util.HashSet;
import java.util.Iterator;

class Country {
    HashSet<String> hs = new HashSet<>();

    public HashSet<String> saveCountryName(String countryName) {
        hs.add(countryName);
        return hs;
    }

    public String getCountry(String countryName) {
        Iterator<String> itr = hs.iterator();

        while (itr.hasNext()) {
            if (itr.next().equals(countryName))
                return countryName;
        }

        return null;
    }
}