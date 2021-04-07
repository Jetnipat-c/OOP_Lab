import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingCalculator extends JFrame implements ActionListener {

    public SwingCalculator() {
        super("SwingCalculator");

        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));
        GridBagConstraints gbc = new GridBagConstraints();

        JTextField res = new JTextField("0");
        res.setEditable(false);
        res.setHorizontalAlignment(SwingConstants.RIGHT);
        res.setPreferredSize(new Dimension(400, 30));
        add(res, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);

        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnDivide = new JButton("/");
        JButton btnMultiply = new JButton("x");
        JButton btnClear = new JButton("C");
        JButton btnEquals = new JButton("=");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);

        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnClear.addActionListener(this);
        btnEquals.addActionListener(this);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        // 7 8 9 +
        gbc.gridx = 0;
        gbc.gridy = 0;
        p.add(btn7, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        p.add(btn8, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        p.add(btn9, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        p.add(btnPlus, gbc);

        // 4 5 6 -

        gbc.gridx = 0;
        gbc.gridy = 1;
        p.add(btn4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        p.add(btn5, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        p.add(btn6, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        p.add(btnMinus, gbc);

        // 1 2 3 *
        gbc.gridx = 0;
        gbc.gridy = 2;
        p.add(btn1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        p.add(btn2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        p.add(btn3, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        p.add(btnMultiply, gbc);

        // C 0 = /
        gbc.gridx = 0;
        gbc.gridy = 3;
        p.add(btnClear, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        p.add(btn0, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        p.add(btnEquals, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        p.add(btnDivide, gbc);

        setVisible(true);
        setSize(400, 400);
    }

    public void actionPerformed(ActionEvent ae) {
        JButton pb = (JButton) ae.getSource();

    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}
