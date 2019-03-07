import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	void start(){
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int Random = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(Random);
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("What do you want to know?");
	// 5. If the random number is 0
		if(Random == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
	// -- tell the user "Yes"

	// 6. If the random number is 1
		else if(Random == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
	// -- tell the user "No"

	// 7. If the random number is 2
		if(Random == 2) {
			JOptionPane.showMessageDialog(null, "Try again...");
		}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		if(Random == 3) {
			JOptionPane.showMessageDialog(null, "You wish!");
		}
	// -- write your own answer

}
}