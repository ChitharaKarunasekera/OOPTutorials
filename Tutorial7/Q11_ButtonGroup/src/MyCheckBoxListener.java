import javax.swing.*;
import java.awt.event.ItemEvent;

public class MyCheckBoxListener {
    public void itemStateChanged(ItemEvent e) {
        JCheckBox chk = (JCheckBox) e.getItem();
        String label = chk.getText();
        if (e.getStateChange() == e.SELECTED)
            System.out.println(label + " selected");
        else
            System.out.println(label + " de-selected");
    }

}
