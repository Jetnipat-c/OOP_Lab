import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

class TemperatureConverter extends JFrame {

    public double celsius, fahrenheit;

    public TemperatureConverter() {
        super("Swing TemperatureConverter");

        JTextField txtCelsius = new JTextField("");
        JTextField txtFahrenheit = new JTextField("");

        Container c = getContentPane();
        setLayout(new FlowLayout());

        JLabel lbCelsius = new JLabel("Celsius:");
        c.add(lbCelsius);

        txtCelsius.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(txtCelsius.getText());
                celsius = ((celsius * 1.80) + 32);
                String text = String.format("%.2f", celsius);
                txtFahrenheit.setText(text);
            }
        });
        txtCelsius.setPreferredSize(new Dimension(100, 20));
        c.add(txtCelsius);

        JLabel lbFahrenheit = new JLabel("Fahrenheit:");
        c.add(lbFahrenheit);

        txtFahrenheit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
                fahrenheit = ((fahrenheit - 32) / 1.80);
                String text = String.format("%.2f", fahrenheit);
                txtCelsius.setText(text);
            }
        });
        txtFahrenheit.setPreferredSize(new Dimension(100, 20));
        c.add(txtFahrenheit);

        c.setLayout(new GridLayout(2, 2));

        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new TemperatureConverter();
    }
}