public class CommandLine3 {
    public static void main(String[] args) {
        int a, b, ans;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        ans = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + ans);
    }
}
