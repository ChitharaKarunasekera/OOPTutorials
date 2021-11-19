public class Main {

    public static void main(String[] args) {
        String name = "Chithara";
        String team = "Chithzz";
        int ones = 2;
        int twos = 1;
        int threes = 3;
        int tot = 78;
        int comp = 10;
        int curr = 6;


        String leftAlignFormat = "| %-11s | %-12s | %-13d | %-13d | %-13d | %-12d | %-9d |%n";
        System.out.format("                                                nvbnv n                                                  %n");
        System.out.format("+-------------+--------------+---------------+---------------+---------------+--------------+-----------+%n");
        System.out.format("| Driver Name | Team Name    | 1st Positions | 2nd Positions | 3rd Positions | Total Points | Completed |%n");
        System.out.format("+-------------+--------------+---------------+---------------+---------------+--------------+-----------+%n");
        for (int i = 0; i < 5; i++) {
            System.out.format(leftAlignFormat, name,team,ones,twos,threes,tot,comp);
        }
        System.out.format("+-------------+--------------+---------------+---------------+---------------+--------------+-----------+%n");
    }
}
