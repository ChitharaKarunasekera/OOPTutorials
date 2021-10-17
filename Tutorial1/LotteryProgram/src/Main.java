import java.util.Random;
import java.util.Scanner;

public class Man {

    public static void main(String[] args) {
        Random randNum = new Random(); //instance of Random class
        System.out.println("Lottery Game!\n");

        int[] inputs = new int[6];
        int[] luckyNums = new int[6];

        //Get a set of user numbers
        setUserNumbers(inputs);

        //Display user numbers
        System.out.println("\nYour Values,");
        for (int i : inputs) {
            System.out.print(i + " ");
        }
        System.out.println("");


        //Generate the 6 Lucky numbers
        setLuckyNums(luckyNums);

        //Display the luck numbers
        System.out.println("\nLucky Numbers,");
        for (int i : luckyNums) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Results.");
        checkMatch(inputs, luckyNums);
    }

    public static void setUserNumbers(int[] refInputs) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < refInputs.length; i++) {
            System.out.print("Enter lucky number " + (i + 1) + " : ");
            refInputs[i] = input.nextInt();
        }
    }

    public static void setLuckyNums(int[] refLuckyNums) {
        Random randNum = new Random(); //instance of Random class

        int max = 49;
        int min = 1;

        for (int i = 0; i < refLuckyNums.length; i++) {
            //insert a set of random numbers to the array
            refLuckyNums[i] = randNum.nextInt(max - min + 1) + min;
        }
    }

    public static void checkMatch(int[] refInputs, int[] refLuckyNums) {
        int count = 0;

        //tack one input at time
        for (int checkNum : refInputs) {
            for (int currentElement : refLuckyNums) {
                if (currentElement == checkNum) {
                    //if current elements of inputs includes in the set of lucky numbers increase count by one
                    count++;
                    break;
                }
            }
        }

    }

}
