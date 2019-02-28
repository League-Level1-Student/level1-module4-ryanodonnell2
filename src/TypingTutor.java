import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	JFrame frame;
	JPanel panel;
	JLabel letter;
	char currentLetter = generateRandomLetter();
	char letterT;
	int lettersC;
	int letters = 0;
	float acc;

	void typing() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		letter = new JLabel();
		panel.add(letter);
		letter.setText("W"); // Set the frame size to be the biggest letter so every other letter will fit in
								// the frame
		letter.setFont(letter.getFont().deriveFont(350.0f));
		letter.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.add(panel);
		frame.setSize(1000, 1000);
		frame.pack();
		letter.setText(Character.toString(currentLetter));
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		new TypingTutor().typing();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(letters);
		if (letters < 20) {
			letters++;
			letterT = e.getKeyChar();
			System.out.println("You typed:  " + letterT);
			if (letterT == currentLetter) {
				panel.setBackground(Color.GREEN);
				lettersC++;
				System.out.println(lettersC);
			} else {
				panel.setBackground(Color.RED);

			}
		} else {
			JOptionPane.showMessageDialog(null, "Finnished!");
			JOptionPane.showMessageDialog(null, "Your accuracy is " + acc + "%!");
			showTypingSpeed(lettersC);
			acc = lettersC/letters;
			
			frame.dispose();
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (letters < 10) {
			currentLetter = generateRandomLetter();
			letter.setText(Character.toString(currentLetter));
		} else {
			JOptionPane.showMessageDialog(null, "Finnished!");
			showTypingSpeed(lettersC);
			frame.dispose();
		}

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

}
