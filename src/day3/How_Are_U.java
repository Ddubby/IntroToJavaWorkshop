package day3;

import javax.swing.JOptionPane;

public class How_Are_U {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your Name?");
		JOptionPane.showMessageDialog(null, "Hello "+name+"!");
		JOptionPane.showMessageDialog(null, "How do you do?");
	}

}
