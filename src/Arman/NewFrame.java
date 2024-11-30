package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewFrame extends JFrame implements ActionListener {
	 
	
	private Container c1;
	private JTextArea ta;
	private JScrollPane scrol;
	private JPanel panel; 
	private JMenu file,edit,help;
	private JMenuBar menubar;
	private JMenuItem it1,it2,it3;
	 
	 
	 NewFrame(){
		 
		 	c1 = this.getContentPane();
			c1.setLayout(null);
			c1.setBackground(Color.green);
			
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBounds(0,0,450,650);
			panel.setBackground(Color.red);
			c1.add(panel);
			
			ImageIcon oldage = new ImageIcon("src/Image/man.png");
			
			
			JButton old = new JButton();
			old.setBounds(50,50,65,65);
			old.setIcon(oldage);
			panel.add(old);
			
			
			
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	 

	 
	 
	 
	 
}