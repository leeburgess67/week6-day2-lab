import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before() {
        book = new Book(Genre.HORROR);
        library = new Library();
        borrower = new Borrower();
    }

    @Test
    public void collectionCount() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBook(book);
        borrower.takeBookFromLibrary(library);
        assertEquals(1, borrower.collectionCount());
    }
}
