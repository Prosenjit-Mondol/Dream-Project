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

public class Developer extends JFrame {

	
	private String[] cols = {"Name                                                    ","Arman Hossain                                            "};
	private String[][] rows = { 
							
							{" Fateher Name"," Md. Nurnobi"},
							{" Mother Name"," Sufiya Begum"},
							{" Date of Birth"," 15 April 2001"},
							{" Student ID"," 221002624"},
							{" Department"," CSE"},
							{" Batch"," DL-221"},
							{" University"," Green University of Bangaldesh"},
							{" Email"," arman.cse.green@gmail.com"},
							{" Mobile Number"," 0160947299"},
							{" District"," Lakshmipur"},
							{" Upzila"," Ramgoti"},
							{" Post Office"," Bibir Hat"},
							{" Post Code"," 3732"},
							{" Union"," 07 No Char Romiz Union Council"},
							{" Ward"," 08"},
							{" House Name"," Nurnobi Member Bari"}
							
							};
	
	
	

	
	
	Developer(){
		
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
		ImageIcon developer3 = new ImageIcon("src/Image/New profile150.jpg");
		
		
		JButton developer = new JButton(developer3);
		developer.setBorderPainted(false);
		developer.setBounds(50,5,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Software Developer");
		devel.setBounds(20,160,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		JTable tabel = new JTable(rows,cols);
		JScrollPane scroll = new  JScrollPane(tabel);
		scroll.setBounds(15,10,400,290);
		panel.add(scroll);
	}
	
}