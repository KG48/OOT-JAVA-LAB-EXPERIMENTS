import javax.swing.*;
import java.awt.event.*;

public class MouseListener {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator (MouseListener Example)");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        // Set component positions
        t1.setBounds(50, 40, 100, 30);
        t2.setBounds(160, 40, 100, 30);
        t3.setBounds(105, 80, 100, 30);
        add.setBounds(50, 120, 50, 30);
        sub.setBounds(110, 120, 50, 30);
        mul.setBounds(170, 120, 50, 30);
        div.setBounds(230, 120, 50, 30);

        f.add(t1); f.add(t2); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        // MouseListener logic
        MouseAdapter mouseHandler = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int result = 0;

                    Object src = e.getSource();
                    if (src == add) result = a + b;
                    else if (src == sub) result = a - b;
                    else if (src == mul) result = a * b;
                    else if (src == div) result = a / b;

                    t3.setText("Result: " + result);
                } catch (Exception ex) {
                    t3.setText("Invalid input!");
                }
            }

            public void mouseEntered(MouseEvent e) {
                JButton btn = (JButton)e.getSource();
                t3.setText("Mouse entered: " + btn.getText());
            }

            public void mouseExited(MouseEvent e) {
                JButton btn = (JButton)e.getSource();
                t3.setText("Mouse exited: " + btn.getText());
            }
        };

        add.addMouseListener(mouseHandler);
        sub.addMouseListener(mouseHandler);
        mul.addMouseListener(mouseHandler);
        div.addMouseListener(mouseHandler);

        f.setSize(350, 230);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}