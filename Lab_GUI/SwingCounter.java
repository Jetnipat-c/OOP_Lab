import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingCounter extends JFrame {
    private int count;

    public SwingCounter() {
        super("Swing Counter");

        count = 0;

        Container c = getContentPane();
        setLayout(new FlowLayout());

        JLabel lbConter = new JLabel("Counter");
        c.add(lbConter);

        JTextField txtCounter = new JTextField("0");
        txtCounter.setEditable(false);
        txtCounter.setPreferredSize(new Dimension(100, 20));

        c.add(txtCounter);

        JButton btnCount = new JButton("Count");
        btnCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                txtCounter.setText(Integer.toString(count));
            }
        });
        c.add(btnCount);

        setSize(400, 80);
        // pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SwingCounter();
    }
}