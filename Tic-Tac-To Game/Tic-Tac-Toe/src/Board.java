public class Board {
    String current_state = "---------"; // the board is empty initially
    boolean turnX = true; // true if it is X's turn

    //converts a string description of a board to a char graphical view
    public String str2Board(String str) {
        String s = "| " + charOut(str.charAt(0)) + " | " +
                charOut(str.charAt(1)) + " | " +
                charOut(str.charAt(2)) + " |" +
                "\n----|---|----\n" +
                "| " + charOut(str.charAt(3)) + " | " +
                charOut(str.charAt(4)) + " | " +
                charOut(str.charAt(5)) + " |" +
                "\n----|---|----\n" +
                "| " + charOut(str.charAt(6)) + " | " +
                charOut(str.charAt(7)) + " | " +
                charOut(str.charAt(8)) + " |\n";
        return s;

    }

    @Override
    public String toString() {
        return str2Board(current_state);
    }

    // returns an blank space if s is "-" otherwise the char itself
    public char charOut(char s) {
        if (s == '-')
            return ' ';
        else
            return s;
    }
    // displays in char mode a board with keys indices for player's next move
    public void displayKeys() {
        String keys = "123456789";
        System.out.println(str2Board(keys));
        System.out.println("******************");
    }

    /* translates a player's action to an index that the X
    will be placed on the board - returns -1 if not valid int */

    public int action2Index(String action) {
        int index = -1;
        try {
            index = Integer.valueOf(action) - 1;
        }
        catch (NumberFormatException ex) {
            // user entered a non integer
            System.out.println("Invalid move");
        }
        if (index < 0 || index > 8) {
            System.out.println("Invalid move");
            index = -1;
        }
        return index;
    }

    // applies a (human/machine) player's move and moves to the next state
    public boolean step(String action) {
        int index = action2Index(action);
        if (index != -1 && index < current_state.length() &&
                current_state.charAt(index) != 'X' &&
                current_state.charAt(index) != 'O') {
            if (turnX)
                current_state = current_state.substring(0, index) + 'X' +
                        current_state.substring(index + 1, current_state.length());
            else
                current_state = current_state.substring(0, index) + 'O' +
                        current_state.substring(index + 1, current_state.length());
            // switch to other player's move
            turnX = !turnX;
            return true;
        } else {
            System.out.println("Action chosen by Player is not valid!");
            return false;
        }
    }

    /* returns 'X' or 'O' if either is a winner or '-' otherwise
    if a state is passed then that state is checked */

    public char checkWinner() {
        // check rows
        int countX = 0; // how many X
        int countO = 0; // how many O

        for (int pos=0; pos <= 6; pos = pos+3) {
            for (int col=0; col < 3; col++) {
                if (current_state.charAt(pos+col) == 'X')
                    ++countX;
                else if (current_state.charAt(pos+col) == 'O')
                    ++countO;
            }
            if (countX == 3)
                return 'X';
            else if (countO == 3)
                return 'O';
            else {
                countX = 0;
                countO = 0;
            }
        }

        // check columns
        countX = 0;
        countO = 0;
        for (int pos=0; pos < 3; ++pos) {
            for (int row=0; row <= 6; row = row+3) {
                if (current_state.charAt(row+pos) == 'X')
                    ++countX;
                else if (current_state.charAt(row+pos) == 'O')
                    ++countO;
            }
            if (countX == 3)
                return 'X';
            else if (countO == 3)
                return 'O';
            else {
                countX = 0;
                countO = 0;
            }
        }

        // check top-left bottom-right diagonal
        countX = 0;
        countO = 0;
        for (int i=0; i < 9; i=i+4) {
            if (current_state.charAt(i) == 'X')
                ++countX;
            else if (current_state.charAt(i) == 'O')
                ++countO;
        }

        if (countX == 3)
            return 'X';
        else if (countO == 3)
            return 'O';

        // check top-right bottom-left diagonal
        countX = 0;
        countO = 0;
        for (int i=2; i < 8; i=i+2) {
            if (current_state.charAt(i) == 'X')
                ++countX;
            else if (current_state.charAt(i) == 'O')
                ++countO;
        }

        if (countX == 3)
            return 'X';
        else if (countO == 3)
            return 'O';
        // No winner!
        return '-';
    }

    // returns true if there are no moves left on the board
    public boolean isFull() {
        int empty = 0;
        for (int i=0; i < current_state.length(); i++)
            if (current_state.charAt(i) == '-')
                return false;
        System.out.println("*** The board is full! ***");
        return true;
    }
}

