import java.util.*;
class RandomPlayer extends Player {
    RandomPlayer(Board board, char symbol) {
        super(board, symbol);
    }

    // takes an action based on the current state of the Board
    public String act() {
        System.out.println(board); // display the current state of the board
        System.out.println("Machine is thinking...");

        // simulate thinking by delaying a bit
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        // find all available actions (empty slots)
        ArrayList<Integer> available = new ArrayList<>();
        for (int i = 0; i < board.current_state.length(); i++)
            if (board.current_state.charAt(i) == '-')
                available.add(i);

        // choose a random action among the available empty slots
        Random gen = new Random();
        int index = gen.nextInt(available.size());
        System.out.println("*** Played position-> " + (1 + available.get(index)) + "\n");
        
        // numbering scheme starts at 1
        return String.valueOf(1 + available.get(index));
    }
}
