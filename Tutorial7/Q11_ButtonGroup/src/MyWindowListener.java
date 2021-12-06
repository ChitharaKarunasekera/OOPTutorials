import java.awt.event.WindowEvent;

public class MyWindowListener {
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing window!");
        System.exit(0);
    }
}
