import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class Whack_a_Ryan {
	
	JFrame frame;
	JPanel Top;
	JPanel MTop;
	JPanel Middle;
	JPanel MBottom;
	JPanel Bottom;
	JPanel Topp;
	JPanel bottomp;
	JPanel centerp;
	
	void setup() {
		frame = new JFrame();
		frame.setVisible(true);
		Top = new JPanel();
		MTop = new JPanel();
		Middle = new JPanel();
		MBottom = new JPanel();
		Bottom = new JPanel();
		Topp = new JPanel();
		bottomp = new JPanel();
		centerp = new JPanel();
		
		for (int i = 0; i < 25; i++) {
			int x = i/3;
			JButton y = new JButton();
			y.setPreferredSize(new Dimension(75,75));
			switch(x) {
			case 0:
				Top.add(y);
				break;
			case 1:
				MTop.add(y);
				break;
			case 2:
				Middle.add(y);
				break;
			case 3:
				MBottom.add(y);
				break;
			case 4:
				Bottom.add(y);
				break;
			}
			
		}
		Topp.add(Top, BorderLayout.NORTH);
		Topp.add(MTop, BorderLayout.SOUTH);
		centerp.add(Middle, BorderLayout.NORTH);
		centerp.add(MBottom, BorderLayout.SOUTH);
		bottomp.add(Bottom);
		frame.add(bottomp, BorderLayout.SOUTH);
		frame.add(Topp, BorderLayout.NORTH);
		frame.add(centerp, BorderLayout.CENTER);
		frame.pack();
	}
	public static void main(String[] args) {
		new Whack_a_Ryan().setup();
	}
	
}
