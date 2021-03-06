package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Calculator {

	public JFrame frame;
	public JTextField textField;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setBounds(100, 100, 262, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    textField = new JTextField();
		textField.setBounds(10, 11, 226, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
										
						
			}
			
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btnCancel = new JButton("C");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btnCancel);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(122, 54, 57, 50);
		frame.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(186, 54, 50, 50);
		frame.getContentPane().add(btnPlus);
		

		//-----------------------ROW 1--------------------------------------------
		
				new JButton("<");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					
						
					}
				
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn7.setBounds(10, 110, 50, 50);
				frame.getContentPane().add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn8.setBounds(66, 110, 50, 50);
				frame.getContentPane().add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn9.setBounds(122, 110, 57, 50);
				frame.getContentPane().add(btn9);
				
				JButton btnSub = new JButton("-");
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(186, 110, 50, 50);
				frame.getContentPane().add(btnSub);
				
//-----------------------ROW 3--------------------------------------------
				
				JButton btn4 = new JButton("4");
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 166, 50, 50);
				frame.getContentPane().add(btn4);
				
			
				
				JButton btn5 = new JButton("5");
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(66, 166, 50, 50);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(122, 166, 57, 50);
				frame.getContentPane().add(btn6);
				
				JButton btnMult = new JButton("*");
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(186, 166, 50, 50);
				frame.getContentPane().add(btnMult);
				
				JButton btn2 = new JButton("2");
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(66, 222, 50, 50);
				frame.getContentPane().add(btn2);
				String btnSlash = "/"; 
				
				JButton btnSlash1 = new JButton("/");
				btnSlash1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSlash1.setBounds(186, 222, 50, 50);
				frame.getContentPane().add(btnSlash1);
				
				JButton btnNewButton = new JButton("New button");
				btnNewButton.setBounds(278, 284, 200, 50);
				frame.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("New button");
				btnNewButton_1.setBounds(-58, 278, 50, 50);
				frame.getContentPane().add(btnNewButton_1);
				
				JButton btn0 = new JButton("0");
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btn0.setBounds(10, 278, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnNewButton_3 = new JButton("New button");
				btnNewButton_3.setBounds(10, 278, 50, 50);
				frame.getContentPane().add(btnNewButton_3);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(66, 278, 50, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(122, 278, 57, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(186, 278, 50, 50);
				frame.getContentPane().add(btnEqual);
				
				JButton btnNewButton_2 = new JButton("New button");
				btnNewButton_2.setBounds(-58, 58, 50, 50);
				frame.getContentPane().add(btnNewButton_2);
				
				JButton btnBack = new JButton("<");
				btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnBack.setBounds(10, 54, 50, 50);
				frame.getContentPane().add(btnBack);
				
				JButton btn1 = new JButton("1");
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 222, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn3 = new JButton("3");
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(122, 222, 57, 50);
				frame.getContentPane().add(btn3);
				
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
