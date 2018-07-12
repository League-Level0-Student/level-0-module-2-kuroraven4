package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
	String answer =JOptionPane.showInputDialog("How Tall are you?");
	int height = Integer.parseInt(answer);
	if (height>=4) {JOptionPane.showMessageDialog(null, "Congrats! You're tall enough to ride the roller coaster.");
		
	} else {JOptionPane.showMessageDialog(null, "Sorry, you're not tall enough to ride the roller coaster.");

	}
	}
	}

