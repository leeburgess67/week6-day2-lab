import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void takeBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }
}
