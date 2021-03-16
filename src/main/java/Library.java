import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> genreList;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
        this.genreList = new HashMap<>();
    }


    public int getNumberOfBooks() {
        return this.stock.size();
    }

    public void addBook(Book book) {

        if(!this.isFull()) {
            this.stock.add(book);
            this.genreList.merge(book.getGenre(), 1, Integer::sum);

        }
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        if (this.stock.size() == this.capacity)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }

    public int numberInGenre(String genre){

        if (genreList.containsKey(genre)){
            return genreList.get(genre);
        }
        else
        {
            return 0;
        }
    }
}
