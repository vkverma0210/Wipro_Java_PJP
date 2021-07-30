import java.util.*;

public class BookUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Author Name: - ");
        String authorName = s.nextLine();

        System.out.print("Enter Author Email: - ");
        String authorEmail = s.nextLine();

        System.out.print("Enter Author gender: - ");
        char authorGender = s.next().charAt(0);
        s.nextLine();
        Author author = new Author(authorName, authorEmail, authorGender);

        System.out.print("Enter Book Name: - ");
        String book_name = s.nextLine();

        System.out.print("Enter Book Price: - ");
        double bookPrice = s.nextDouble();

        System.out.print("Enter Book Quantity: - ");
        int qtyInStock = s.nextInt();
        System.out.println();

        Book b1 = new Book(book_name, author, bookPrice, qtyInStock);

        System.out.println("Book Name: - " + b1.getBookName());
        System.out.println("Book Author Name: - " + b1.getAuthor().getName());
        System.out.println("Book Author Email: - " + b1.getAuthor().getEmail());
        System.out.println("Book Author Gender: - " + b1.getAuthor().getGender());
        System.out.println("Book Book Price: - " + b1.getPrice());
        System.out.println("Book Book Quantity: - " + b1.getQtyInStock());
    }
}
