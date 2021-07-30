package Q7;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of user: ");
        String name = s.nextLine();

        System.out.println("Enter country name: ");
        String countryName = s.nextLine();

        RegisterUser r1 = new RegisterUser();
        try {
            r1.registerUser(name, countryName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
