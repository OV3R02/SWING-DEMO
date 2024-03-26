package exercise2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class ErrorWindow extends JFrame{
    public ErrorWindow(String title) {
        super(title);
        this.setBounds(200, 200, 300, 200);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea msg = new JTextArea("Error, operation not iplemented!");
        this.add(msg);
    }
}
