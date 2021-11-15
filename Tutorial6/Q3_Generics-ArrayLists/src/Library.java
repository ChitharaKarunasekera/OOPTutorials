import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public void populate(){
        for (int i=0; i<4; i++){
            books.add(new Book("Chithzz", "My Book"));
        }
    }

    public void displayAllBooks(){
        for (Book thisBook: books){
            System.out.println(thisBook.author + ", " + thisBook.title);
        }
    }
}
