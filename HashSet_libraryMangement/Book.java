package HashSet_libraryMangement;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int price;


    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return price == book.price && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price);
    }

}
