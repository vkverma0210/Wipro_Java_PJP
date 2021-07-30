public class Book {
    private String bookName;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String bookName, Author author, double price, int qtyInStock) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    String getBookName() {
        return bookName;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getQtyInStock() {
        return qtyInStock;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
