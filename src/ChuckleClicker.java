import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;



public class ChuckleClicker implements MouseListener {

	
	JButton Joke;
	JButton punchline;
	
	
	public static void main(String[] args) {
		System.out.println("1");
		new ChuckleClicker().makeButtons();
	}
	
	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		Joke = new JButton();
		Joke.setText("joke");
		Joke.addMouseListener(this);
		panel.add(Joke);
		punchline = new JButton();
		punchline.setText("punchline");
		punchline.addMouseListener(this);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
		System.out.println("1");
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("2");
		// TODO Auto-generated method stub
		if(e.getSource() == Joke) {
			JOptionPane.showMessageDialog(null, "What to here a joke?");
		}
		else if(e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "Your life! Ha  ha  ha ha!");
		}
		}
	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
