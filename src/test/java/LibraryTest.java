import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;


    @Before
    public void before(){
        library = new Library();
    }


    @Test
    public void booksStartEmpty() {
        assertEquals(0, library.booksCount());
    }

    @Test
    public void checkNumberOfBooks() {
        assertEquals(0, library.booksCount());
    }

    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.booksCount());
    }

    @Test
    public void checkCapacity(){
        assertEquals(5, library.capacityCheck());

    }
    @Test
    public void cantAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.booksCount());

    }
}
