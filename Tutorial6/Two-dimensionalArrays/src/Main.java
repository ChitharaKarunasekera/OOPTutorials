public class Main {

    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();

        System.out.println("Maximum value in row 3 is: " + board1.findMaxInRow(2));
        System.out.println("Maximum value in column 3 is: " + board1.findMaxInColumn(2));
        System.out.println("Maximum value in diagonal is: " + board1.findMaxInDiagonal());
    }
}
