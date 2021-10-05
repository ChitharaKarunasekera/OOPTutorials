import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random randNum = new Random(); //instance of Random class
        System.out.println("Lottery Game!\n");

        int[] inputs = new int[3];
        int[] luckyNums = new int[6];

        //Get a set of user numbers
        setUserNumbers(inputs);

        //Display user numbers
        System.out.println("\nYour Values,");
        for (int i=0; i< inputs.length; i++){
            System.out.print(randNum.nextInt(5 - 1 + 1) + 1);
        }
        System.out.println("");


        //Generate the 6 Lucky numbers
        //setLuckyNums(luckyNums);

        //Display the luck numbers
        System.out.println("\nLucky Numbers,");
        for (int i=0; i< luckyNums.length; i++){
            System.out.print(luckyNums[i] + " ");
        }
        System.out.println("");
    }

    public static void setUserNumbers(int[] refInputs) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < refInputs.length; i++) {
            System.out.print("Enter lucky number " + (i+1) + " : ");
            refInputs[i] = input.nextInt();
        }
    }

//    public static void setLuckyNums(int[] refLuckyNums){
//        Random randNum = new Random(); //instance of Random class
//
//        int max = 1;
//        int min = 5;
//
//        for (int i=0; i< refLuckyNums.length; i++){
//            refLuckyNums[i] = randNum.nextInt(max - min + 1) + min;
//        }
//    }
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
//        int max = 5;
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
//
//        for (int i = 0; i < drawNumbers.length; i++) {
//        for (int j = 0; j < userInputs.length; j++) {
//        if (drawNumbers[i] == userInputs[j]) {
//        System.out.println(userInputs[j]);
//        matches++;
//        }
//        }
//        }
//
//        System.out.println("You have " + matches + " matches!");
//        }
