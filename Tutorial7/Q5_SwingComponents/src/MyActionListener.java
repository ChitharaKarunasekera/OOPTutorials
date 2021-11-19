import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListener implements ActionListener {
    private int i=1;
    JFrame frame;
    MyActionListener(JFrame f) {
        frame = f;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Pressed Button " + i++ + "th time!");

        if (i % 2 == 0)
            frame.getContentPane().setBackground(Color.red);
        else
            frame.getContentPane().setBackground(Color.white);
    }
}
