package com.maven.calc2019.calculator2019;
import com.maven.calc2019.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Adv_Calculator {

	private JFrame frame;
	private JTextField textField1;
	private JButton btnEquals;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adv_Calculator window = new Adv_Calculator();
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
	public Adv_Calculator() {
		initialize();
		// Heikki 2019-06-02
		calc_operations();
	}
	//Heikki 2019-06-02
	
	double number, answer, number1, number2, firstNumber, secondNumber;
	int calculation;
	private JTextField textField2;
	
	private void calc_operations() {
		// TODO Auto-generated method stub

		switch(calculation) {
		
		case 1: // Addition
			 answer = number + Double.parseDouble(textField1.getText());
			
			// HEIKKI 2019-10-05
			//SimpleCalculator simpleCalculator = new SimpleCalculator();
			//answer = (simpleCalculator.addition(3.3, 4.5));
			
			textField1.setText(Double.toString(answer));
			break;
			
		case 2: // Subtraction
			answer = number - Double.parseDouble(textField1.getText());
			textField1.setText(Double.toString(answer));
			break;
			
		case 3: // Multiplication
			answer = number * Double.parseDouble(textField1.getText());
			textField1.setText(Double.toString(answer));
			break;
			
		case 4: // Division
			answer = number / Double.parseDouble(textField1.getText());
			textField1.setText(Double.toString(answer));
			break;
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 960, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Dialog", Font.PLAIN, 30));
		textField1.setBounds(12, 12, 926, 58);
		textField1.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Heikki 2019-06-02
				
				calc_operations();
			}
		});
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 30));
		btnEquals.setActionCommand("Equals");
		btnEquals.setForeground(Color.GRAY);
		btnEquals.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEquals.setBounds(664, 471, 113, 58);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Heikki 2019-06-02
				number = Double.parseDouble(textField1.getText());
				calculation = 1;
				textField1.setText("");
				//textField2.setText(number + "+");
				
				
				
			}
		});
		btnPlus.setForeground(Color.GRAY);
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 30));
		btnPlus.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnPlus.setActionCommand("Equals");
		btnPlus.setBounds(810, 471, 113, 58);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Heikki 2019-10-05
				number = Double.parseDouble(textField1.getText());
				calculation = 2;
				textField1.setText("");
				//textField2.setText(number + "+");
				
				
				
			}
		});
		btnMinus.setForeground(Color.GRAY);
		btnMinus.setForeground(Color.GRAY);
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 30));
		btnMinus.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnMinus.setActionCommand("Equals");
		btnMinus.setBounds(810, 400, 113, 58);
		frame.getContentPane().add(btnMinus);
		
		JButton btnSub = new JButton("x");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Heikki 2019-10-05
				number = Double.parseDouble(textField1.getText());
				calculation = 3;
				textField1.setText("");
				//textField2.setText(number + "+");
				
				
				
			}
		});
		btnSub.setForeground(Color.GRAY);
		btnSub.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSub.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSub.setActionCommand("Equals");
		btnSub.setBounds(810, 330, 113, 58);
		frame.getContentPane().add(btnSub);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Heikki 2019-10-05
				number = Double.parseDouble(textField1.getText());
				calculation = 4;
				textField1.setText("");
				//textField2.setText(number + "+");
				
				
				
			}
		});
		btnDiv.setForeground(Color.GRAY);
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 30));
		btnDiv.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnDiv.setActionCommand("Equals");
		btnDiv.setBounds(810, 256, 113, 58);
		frame.getContentPane().add(btnDiv);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-06-02 */
				
				textField1.setText("");
			}
		});
		btnClear.setForeground(Color.GRAY);
		btnClear.setFont(new Font("Dialog", Font.BOLD, 30));
		btnClear.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnClear.setActionCommand("Equals");
		btnClear.setBounds(810, 181, 113, 58);
		frame.getContentPane().add(btnClear);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "3");
			}
		});
		btnThree.setForeground(Color.GRAY);
		btnThree.setFont(new Font("Dialog", Font.BOLD, 30));
		btnThree.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnThree.setActionCommand("Equals");
		btnThree.setBounds(664, 400, 113, 58);
		frame.getContentPane().add(btnThree);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "6");
			}
		});
		btnSix.setForeground(Color.GRAY);
		btnSix.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSix.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSix.setActionCommand("Equals");
		btnSix.setBounds(664, 330, 113, 58);
		frame.getContentPane().add(btnSix);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "9");
			}
		});
		btnNine.setForeground(Color.GRAY);
		btnNine.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNine.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNine.setActionCommand("Equals");
		btnNine.setBounds(664, 256, 113, 58);
		frame.getContentPane().add(btnNine);
		
		JButton btnComma = new JButton(".");
		btnComma.setForeground(Color.GRAY);
		btnComma.setFont(new Font("Dialog", Font.BOLD, 30));
		btnComma.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnComma.setActionCommand("Equals");
		btnComma.setBounds(522, 471, 113, 58);
		frame.getContentPane().add(btnComma);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-06-02 */
				
				textField1.setText(textField1.getText() + "2");
			}
		});
		btnTwo.setForeground(Color.GRAY);
		btnTwo.setFont(new Font("Dialog", Font.BOLD, 30));
		btnTwo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnTwo.setActionCommand("Equals");
		btnTwo.setBounds(522, 400, 113, 58);
		frame.getContentPane().add(btnTwo);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "5");
			}
		});
		btnFive.setForeground(Color.GRAY);
		btnFive.setFont(new Font("Dialog", Font.BOLD, 30));
		btnFive.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFive.setActionCommand("Equals");
		btnFive.setBounds(522, 330, 113, 58);
		frame.getContentPane().add(btnFive);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "8");
			}
		});
		btnEight.setForeground(Color.GRAY);
		btnEight.setFont(new Font("Dialog", Font.BOLD, 30));
		btnEight.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEight.setActionCommand("Equals");
		btnEight.setBounds(522, 256, 113, 58);
		frame.getContentPane().add(btnEight);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "0");
			}
		});
		btnZero.setForeground(Color.GRAY);
		btnZero.setFont(new Font("Dialog", Font.BOLD, 30));
		btnZero.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnZero.setActionCommand("Equals");
		btnZero.setBounds(385, 471, 113, 58);
		frame.getContentPane().add(btnZero);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki testar
				 * 
				 */
				/* Heikki 2019-06-02 */
				
				textField1.setText(textField1.getText() + "1");
			}
		});
		btnOne.setForeground(Color.GRAY);
		btnOne.setFont(new Font("Dialog", Font.BOLD, 30));
		btnOne.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnOne.setActionCommand("Equals");
		btnOne.setBounds(385, 400, 113, 58);
		frame.getContentPane().add(btnOne);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "4");
			}
		});
		btnFour.setForeground(Color.GRAY);
		btnFour.setFont(new Font("Dialog", Font.BOLD, 30));
		btnFour.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnFour.setActionCommand("Equals");
		btnFour.setBounds(385, 330, 113, 58);
		frame.getContentPane().add(btnFour);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Heikki 2019-10-05 */
				
				textField1.setText(textField1.getText() + "7");
			}
		});
		btnSeven.setForeground(Color.GRAY);
		btnSeven.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSeven.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSeven.setActionCommand("Equals");
		btnSeven.setBounds(385, 256, 113, 58);
		frame.getContentPane().add(btnSeven);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setForeground(Color.GRAY);
		btnTan.setFont(new Font("Dialog", Font.BOLD, 30));
		btnTan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnTan.setActionCommand("Equals");
		btnTan.setBounds(24, 471, 113, 58);
		frame.getContentPane().add(btnTan);
		
		JButton btnProcent = new JButton("%");
		btnProcent.setForeground(Color.GRAY);
		btnProcent.setFont(new Font("Dialog", Font.BOLD, 30));
		btnProcent.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnProcent.setActionCommand("Equals");
		btnProcent.setBounds(160, 471, 113, 58);
		frame.getContentPane().add(btnProcent);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setForeground(Color.GRAY);
		btnCos.setFont(new Font("Dialog", Font.BOLD, 30));
		btnCos.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnCos.setActionCommand("Equals");
		btnCos.setBounds(24, 400, 113, 58);
		frame.getContentPane().add(btnCos);
		
		JButton btnX = new JButton("X2");
		btnX.setForeground(Color.GRAY);
		btnX.setFont(new Font("Dialog", Font.BOLD, 30));
		btnX.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnX.setActionCommand("Equals");
		btnX.setBounds(160, 400, 113, 58);
		frame.getContentPane().add(btnX);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setForeground(Color.GRAY);
		btnSin.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSin.setActionCommand("Equals");
		btnSin.setBounds(24, 330, 113, 58);
		frame.getContentPane().add(btnSin);
		
		JButton btnSqr = new JButton("Sqr");
		btnSqr.setForeground(Color.GRAY);
		btnSqr.setFont(new Font("Dialog", Font.BOLD, 30));
		btnSqr.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSqr.setActionCommand("Equals");
		btnSqr.setBounds(160, 330, 113, 58);
		frame.getContentPane().add(btnSqr);
		
		JLabel lblCalculation = new JLabel("");
		lblCalculation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalculation.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCalculation.setBounds(544, 81, 394, 26);
		frame.getContentPane().add(lblCalculation);
		
		textField2 = new JTextField();
		textField2.setBounds(725, 88, 114, 19);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
	
		
	}
}
