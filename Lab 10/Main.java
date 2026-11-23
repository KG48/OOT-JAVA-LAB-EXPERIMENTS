import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator (ActionListener)");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        // Set component positions
        t1.setBounds(50, 40, 100, 30);
        t2.setBounds(160, 40, 100, 30);
        add.setBounds(50, 100, 50, 30);
        sub.setBounds(110, 100, 50, 30);
        mul.setBounds(170, 100, 50, 30);
        div.setBounds(230, 100, 50, 30);

        f.add(t1); f.add(t2);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        // ---- Event Handling using ActionListener with Popups ----
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int result = 0;
                    String operation = "";

                    if (e.getSource() == add) {
                        result = a + b;
                        operation = "Addition";
                    } else if (e.getSource() == sub) {
                        result = a - b;
                        operation = "Subtraction";
                    } else if (e.getSource() == mul) {
                        result = a * b;
                        operation = "Multiplication";
                    } else if (e.getSource() == div) {
                        result = a / b;
                        operation = "Division";
                    }

                    JOptionPane.showMessageDialog(f,
                            operation + " Result = " + result,
                            "Result",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(f,
                            "Error: Division by zero!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f,
                            "Please enter valid numbers!",
                            "Invalid Input",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        };

        // Add ActionListener to all buttons
        add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);

        // Frame setup
        f.setSize(350, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}