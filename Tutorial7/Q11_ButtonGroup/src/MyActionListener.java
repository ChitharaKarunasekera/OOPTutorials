import java.awt.event.ActionEvent;

public class MyActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Selected: " + e.getActionCommand());
    }
}
