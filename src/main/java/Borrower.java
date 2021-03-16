import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        collection = new ArrayList<>();
    }

    public int getCollectionSize() {
        return collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library) {

        this.addBook(library.removeBook());
    }
}
