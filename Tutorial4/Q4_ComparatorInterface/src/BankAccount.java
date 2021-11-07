import java.util.Comparator;

public class BankAccount implements Comparator<BankAccount> {
    private double balance;

    public BankAccount(){}

    public BankAccount(double balance){
        this.balance = balance;
    }

    public int compare(BankAccount object1, BankAccount object2) {
        if (object1.balance < object2.balance){
            return -1;
        }
        else if (object1.balance == object2.balance){
            return 0;
        }
        else{
            return 1;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}




//import java.util.Comparator ;
//
//public class BankAccount implements Comparator <BankAccount>{
//
//    private double balance;
//
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//
//    public int compare(BankAccount object1, BankAccount object2) {
//        if (object1.balance < object2.balance){
//            return -1;
//        }
//        else if (object1.balance == object2.balance){
//            return 0;
//        }
//        else{
//            return 1;
//        }
//    }
//
//    public double getBalance() {
//        return this.balance;
//    }
//
//}

