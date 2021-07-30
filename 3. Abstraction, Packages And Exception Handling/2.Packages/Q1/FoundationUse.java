import Test.Foundation;

public class FoundationUse {
    public static void main(String[] args) {
        Foundation f = new Foundation();

        f.var1 = 1;
        f.var2 = 2;
        f.var3 = 3;
        f.var4 = 4;

        System.out.println(f.var1); // Not accessible
        System.out.println(f.var2); // Not accessible
        System.out.println(f.var3); // Not accessible
        System.out.println(f.var4); // Accessible

    }
}
