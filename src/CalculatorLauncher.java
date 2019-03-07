import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
public class CalculatorLauncher implements ActionListener{
	
	JButton add;
	JButton sub;
	JButton multi;
	JButton divide;
	JTextField TF1;
	JTextField TF2;
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
		frame.add(Answer, BorderLayout.SOUTH);
		JPanel TFS = new JPanel();
		frame.add(TFS, BorderLayout.NORTH);
		JPanel Buttons = new JPanel();
		frame.add(Buttons);
		add = new JButton();
		sub = new JButton();
		multi = new JButton();
		divide = new JButton();
		Buttons.add(add);
		Buttons.add(sub);
		Buttons.add(multi);
		Buttons.add(divide);
		JLabel label = new JLabel();
		Answer.add(label);
		JTextField TF1 = new JTextField();
		TFS.add(TF1);
		JTextField TF2 = new JTextField();
		TFS.add(TF2);
		add.addActionListener(this);
		sub.addActionListener(this);
		multi.addActionListener(this);
		divide.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String Sx = TF1.getText();
		String Sy = TF2.getText();
		int y = Integer.parseInt(Sy);
		int x = Integer.parseInt(Sx);
		if(e.getSource().equals(add)) {
			calc.add(x, y);
		}
		else if(e.getSource().equals(sub)) {
			calc.sub(x, y);
		}
		else if(e.getSource().equals(multi)) {
			calc.multi(x, y);
		}
		else if(e.getSource().equals(divide)) {
			calc.divide(x, y);
		}
	}
}
