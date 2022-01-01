class TicTacToeGame {
    Board board;
    Player human;
    Player computer;

    TicTacToeGame(Board board1, Player player1, Player actor1) {
        board = board1;
        human = player1;
        computer = actor1;
    }

    public void playGame() {
        boolean finished = false;
        char winner;
        while (!finished) {
            play_human_move();
            winner = board.checkWinner();
            if (winner == 'X' || winner == 'O' || board.isFull()) {
                System.out.println(" *** The winner is: " + winner + " ***");
                break;
            }
            play_machine_move();
            winner = board.checkWinner();
            if (winner == 'X' || winner == 'O' || board.isFull()) {
                System.out.println(" *** The winner is: " + winner + " ***");
                break;
            }
        }
        System.out.println(board);
    }

    public void play_human_move() {
        String action = human.act();
        boolean success = board.step(action);
        // check if the human's move was valid
        while (!success) {
            action = human.act();
            success = board.step(action);
        }
    }

    public void play_machine_move() {
        // choose a valid action
        String action = computer.act();
        // apply the action to the plant (game)
        board.step(action);
    }

    
    public static void main(String[] args) {
        Board board = new Board();
        Player human = new HumanPlayer(board, 'X');
        Player computer = new RandomPlayer(board, 'O'); // Replace with your player
        TicTacToeGame game = new TicTacToeGame(board, human, computer);
        game.playGame();
    }
}