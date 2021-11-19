import java.awt.*;
import java.awt.event.WindowAdapter;

public class MyWindowListener extends WindowAdapter {
    public void windowClosing(Window e){
        System.out.println("Closing Window");
        System.exit(0);
    }
}
