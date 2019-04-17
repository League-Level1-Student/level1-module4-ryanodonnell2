import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.SwingUtilities;


public class SlotMachine implements MouseListener, Runnable {

	JFrame frame;
	JPanel Message;
	JPanel Slots;
	JPanel Spin;
	JLabel label;
	JButton button;
	
	
	
	public static void main(String[] args) {
	SwingUtilities.invokeLater(new SlotMachine());	
	
	}
	 
	
	
	
	
	
	
	
	
	
	@Override
	public void run() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Message = new JPanel();
		label = new JLabel();
		label.setText("Click spin to start");
		Message.add(label);
		
		
		Spin = new JPanel();
		button = new JButton();
		button.addMouseListener(this);
		button.setText("Spin!");
		Spin.add(button);
		
		
		Slots = new JPanel();
		
		
		
		frame.add(Message, BorderLayout.NORTH);
		frame.add(Spin, BorderLayout.SOUTH);
		frame.add(Slots, BorderLayout.CENTER);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
			System.out.println("SPIN!");
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
	