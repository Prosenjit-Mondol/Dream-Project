package Arman;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class SettingClass extends JFrame {

	
	SettingClass(){
		
		Container c1 = this.getContentPane();
		c1.setBackground(Color.GREEN);
		c1.setLayout(null);
		
		JLabel l6 = new  JLabel("Aramn Hossain");
		l6.setBounds(600,600,100,20);
		c1.add(l6)
		;
		
		
		
		
		
	}
	

}