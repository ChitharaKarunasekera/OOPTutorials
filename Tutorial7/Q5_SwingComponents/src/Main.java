import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ComponentExample");
        JButton button = new JButton("press me");
        JPanel jp = new JPanel();
        jp.setBackground(Color.white);

        // set the content pane to be the newly created JPanel
        frame.setContentPane(jp);

        frame.getContentPane().add(button);

        // register an event handler for frame events
        frame.addWindowListener(new MyWindowListener());

        // register an event handler for button events
        button.addActionListener(new MyActionListener(frame));

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
