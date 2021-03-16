import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);

        book1 = new Book("Night Watch", "Terry Pratchett", "Satire");
        book2 = new Book("The Prince", "Niccolo Machiavelli", "Non-Fiction");
        book3 = new Book("The C++ Programming Language", "Bjarne Stroustrup", "Non-Fiction");
        book4 = new Book("The Hobbit", "JRR Tolkien", "Fiction");
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void checkIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals(true, library.isFull());
    }

    @Test
    public void checkFullWhenNot(){
        assertEquals(false, library.isFull());
    }

    @Test
    public void refusesToAddBeyondCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        assertEquals(3, library.getNumberOfBooks());

    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canDetectBooksInGenre(){
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        
        assertEquals(0, library.numberInGenre("Biography"));
        assertEquals(1, library.numberInGenre("Fiction"));
        assertEquals(2, library.numberInGenre("Non-Fiction"));
    }
}
