import java.io.Serializable;

public class Circle implements Serializable {
    String name;
    int radius;

    public Circle(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    public Circle(String name, int radius, int size){
        this.name = name;
        this.radius = radius;
        this.radius = size;
    }
}
