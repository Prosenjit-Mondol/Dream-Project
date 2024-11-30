package Arman;

import javax.swing.JFrame;

public class MainClass {

public static void main(String[] args) {
	Login window = new Login();
	window.setVisible(true);
	window.setBounds(5,5,450,650);
	window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	window.setTitle("Home Page ");
	window.setResizable(false);

	}
	
}
