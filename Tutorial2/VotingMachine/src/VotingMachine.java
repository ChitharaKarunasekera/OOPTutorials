import java.util.Random;

public class VotingMachine {
    Random rand = new Random();

    private int labour;
    private int conservative;

    public VotingMachine(){
        this.labour = 0;
        this.conservative = 0;
    }

    public void clearState(){
        this.labour = 0;
        this.conservative = 0;
    }

    public void voteLabour() {
        this.labour++;
    }

    public void voteConservative(){
        this.conservative =+ rand.nextInt(5);
    }

    public int getLabour(){
        return this.labour;
    }

    public int getConservative(){
        return this.conservative;
    }
}
