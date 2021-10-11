import java.util.Scanner;

public class VendingMachine {
    //Instance Variables
    private int totalCans;
    private int totalTokens;

    public VendingMachine(int totalCans, int totalTokens){
        this.totalCans = totalCans;
        this.totalTokens =  totalTokens;
    }


    //to add soda
    public void fillUp(int cans) {
        this.totalCans += cans;
    }

    //to drop soda to delivery slot
    public void drop(int cans){
        //decrease count of cans by one for each token
        this.totalCans--;
    }

    //get Tokens from user
    public void insertToken (){
        this.totalTokens++;//increase the count of tokens by one

        //drop a can for each token if cans are awailable
        if (totalCans > 0) {
            drop(1);
        }
        else
        {
            System.out.println("Sorry! Cans are over.");
        }
    }

    //Get the current number of cans in machine
    public int getTotalCans() {
        return totalCans;
    }

    public int getTotalTokens() {
        return totalTokens;
    }
}
