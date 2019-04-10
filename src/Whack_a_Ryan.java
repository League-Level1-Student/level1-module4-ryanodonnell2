import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class Whack_a_Ryan implements MouseListener{
	
	JFrame frame;
	JPanel Top;
	Random r = null;
	int Score = 0;
	int z;
	Whack_a_Ryan Ryan;	
	void setup() {
		r = new Random();
		
		Top = new JPanel();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(275,300);
		
		
		frame.add(Top);
		drawButtons();
	}
	void drawButtons() {
		z = r.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton y = new JButton();
			if(z == i) {
				y.setText("Ryan!");
			}
			y.setPreferredSize(new Dimension(75,25));
			y.addMouseListener(this);
			Top.add(y);
			
			
		}
		Top.revalidate();
	}
	
	public static void main(String[] args) {
		new Whack_a_Ryan().setup();
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		

		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Ryan!")) {
			Top.removeAll();
			drawButtons();
			Score = Score + 1;
		}
		else {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "Game Over! Your score was " + Score + "!");
			System.exit(0);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
