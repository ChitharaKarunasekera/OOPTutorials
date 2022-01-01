abstract class Player {
    Board board;
    char symbol;
    // player plays with symbol 'X' or 'O'
    Player(Board b, char symbol1) {
        board = b;
        symbol = symbol1;
    }
    // takes (returns) an action based on the current state of the Board
    public abstract String act();
}
