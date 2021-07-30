/**
 * Author
 */
public class Author {
    private String authorName;
    private String email;
    private char gender;

    Author(String authorName, String email, char gender) {
        this.authorName = authorName;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return authorName;
    }

    String getEmail() {
        return email;
    }

    char getGender() {
        return gender;
    }
}