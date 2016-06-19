

import javax.swing.JOptionPane;

public class whosdgrollfedree {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Are you a girls or a boys");
	
		
	
		
		if (name.equals("girls")) {
			JOptionPane.showMessageDialog(null, name + " are better programmers");

		} else if (name.equals("boys")) {
			JOptionPane.showMessageDialog(null, name + " are programmers");
		}
	}
}
