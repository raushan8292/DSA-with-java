package HashSet_libraryMangement;

import java.util.HashSet;
import java.util.Iterator;

public class UseLibrary {
    public static void main(String[] args) {

        Book b1 = new Book("c", "Mingle", 555);
        Book b2 = new Book("C++", "joda", 553);
        Book b3 = new Book("java", "vorden", 558);
        Book b5 = new Book("C++", "joda", 553);
        Book b4 = new Book("java", "vorden", 558);

        Library library = new Library();


        System.out.println("Book1 added: " + library.addBook(b1));
        System.out.println("Book2 added: " + library.addBook(b2));
        System.out.println("Book3 added: " + library.addBook(b3));
        System.out.println("Book4 added: " + library.addBook(b4));
        System.out.println("Book5 added: " + library.addBook(b5));

        System.out.println("Book added in library " + library.getBookSize());

        HashSet<Book> hs = library.getAllBooks();

        Iterator <Book> it = hs.iterator();

        while (it.hasNext()){

         Book b = it.next();
            System.out.println(b);
        }




    }
}
