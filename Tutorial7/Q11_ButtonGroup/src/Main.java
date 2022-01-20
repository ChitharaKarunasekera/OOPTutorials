import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Buttons and CheckBoxes Example");
        // create a JPanel to hold the checkboxes
        JPanel topPanel = new JPanel();

        // JPanel has BoxLayout in x-direction
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        JCheckBox chk1 = new JCheckBox("GPS");
        JCheckBox chk2 = new JCheckBox("Alloys");
        JCheckBox chk3 = new JCheckBox("Power Steering");
        JCheckBox chk4 = new JCheckBox("Convertible");
        JLabel label = new JLabel("Extras: ");
        // add label and checkboxes in JPanel;
        topPanel.add(label);
        topPanel.add(chk1);
        topPanel.add(chk2);
        topPanel.add(chk3);
        topPanel.add(chk4);
        // create a JPanel to hold the checkboxes
        JPanel leftPanel = new JPanel();
        // JPanel has BoxLayout in x-direction
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        JRadioButton rd1 = new JRadioButton("CD Player");
        JRadioButton rd2 = new JRadioButton("DVD Player");
        JRadioButton rd3 = new JRadioButton("Cassette Player");
        // group radio buttons together
        ButtonGroup group = new ButtonGroup();
        group.add(rd1);
        group.add(rd2);
        group.add(rd3);
        // add radio buttons in the JPanel
        leftPanel.add(rd1);
        leftPanel.add(rd2);
        leftPanel.add(rd3);
        // add panels in the frame
        frame.getContentPane().add(topPanel, "North");
        frame.getContentPane().add(leftPanel, "West");
        // register an event handler for frame events
        frame.addWindowListener(new MyWindowListener());
        // register an event handler for checkboxes
        MyCheckBoxListener chkListener = new MyCheckBoxListener();
        chk1.addItemListener(chkListener);
        chk2.addItemListener(chkListener);
        chk3.addItemListener(chkListener);
        chk4.addItemListener(chkListener);

        // register an event handler for radio buttons
        ActionListener radioListener = new MyActionListener();
        rd1.addActionListener(radioListener);
        rd2.addActionListener(radioListener);
        rd3.addActionListener(radioListener);
        frame.setSize(400, 400);
        //frame.pack();
        frame.setVisible(true);
    }
}
