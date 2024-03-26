package exercise2;

import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ErrorWindow extends JFrame{
    public ErrorWindow(String title) {
        super(title);
        this.setBounds(200, 200, 300, 200);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JDialog msg = new JDialog(getOwner(), "Error, operation not supported");
        this.add(msg);
    }
}
