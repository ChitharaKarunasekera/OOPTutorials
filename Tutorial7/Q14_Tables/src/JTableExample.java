import javax.swing.*;

public class JTableExample extends JPanel {
    public JTableExample() {
        String[] columnNames = {"First Name",
                "Last Name",
                "Position",
                "Age",
                "Salary"};

        Object[][] data = {
                {"John", "Smith", "Manager",
                        new Integer(35), new Integer(40000)},
                {"Tom", "Bubble", "Developer",
                        new Integer(22), new Integer(22000)},
                {"Helen", "Hitchcock", "Project Leader",
                        new Integer(30), new Integer(34000)},
                {"Kate", "Silva", "Receptionist",
                        new Integer(20), new Integer(18000)},
                {"Susie", "White", "Developer",
                        new Integer(25), new Integer(25000)}
        };
        final JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        //Add the scroll pane to this panel.
        add(scrollPane);
    }


    private static void createAndShowGUI() {
        // Create the frame window
        JFrame frame = new JFrame("JTableExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create and set up the content pane.
        JTableExample newContentPane = new JTableExample();
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);
        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }

}
