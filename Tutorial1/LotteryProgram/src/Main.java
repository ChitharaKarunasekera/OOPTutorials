import java.util.Random;
import java.util.Scanner;

public class Main {

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

        int max = 5;
        int min = 1;

        for (int i = 0; i < refLuckyNums.length; i++) {
            refLuckyNums[i] = randNum.nextInt(max - min + 1) + min;
        }
    }

    public static void checkMatch(int[] refInputs, int[] refLuckyNums) {
        int count = 0;

        //tack one input at time
        for (int checkNum : refInputs) {
            for (int currentElement : refLuckyNums) {
                if (currentElement == checkNum) {
                    count++;
                    break;
                }
            }
        }
<<<<<<< HEAD
=======

        System.out.println("Total Matches : " + count);
>>>>>>> Tutorial1
    }

}


//    Scanner input = new Scanner(System.in);
//
//    Random randNum = new Random(); //instance of Random class
//
//    int[] userInputs = new int[6];
//    int[] drawNumbers = new int[6];
//
//        System.out.println("Lottery Game!\n");
//
//                //Get user inputs, store them in an array, and display them
//                for (int i = 0; i < userInputs.length; i++) {
//        System.out.print("Enter lottery number " + (i + 1) + ": ");
//        userInputs[i] = input.nextInt();
//        }
//        for (int i = 0; i < userInputs.length; i++) {
//        System.out.print(userInputs[i] + " ");
//        }
//
//        //Generate 6 random numbers, store them in an array and display them
//        int max = 49;
//        int min = 1;
//        int matches = 0;
//
//        for (int i = 0; i < 6; i++) {
//        drawNumbers[i] = randNum.nextInt(max - min + 1) + min;//numbers between 1 - 49
//        }
//
//        System.out.println("\n");
//
//
//        for (int i = 0; i < drawNumbers.length; i++) {
//        System.out.print(drawNumbers[i] + " ");
//        }
//



