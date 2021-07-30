import java.util.HashMap;

public class CountryUse {
    public static void main(String[] args) {
        Country c = new Country();
        c.saveCountryCapital("India", "Delhi");
        c.saveCountryCapital("USA", "Washington D.C.");
        c.saveCountryCapital("Japan", "Tokyo");

        System.out.println(c.getCapital("India"));
        System.out.println(c.getCountry("Tokyo"));
        System.out.println(c.allCountry());

        HashMap<String, String> M2 = c.capitalKey();
        System.out.println(M2);
    }
}
