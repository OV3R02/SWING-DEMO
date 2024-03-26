package exercise1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.function.ToDoubleBiFunction;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {
    JTextField op1;
    JTextField op2;
    JButton add, sub, sum, mul, div, eq;
    JLabel result;

    public MainWindow(String title) {
        super(title);
        this.setBounds(200, 200, 500, 300);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBackground(new Color(00255));

        // Creo istanze oggetti
        op1 = new JTextField(10);
        op2 = new JTextField(10);
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        result = new JLabel();
        this.add(op1);
        this.add(op2);
        this.add(add);
        this.add(sub);
        this.add(mul);
        this.add(div);
        this.add(result);

        // Ascoltatori
        add.addActionListener(v -> this.calculate((a,b) -> a+b));
        sub.addActionListener(v -> this.calculate((a,b) -> a-b));
        mul.addActionListener(v -> this.calculate((a,b) -> a*b));
        div.addActionListener(v -> this.calculate((a,b) -> (double)a/(double)b));

    }

    private void calculate(ToDoubleBiFunction<Integer,Integer> func){
        try {
            int num1 = Integer.parseInt(op1.getText());
            int num2 = Integer.parseInt(op2.getText());
            double res = func.applyAsDouble(num1, num2);
            result.setText("Result: " + res);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Not valid numbers.");
            op1.setText("");
            op2.setText("");
        }
    }

}
