package Q7;

class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        System.out.println("InvalidCountryException occured");
        System.out.println("User Outside India cannot be registered");
    }
}
