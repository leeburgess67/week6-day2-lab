import org.junit.Before;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book();
        library = new Library();
        borrower = new Borrower();
    }

}
