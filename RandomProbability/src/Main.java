import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> prob = new ArrayList<>();

        for (int i=0; i<10; i++) {
            int randomNum = rand.nextInt(4)+1;
            if (randomNum <= 1.6){
                prob.add(randomNum);
            }
            else {
                prob.add(randomNum);
            }
        }

        for (int number: prob){
            System.out.println(number);
        }

//        for (int i=0; i<10; i++){
//            int random = rand.nextInt()
//        }



//        System.out.println(randomNum);
//        if (randomNum > 0.5){
//            System.out.println(randomNum);
//            prob.add(randomNum);
//        }



    }
}
