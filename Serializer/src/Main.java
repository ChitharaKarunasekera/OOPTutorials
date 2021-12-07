import javax.sound.midi.Soundbank;
import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        final String fileName = "Data";

        ArrayList<String> names = new ArrayList<>();

        names.add("Chithara");
        names.add("Chanara");
        names.add("Chithzz");
        names.add("Chanuzz");

//        System.out.print("Enter name: ");
//        name = input.next();
//
//        System.out.println("Enter HP: ");
//        hp = input.next();


        System.out.println("S - Save data");
        System.out.println("L - Load data");

        System.out.print("\nEnter Option: ");
        option = input.next();

        if (option.equalsIgnoreCase("S")){
            SaveData saveData = new SaveData();
            saveData.names = names;

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
                names = saveData.names;

                System.out.println("Saved Names: ");
                for (String name: names){
                    System.out.println(name);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
