package HashSet_libraryMangement;

import java.util.HashSet;

public class Library {

  private  HashSet <Book>  hs;

   public  Library(){

       hs = new HashSet<>();
   }

   public boolean addBook(Book b){

       return  hs.add(b);
   }

   public  int getBookSize(){

       return hs.size();
   }

   public HashSet<Book> getAllBooks(){

       return hs;
   }
}
