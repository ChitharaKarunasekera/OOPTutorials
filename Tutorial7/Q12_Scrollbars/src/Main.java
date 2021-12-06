import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(new ImageIcon("peppers.png"));
        JScrollPane jsp = new JScrollPane(label);
        // add label in the frame
        frame.getContentPane().add(jsp);
        frame.setSize(200, 200);
        //frame.pack();
        frame.setVisible(true);

    }
}
