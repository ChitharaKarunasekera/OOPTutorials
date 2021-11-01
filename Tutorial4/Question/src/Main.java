import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000);
        BankAccount ba2 = new BankAccount(1000);
        BankAccount ba3 = new BankAccount(500);

        // put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);

        // call the library sort method
        list;
        Collections.sort(list);

        // print out the sorted list
        for (BankAccount b : list)
            System.out.println(b.getBalance());
    }
}
