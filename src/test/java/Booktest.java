import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Booktest {

    private Book book1;

    @Before
    public void before (){
        book1 = new Book("Night Watch", "Terry Pratchett", "Satire");
    }

    @Test
    public void hasTitle(){
        assertEquals("Night Watch", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Terry Pratchett", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Satire", book1.getGenre());
    }

}
