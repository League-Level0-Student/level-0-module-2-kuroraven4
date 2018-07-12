package random;

import javax.swing.JOptionPane;

public class SchoolGrade {
public static void main(String[] args) {
	String grade =JOptionPane.showInputDialog("What's your grade?");
	int answer = Integer.parseInt(grade);
	if (answer>=70) {JOptionPane.showMessageDialog(null, "You Pass!");
		
	} else {JOptionPane.showMessageDialog(null, "You Don't Pass.");

	}
}
}
