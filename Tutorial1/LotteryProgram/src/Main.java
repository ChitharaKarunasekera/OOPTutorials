import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random randNum = new Random(); //instance of Random class

        int[] userInputs = new int[6];
        int[] drawNumbers = new int[6];

        System.out.println("Lottery Game!\n");

        //Get user inputs, store them in an array, and display them
        for (int i = 0; i < userInputs.length; i++) {
            System.out.print("Enter lottery number " + (i + 1) + ": ");
            userInputs[i] = input.nextInt();
        }
        for (int i = 0; i < userInputs.length; i++) {
            System.out.print(userInputs[i] + " ");
        }

        //Generate 6 random numbers, store them in an array and display them
        int max = 5;
        int min = 1;
        int matches = 0;

        for (int i = 0; i < 6; i++) {
            drawNumbers[i] = randNum.nextInt(max - min + 1) + min;//numbers between 1 - 49
        }

        System.out.println("\n");


        for (int i = 0; i < drawNumbers.length; i++) {
            System.out.print(drawNumbers[i] + " ");
        }


        for (int i = 0; i < drawNumbers.length; i++) {
            for (int j = 0; j < userInputs.length; j++) {
                if (drawNumbers[i] == userInputs[j]) {
                    System.out.println(userInputs[j]);
                    matches++;
                }
            }
        }

        System.out.println("You have " + matches + " ma!")
    }
}
