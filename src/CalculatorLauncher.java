import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.*;
public class CalculatorLauncher implements ActionListener{
	
	JButton add;
	JButton sub;
	JButton multi;
	JButton divide;
	JTextField TF1;
	JTextField TF2;
	String Sx;
	String Sy;
	JLabel label;
	double a;
	Calculator calc = new Calculator();
	public static void main(String[] args) {
		CalculatorLauncher cal = new CalculatorLauncher();
		cal.setup();
	}
	void setup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel Answer = new JPanel();
		JPanel TFS = new JPanel();
		JPanel Buttons = new JPanel();
		frame.add(Buttons, BorderLayout.CENTER);
		frame.add(Answer, BorderLayout.SOUTH);
		frame.add(TFS, BorderLayout.NORTH);

		
		add = new JButton();
		sub = new JButton();
		multi = new JButton();
		divide = new JButton();
		
		add.setText("Add");
		sub.setText("Subtraction");
		multi.setText("Multiply");
		divide.setText("Divide");
		
		Buttons.add(add);
		Buttons.add(sub);
		Buttons.add(multi);
		Buttons.add(divide);
		
		label = new JLabel();
		Answer.add(label);
		label.setText("   ");
		TF1 = new JTextField("", 20);
		TF1.setVisible(true);

		TFS.add(TF1);
		TF2 = new JTextField("", 20);
		TF2.setVisible(true);
		TFS.add(TF2);
		
		TF1.setText("");
		TF2.setText("");
				
		add.addActionListener(this);
		sub.addActionListener(this);
		multi.addActionListener(this);
		divide.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double y = 0;
		double x = 0;
		Sx = TF1.getText();
		Sy = TF2.getText();
		y = Integer.parseInt(Sy);
		x = Integer.parseInt(Sx);
		if(e.getSource() == add) {
			a = calc.add(x, y);
			String Sa = Double.toString(a);
			label.setText(Sa);
		}
		else if(e.getSource().equals(sub)) {
			a = calc.sub(x, y);
			String Sa = Double.toString(a);
			label.setText(Sa);
		}
		else if(e.getSource().equals(multi)) {
			a = calc.multi(x, y);
			String Sa = Double.toString(a);
			label.setText(Sa);
		}
		else if(e.getSource().equals(divide)) {
			if(y != 0) {
				a = calc.divide(x, y);
				String Sa = Double.toString(a);
				label.setText(Sa);
			}
			else {
				 label.setText("Undefind");
			}
			
		}
		
	}
}
