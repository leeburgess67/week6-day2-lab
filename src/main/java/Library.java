import java.util.ArrayList;

public class Library {
        private ArrayList<Book> books;
        private Integer capacity;


    public Library(){
            this.books = new ArrayList<>();
            this.capacity = 5;
        }

    public int booksCount(){
        return this.books.size();
    }


    public void addBook(Book book) {

        if (this.booksCount() < capacity) {
            this.books.add(book);
        }
    }


    public int capacityCheck() {
        return capacity;
    }

    public Book removeBook(){
        return this.books.remove(0);

    }
}

