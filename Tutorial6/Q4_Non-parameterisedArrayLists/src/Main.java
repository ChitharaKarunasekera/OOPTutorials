import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3.4);
        list.add(new Integer(4));
        Book myBook = new Book();
        list.add(myBook);

        double d;
        d = list.indexOf(0); // Problematic line
        int d2 = list.indexOf(1); // Problematic line
        int b3 = (int) list.get(1); // Problematic line
        int b2 = list.indexOf(2); // Problematic line
    }
}
