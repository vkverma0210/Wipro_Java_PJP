package Q7;

public class RegisterUser {
    public void registerUser(String userName, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException();
        } else {
            System.out.println("User registration done successfully");
        }
    }
}
