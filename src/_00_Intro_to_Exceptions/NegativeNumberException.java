package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{

	 void scaryPopup() {
		 JOptionPane.showMessageDialog(null, "You have triggered a critical error in your computer");
	 }

}
