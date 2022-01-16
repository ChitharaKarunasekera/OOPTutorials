import javax.sound.midi.Soundbank;
import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        final String fileName = "Data";

        ArrayList<Formula1Driver> drivers = new ArrayList<>();
        drivers.add(new Formula1Driver("Chithara", "Nugegoda", "Chithzz", 0,1,3,45,5,2));
        drivers.add(new Formula1Driver("Tom", "Nugegoda", "Chithzz", 0,1,3,45,5,2));
        drivers.add(new Formula1Driver("Max", "Nugegoda", "Chithzz", 0,1,3,45,5,2));
        drivers.add(new Formula1Driver("Ann", "Nugegoda", "Chithzz", 0,1,3,45,5,2));
        drivers.add(new Formula1Driver("Chanu", "Nugegoda", "Chithzz", 0,1,3,45,5,2));
        drivers.add(new Formula1Driver("Jack", "Nugegoda", "Chithzz", 0,1,3,45,5,2));


//        circles.add(new Circle("c1", 14));
//        circles.add(new Circle("c2", 7));
//        circles.add(new Circle("c3", 21));
//        circles.add(new Circle("c4", 28));


//        System.out.println("Enter HP: ");
//        hp = input.next();


        System.out.println("S - Save data");
        System.out.println("L - Load data");

        System.out.print("\nEnter Option: ");
        option = input.next();

        if (option.equalsIgnoreCase("S")){
            SaveData saveData = new SaveData();
            saveData.drivers = drivers;

            try {
                ResourceManager.save(saveData, fileName);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else if (option.equalsIgnoreCase("L")){
            try {
                SaveData saveData = (SaveData) ResourceManager.load(fileName);
//                name = saveData.name;
//                hp = String.valueOf(saveData.hp);
                drivers = saveData.drivers;

                System.out.println("Saved Circles: ");
                for (Formula1Driver driver: drivers){
                    System.out.println(driver.getName());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
