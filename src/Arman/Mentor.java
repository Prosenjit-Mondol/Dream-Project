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
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Mentor extends JFrame {
	
	
	private String[] cols = {"Name                                                    "," Md. Nasif Osman Khansur                                            "};
	private String[][] rows = { 
							
							{" Fateher Name"," N/A"},
							{" Mother Name"," N/A"},
							{" Date of Birth"," N/A"},
							{" Faculty"," Green University of Bangladesh"},
							{" Department"," CSE"},
							{" Gender"," Male"},
							{" University"," Rajshahi University of Engineering and Technology (RUET)"},
							{" College"," Noter Dame College"},
							{" School ","Bindu Basini Govt. Boy's High School"},
							{" District"," N/A"},
							{" Upzila"," N/A"},
							{" Post Office"," N/A"},
							{" Post Code"," N/A"},
							{" Union"," N/A"},
							{" Ward"," N/A"},
							{" House Name"," N/A"}
							
							};
	
	
	

	Mentor(){
		
		
		Container c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,240,450,300);
		c.add(panel);
		panel.setBackground(Color.white);
		
		
		JPanel developerPanel = new JPanel();
		developerPanel.setLayout(null);
		developerPanel.setBackground(Color.white);
		developerPanel.setBounds(100,40,250,200);
		c.add(developerPanel);
		
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		JButton back = new JButton(Back);
		back.setBounds(10,20,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.WHITE);
		c.add(back);
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				HomePage window = new HomePage();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Home Page ");
				window.setResizable(false);
				
			}
			
		});
		
		
		
		
		Font f1 = new Font("Times New Roman",Font.BOLD,25);
		ImageIcon mentor = new ImageIcon("src/Image/sir.jpg");
		
		
		JButton developer = new JButton(mentor);
		developer.setBorderPainted(false);
		developer.setBounds(50,5,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Software Mentor");
		devel.setBounds(30,160,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		JTable tabel = new JTable(rows,cols);
		JScrollPane scroll = new  JScrollPane(tabel);
		scroll.setBounds(15,10,400,290);
		panel.add(scroll);
		
	}
	
}