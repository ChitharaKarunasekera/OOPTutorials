import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice;
        String haveToken;

        VendingMachine machine1 = new VendingMachine(10,0);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nB - Buy cans\n" +
                    "F - Fill cans\n" +
                    "S - Check status\n" +
                    "Q- Quit");

            System.out.print("\nEnter your choice : ");
            choice = sc.next();

            //Buy cans
            if (choice.equalsIgnoreCase("B")) {
                System.out.println("You can buy cans!");

                System.out.print("Have a Token? (Y/N)");
                haveToken = (sc.next());

                if (haveToken.equalsIgnoreCase("N")) {
                    System.out.println("You must have a token!");
                } else {
                    System.out.println("Token successfully inserted.");
                    machine1.insertToken();
                }
            }
            //Fill cans
            else if (choice.equalsIgnoreCase("F"))
            {
                System.out.println("You can fill cans!");
                System.out.print("Enter  number of cans you insert: ");
                int count = sc.nextInt();
                machine1.fillUp(count);
            }
            else if(choice.equalsIgnoreCase("S"))
            {
                System.out.println("Total cans in machine : " + machine1.getTotalCans());
                System.out.println("Total tokens in machine : " + machine1.getTotalTokens());
            }
            else if (choice.equalsIgnoreCase("Q"))
            {
                System.out.println("Machine Terminated!");
                break;
            }
            else{
                System.out.println("Option not found!");
            }
        }


    }
}
