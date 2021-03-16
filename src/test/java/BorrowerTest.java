import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book = new Book("Night Watch", "Terry Pratchett", "Satire");
        library.addBook(book);
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.getCollectionSize());
        assertEquals(0, library.getNumberOfBooks());
    }
}
