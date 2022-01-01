import java.util.*;
class HumanPlayer extends Player {
    HumanPlayer(Board board, char symbol) {
        super(board, symbol);
    }

    // takes an action based on the current state of the Board
    public String act() {
        System.out.println(board); // display the current state of the board
        board.displayKeys(); // display choices for the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a move: ");
        String action = sc.next();
        return action;
    }
}

