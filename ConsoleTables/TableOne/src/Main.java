public class Main {

    public static void main(String[] args) {
        int id1 = 3456, id2 = 5757;
        String name1 = "Saad Yousuf", name2 = "John Petersen";
        double gpa1 = 3.91, gpa2 = 3.9;
        System.out.printf("%-6s%-20s%6s\n", "IDs","Names","GPAs");
        System.out.printf("%-6d%-20s%6.2f\n", id1,name1,gpa1);
        System.out.printf("%-6d%-20s%6.2f\n", id2, name2, gpa2);
    }
}
