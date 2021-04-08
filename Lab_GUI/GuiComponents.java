import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiComponents extends JFrame {

    public GuiComponents() {
        super("GuiComponents");

        Container c = getContentPane();
        setLayout(new BorderLayout());
        
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton btn = new JButton("Button");
        c.add(btn);

        JCheckBox ck1 = new JCheckBox("Label");
        c.add(ck1);

        JButton lb = new JButton();
        lb.setBackground(Color.RED);
        lb.setPreferredSize(new Dimension(10, 10));
        c.add(lb);

        JTextField txt = new JTextField("Text Field");
        c.add(txt);

        JTextArea txtarea = new JTextArea("Text Area");
        txtarea.setPreferredSize(new Dimension(130, 100));
        c.add(txtarea);

        Container c2 = getContentPane();
        c2.setLayout(new FlowLayout(FlowLayout.CENTER));

        DefaultListModel list_model = new DefaultListModel();
        list_model.addElement("item 1");
        list_model.addElement("item 2");
        list_model.addElement("item 3");
        list_model.addElement("item 4");
        list_model.addElement("item 5");
        list_model.addElement("item 6");
        list_model.addElement("item 7");
        list_model.addElement("item 8");
        list_model.addElement("item 9");
        list_model.addElement("item 10");
        list_model.addElement("item 11");
        list_model.addElement("item 12");
        list_model.addElement("item 13");
        JList list = new JList(list_model);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setLocation(10, 10);
        listScroll.setSize(120, 180);
        c2.add(listScroll);

        String[] petStrings = { "Yes", "No" };
        JComboBox petList = new JComboBox(petStrings);
        petList.setSelectedIndex(0);
        c2.add(petList);

        JRadioButton jRadioButton1 = new JRadioButton();
        JRadioButton jRadioButton2 = new JRadioButton();
        JRadioButton jRadioButton3 = new JRadioButton();
        ButtonGroup group = new ButtonGroup();

        jRadioButton1.setText("often");
        jRadioButton2.setText("sometimes");
        jRadioButton3.setText("never");

        jRadioButton1.setBounds(120, 30, 120, 50);
        jRadioButton2.setBounds(250, 30, 80, 50);
        jRadioButton3.setBounds(120, 30, 120, 50);

        c2.add(jRadioButton1);
        c2.add(jRadioButton2);
        c2.add(jRadioButton3);

        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GuiComponents();
    }
}
