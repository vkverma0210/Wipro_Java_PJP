public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers k1 = new KidUsers();
        k1.setAge(8);
        k1.setBookType("Kids");
        k1.registerAccount();
        k1.requestBook();

        KidUsers k2 = new KidUsers();
        k2.setAge(18);
        k2.setBookType("Fiction");
        k2.registerAccount();
        k2.requestBook();
        System.out.println();

        AdultUser a1 = new AdultUser();
        a1.setAge(10);
        a1.setBookType("Kids");
        a1.registerAccount();
        a1.requestBook();

        AdultUser a2 = new AdultUser();
        a2.setAge(40);
        a2.setBookType("Fiction");
        a2.registerAccount();
        a2.requestBook();
        System.out.println();
    }
}
