import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class SlotMachine implements MouseListener, Runnable {

	JFrame frame;
	JPanel Message;
	JPanel Slots;
	JPanel Spin;
	JLabel Toplabel;

	JButton spinButton;

	String Seven = "Seven-v2.png";
	String Cherry = "Cherry.png";
	String Clover = "Clover.png";

	int reel1;
	int reel2;
	int reel3;

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
		Toplabel = new JLabel();
		Toplabel.setText("Click spin to start");
		Message.add(Toplabel);

		Spin = new JPanel();
		spinButton = new JButton();
		spinButton.addMouseListener(this);
		spinButton.setText("Spin!");
		Spin.add(spinButton);

		Slots = new JPanel();

		frame.add(Message, BorderLayout.NORTH);
		frame.add(Spin, BorderLayout.SOUTH);
		frame.add(Slots, BorderLayout.CENTER);
	}

	private void SpinReels(){
		Slots.removeAll();
		reel1 = spinReel();
		reel2 = spinReel();
		reel3 = spinReel();
		//check for win
		Message.removeAll();
		if(reel1 == 0 && reel1 == reel2 && reel2 == reel3) {
		Toplabel.setText("yOu WiN $50!");
		Message.add(Toplabel);
		}
		else if(reel1 == 0 && reel1 == reel2 && reel2 == reel3) {
			Toplabel.setText("yOu WiN $25!");
			Message.add(Toplabel);
		}
		else if(reel1 == 2 && reel1 == reel2 && reel2 == reel3) {
			Toplabel.setText("yOu WiN $3!");
			Message.add(Toplabel);
		}
		else if(reel1 == 0 && reel2 == 1 && reel3 == 2) {
			Toplabel.setText("yOu WiN $10!");
			Message.add(Toplabel);
		}
		else {
		Toplabel.setText("yOu lOsE your $2!");
		Message.add(Toplabel);
		}
		Slots.revalidate();
		//revalidate
	}

	private int spinReel() {
		int r = 4;
		JLabel label = new JLabel();
		// set random 0...2
		Random ran = new Random();
		int x = ran.nextInt(100);
		// load image
		if (x < 6) {
			try {
				label = createLabelImage(Seven);
				r = 0;
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (x >5 && x<46) {
			try {
				label = createLabelImage(Cherry);
				r = 1;
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				label = createLabelImage(Clover);
				r = 2;
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// add label reel
		Slots.add(label);
		// return random #
		return r;

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		// TODO Auto-generated method stub
		if (e.getSource().equals(spinButton)) {
			System.out.println("SPIN!");
			SpinReels();
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
