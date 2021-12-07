import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) {
        Comparator<BankAccount> comparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                if (o1.getBalance() > o2.getBalance()){
                    return -1;
                }
                else if (o1.getBalance() < o2.getBalance()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };

        BankAccount ba1 = new BankAccount(1000.0);
        BankAccount ba2 = new BankAccount(500.0);
        BankAccount ba3 = new BankAccount(2000.0);
        BankAccount ba4 = new BankAccount(100.0);
        BankAccount ba5 = new BankAccount(5000.0);

        // put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        list.add(ba4);
        list.add(ba5);

        // call the library sort method
        Collections.sort(list, comparator);

        // print out the sorted list
        for (BankAccount b : list)
            System.out.println(b.getBalance());
    }
}