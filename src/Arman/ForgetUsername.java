package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ForgetUsername extends JFrame {

	private Container c3;
	private Font f,f1,f2;
	
	
	
	ForgetUsername(){
		
		c3= this.getContentPane();
		c3.setLayout(null);
		c3.setBackground(Color.GREEN);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(65,200,290,250);
		c3.add(panel);
		panel.setBackground(Color.WHITE);
		
		
		f = new Font("Times New Roman",Font.BOLD,20);
		f1 = new Font("Times New Roman",Font.BOLD,14);
		f2 = new Font("Times New Roman",Font.ITALIC,12);
		
		JLabel title = new JLabel("Forgotten  Username ?");
		title.setBounds(125,150,200,30);
		c3.add(title);
		title.setFont(f);
		
		ImageIcon img = new ImageIcon("src/Image/forgot user.png");
		JLabel forget = new JLabel(img);
		forget.setBounds(160,70,80,80);
		c3.add(forget);
		
		
		JLabel user = new JLabel("Enter Your Name");
		user.setBounds(100,30,150,20);
		panel.add(user);
		user.setFont(f1);
		
		JTextField userfield = new JTextField();
		userfield.setBounds(50,60,200,20);
		panel.add(userfield);
		
		JButton forgetuser = new JButton("Reset Username");
		forgetuser.setBounds(21,100,250,20);
		forgetuser.setBorderPainted(false);
		panel.add(forgetuser);
		forgetuser.setFont(f1);
		forgetuser.setBackground(Color.GREEN);
		
		
		
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		
		JButton back = new JButton(Back);
		back.setBounds(10,20,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.GREEN);
		c3.add(back);
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Login window = new Login();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Home Page ");
				window.setResizable(false);
				
			}
			
		});
		
		
		
		Cheek Cheek = new Cheek();
		
		forgetuser.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userString = userfield.getText();
				try {
					Cheek.NameCheek(userString);
					userfield.setBackground(Color.WHITE);
					}
					catch(Exception e4) {
						userfield.setBackground(Color.RED);
					}
				
			}
			
		});
		
		
		
		
	}
	
	
}