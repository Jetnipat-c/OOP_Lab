import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingCalculator extends JFrame implements ActionListener {
    JTextField res = new JTextField("");
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnDivide, btnMultiply,
            btnClear, btnEquals;

    public SwingCalculator() {
        super("SwingCalculator");

        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));
        GridBagConstraints gbc = new GridBagConstraints();

        res.setEditable(false);
        res.setHorizontalAlignment(SwingConstants.RIGHT);
        res.setPreferredSize(new Dimension(400, 30));
        add(res, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDivide = new JButton("/");
        btnMultiply = new JButton("*");
        btnClear = new JButton("C");
        btnEquals = new JButton("=");

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
        String command = ae.getActionCommand();
        if (command.charAt(0) == 'C') {
            res.setText("");
        } else if (command.charAt(0) == '=') {
            res.setText(evaluate(res.getText()));
            System.out.println(evaluate(res.getText()));
        } else {
            res.setText(res.getText() + command);
        }
    }

    public static String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        String operand1 = "";
        String operand2 = "";
        String operator = "";
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                if (operator.isEmpty()) {
                    operand1 += arr[i];
                } else {
                    operand2 += arr[i];
                }
            }

            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
                operator += arr[i];
            }
        }

        if (operator.equals("+"))
            result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        else if (operator.equals("-"))
            result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        else if (operator.equals("/"))
            result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        else
            result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
        return operand1 + operator + operand2 + "=" + result;
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}
