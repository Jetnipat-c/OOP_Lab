import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorSci implements KeyListener {

	private JFrame frame;
	private JTextField textField;
	private JButton btnCos, btnSin, btnTan, btnLog, btnLn, btnXpow2, btnXpowy, btnEpowx, btn1divx, btnSqrt, btn7, btn8,
    btn9, btnBackspace, btnClear, btn4, btn5, btn6, btnMul, btnDivide, btn1, btn2, btn3, btnPlus, btnSub, btn0,
    btnDot, btnPi, btnE, btnEqual;
	
	double first,second,result;
	String operation,answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorSci window = new CalculatorSci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorSci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Swing Calculator");
		frame.setBounds(100, 100, 479, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setEnabled(false);
		textField.setBounds(0, 0, 471, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.addKeyListener((KeyListener) this);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(0, 40, 95, 43);
		frame.getContentPane().add(btnSin);
		
		btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.addKeyListener((KeyListener) this);
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCos.setBounds(94, 40, 95, 43);
		frame.getContentPane().add(btnCos);
		
		btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.addKeyListener((KeyListener) this);
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan.setBounds(188, 40, 95, 43);
		frame.getContentPane().add(btnTan);
		
		btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.addKeyListener((KeyListener) this);
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLog.setBounds(282, 40, 95, 43);
		frame.getContentPane().add(btnLog);
		
		btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.log(Double.parseDouble(textField.getText())*2.7182817284);
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLn.addKeyListener((KeyListener) this);
		btnLn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLn.setBounds(376, 40, 95, 43);
		frame.getContentPane().add(btnLn);
		
		btnXpow2 = new JButton("x^2");
		btnXpow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a*a);
			}
		});
		btnXpow2.addKeyListener((KeyListener) this);
		btnXpow2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXpow2.setBounds(0, 83, 95, 43);
		frame.getContentPane().add(btnXpow2);
		
		btnXpowy = new JButton("x^y");
		btnXpowy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXpowy.addKeyListener((KeyListener) this);
		btnXpowy.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXpowy.setBounds(94, 83, 95, 43);
		frame.getContentPane().add(btnXpowy);
		
		btnEpowx = new JButton("e^x");
		btnEpowx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEpowx.addKeyListener((KeyListener) this);
		btnEpowx.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEpowx.setBounds(188, 83, 95, 43);
		frame.getContentPane().add(btnEpowx);
		
		btn1divx = new JButton("1/x");
		btn1divx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1divx.addKeyListener((KeyListener) this);
		btn1divx.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1divx.setBounds(282, 83, 95, 43);
		frame.getContentPane().add(btn1divx);
		
		btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double  a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSqrt.addKeyListener((KeyListener) this);
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSqrt.setBounds(376, 83, 95, 43);
		frame.getContentPane().add(btnSqrt);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.addKeyListener((KeyListener) this);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(0, 126, 95, 43);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.addKeyListener((KeyListener) this);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(94, 126, 95, 43);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.addKeyListener((KeyListener) this);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(188, 126, 95, 43);
		frame.getContentPane().add(btn9);
		
		btnBackspace = new JButton("DEL");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length() > 0) 
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnBackspace.addKeyListener((KeyListener) this);
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBackspace.setBounds(282, 126, 95, 43);
		frame.getContentPane().add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.addKeyListener((KeyListener) this);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(376, 126, 95, 43);
		frame.getContentPane().add(btnClear);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.addKeyListener((KeyListener) this);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(0, 169, 95, 43);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.addKeyListener((KeyListener) this);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(94, 169, 95, 43);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.addKeyListener((KeyListener) this);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(188, 169, 95, 43);
		frame.getContentPane().add(btn6);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.addKeyListener((KeyListener) this);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBounds(282, 169, 95, 43);
		frame.getContentPane().add(btnMul);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.addKeyListener((KeyListener) this);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDivide.setBounds(376, 169, 95, 43);
		frame.getContentPane().add(btnDivide);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.addKeyListener((KeyListener) this);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(0, 212, 95, 43);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.addKeyListener((KeyListener) this);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(94, 212, 95, 43);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.addKeyListener((KeyListener) this);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(188, 212, 95, 43);
		frame.getContentPane().add(btn3);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.addKeyListener((KeyListener) this);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.setBounds(282, 212, 95, 43);
		frame.getContentPane().add(btnPlus);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.addKeyListener((KeyListener) this);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSub.setBounds(376, 212, 95, 43);
		frame.getContentPane().add(btnSub);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.addKeyListener((KeyListener) this);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(0, 255, 95, 43);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDot.setBounds(94, 255, 95, 43);
		frame.getContentPane().add(btnDot);
		
		btnPi = new JButton("\u03c0");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Math.PI;
				textField.setText(number);
			}
		});
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPi.setBounds(188, 255, 95, 43);
		frame.getContentPane().add(btnPi);
		
		btnE = new JButton("e");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+2.7182817284;
				textField.setText(number);
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnE.setBounds(282, 255, 95, 43);
		frame.getContentPane().add(btnE);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first+second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y")
				{
					double resultt = 1;
					for(int i=0 ; i< second ; i++)
					{
						resultt = first*resultt;
					}
					
					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.addKeyListener((KeyListener) this);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEqual.setBounds(376, 255, 95, 43);
		frame.getContentPane().add(btnEqual);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent e) {  
		if(e.getKeyCode() == KeyEvent.VK_NUMPAD0 || e.getKeyCode() == KeyEvent.VK_0 )
    	{
			String number=textField.getText()+btn0.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD1 || e.getKeyCode() == KeyEvent.VK_1 )
    	{
			String number=textField.getText()+btn1.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD2 || e.getKeyCode() == KeyEvent.VK_2 )
    	{
			String number=textField.getText()+btn2.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3 || e.getKeyCode() == KeyEvent.VK_3 )
    	{
			String number=textField.getText()+btn3.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD4 || e.getKeyCode() == KeyEvent.VK_4 )
    	{
			String number=textField.getText()+btn4.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5 || e.getKeyCode() == KeyEvent.VK_5 )
    	{
			String number=textField.getText()+btn5.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD6 || e.getKeyCode() == KeyEvent.VK_6 )
    	{
			String number=textField.getText()+btn6.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD7 || e.getKeyCode() == KeyEvent.VK_7 )
    	{
			String number=textField.getText()+btn7.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD8 || e.getKeyCode() == KeyEvent.VK_8 )
    	{
			String number=textField.getText()+btn8.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD9 || e.getKeyCode() == KeyEvent.VK_9 )
    	{
			String number=textField.getText()+btn9.getText();
			textField.setText(number);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_ADD)
    	{
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation="+";
		}
		else if(e.getKeyCode() == KeyEvent.VK_SUBTRACT)
    	{
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation="-";
		}
		else if(e.getKeyCode() == KeyEvent.VK_MULTIPLY)
    	{
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation="*";
		}
		else if(e.getKeyCode() == KeyEvent.VK_DIVIDE)
    	{
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation="/";
		}
		
		else if((e.getKeyCode() == KeyEvent.VK_S) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			  double  a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
		}
		else if((e.getKeyCode() == KeyEvent.VK_C) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			  double  a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
		}
		else if((e.getKeyCode() == KeyEvent.VK_C) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			  double  a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
		}
		else if((e.getKeyCode() == KeyEvent.VK_T) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			  double  a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
		}
		else if((e.getKeyCode() == KeyEvent.VK_G) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			  double  a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
		}
		else if((e.getKeyCode() == KeyEvent.VK_N) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			double  a = Math.log(Double.parseDouble(textField.getText())*2.7182817284);
			textField.setText("");
			textField.setText(textField.getText()+a);
		}
		else if(e.getKeyCode() == KeyEvent.VK_F1)
    	{
			double  a = (Double.parseDouble(textField.getText()));
			textField.setText("");
			textField.setText(textField.getText()+a*a);
		}
		else if(e.getKeyCode() == KeyEvent.VK_F2)
    	{
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation="X^Y";
		}
		else if(e.getKeyCode() == KeyEvent.VK_F3)
    	{
			double  a = Math.exp(Double.parseDouble(textField.getText()));
			textField.setText("");
			textField.setText(textField.getText()+a);
		}
		else if(e.getKeyCode() == KeyEvent.VK_F4)
    	{
			double  a = 1/(Double.parseDouble(textField.getText()));
			textField.setText("");
			textField.setText(textField.getText()+a);
		}
		else if(e.getKeyCode() == KeyEvent.VK_F5)
    	{
			double  a = Math.sqrt(Double.parseDouble(textField.getText()));
			textField.setText("");
			textField.setText(textField.getText()+a);
		}
		else if(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE)
    	{
			String backSpace = null;
			
			if(textField.getText().length() > 0) 
			{
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace = str.toString();
				textField.setText(backSpace);
				
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_C)
    	{
			textField.setText(null);
		}
		else if((e.getKeyCode() == KeyEvent.VK_P) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			String number=textField.getText()+Math.PI;
			textField.setText(number);
		}
		else if((e.getKeyCode() == KeyEvent.VK_E) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0))
    	{
			String number=textField.getText()+2.7182817284;
			textField.setText(number);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DECIMAL)
    	{
			String number=textField.getText()+btnDot.getText();
			textField.setText(number);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_ENTER)
    	{
			second = Double.parseDouble(textField.getText());
			if(operation == "+")
			{
				result = first+second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "-")
			{
				result = first-second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "*")
			{
				result = first*second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "/")
			{
				result = first/second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "X^Y")
			{
				double resultt = 1;
				for(int i=0 ; i< second ; i++)
				{
					resultt = first*resultt;
				}
				
				answer = String.format("%.2f", resultt);
				textField.setText(answer);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
