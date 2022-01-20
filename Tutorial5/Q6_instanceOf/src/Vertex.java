public class Vertex implements Node{
    int x;// x coordinates
    int y;// y coordinates

    Vertex(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }

}
