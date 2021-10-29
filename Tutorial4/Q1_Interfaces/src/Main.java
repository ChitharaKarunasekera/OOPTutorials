public class Main {

    public static void main(String[] args) {
        String[] grade = {"a","a","a","a","a"};

        Printable p1 = new Letter("Hello this is chithara's letter!");
        Printable p2 = new Student("Chithara", grade);

        p1.print();
        p2.print();
    }
}
