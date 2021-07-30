public class CountryUse {
    public static void main(String[] args) {
        Country c = new Country();

        c.saveCountryName("India");
        c.saveCountryName("Australia");
        c.saveCountryName("USA");
        c.saveCountryName("Russia");
        c.saveCountryName("England");

        System.out.println("India: " + c.getCountry("India"));
        System.out.println("Sri Lanka: " + c.getCountry("Sri Lanka"));
    }
}
