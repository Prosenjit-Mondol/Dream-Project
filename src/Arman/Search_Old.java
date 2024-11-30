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

public class Search_Old extends JFrame {

	
	Search_Old(String nid [],int count){
		
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
				if(count==1) {
					OldAge_AUSD window = new OldAge_AUSD();
					dispose();
					window.setVisible(true);
					window.setBounds(5,5,450,650);
					window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					window.setTitle("Home Page ");
					window.setResizable(false);
					}
					
					if(count==2) {
						Widow_AUSD window = new Widow_AUSD();
						dispose();
						window.setVisible(true);
						window.setBounds(5,5,450,650);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						window.setTitle("Home Page ");
						window.setResizable(false);
						}
					
					
					
					if(count==3) {
						Motherhood_AUSD window = new Motherhood_AUSD();
						dispose();
						window.setVisible(true);
						window.setBounds(5,5,450,650);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						window.setTitle("Home Page ");
						window.setResizable(false);
						}
					
					
					if(count==4) {
						LameDuck_AUSD window = new LameDuck_AUSD();
						dispose();
						window.setVisible(true);
						window.setBounds(5,5,450,650);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						window.setTitle("Home Page ");
						window.setResizable(false);
						}
					
					
					if(count==5) {
						Fisherman_AUSD window = new Fisherman_AUSD();
						dispose();
						window.setVisible(true);
						window.setBounds(5,5,450,650);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						window.setTitle("Home Page ");
						window.setResizable(false);
						}
					
					
					if(count==6) {
						Other_AUSD window = new Other_AUSD();
						dispose();
						window.setVisible(true);
						window.setBounds(5,5,450,650);
						window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						window.setTitle("Home Page ");
						window.setResizable(false);
						}
				
			}
			
		});
		
		
		
		
		Font f1 = new Font("Times New Roman",Font.BOLD,25);
		
		if(count ==1) {
			
		ImageIcon developer3 = new ImageIcon("src/Image/old-age (1).png");
		
		JLabel developer = new JLabel(developer3);
		developer.setBounds(50,0,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Old Age Allowance");
		devel.setBounds(20,130,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		}
		
		
		if(count ==2) {
			
		ImageIcon developer3 = new ImageIcon("src/Image/widow (1).png");
		
		JLabel developer = new JLabel(developer3);
		developer.setBounds(50,0,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Widow Allowance");
		devel.setBounds(20,130,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		}
		
		
		if(count ==3) {
			
		ImageIcon developer3 = new ImageIcon("src/Image/mother (1).png");
		
		JLabel developer = new JLabel(developer3);
		developer.setBounds(50,0,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Motherhood Allowance");
		devel.setBounds(0,140,400,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		}
		
		
		
		if(count ==4) {
			
		ImageIcon developer3 = new ImageIcon("src/Image/crippled (1).png");
		
		JLabel developer = new JLabel(developer3);
		developer.setBounds(50,0,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Lame Duck Allowance");
		devel.setBounds(10,140,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		}
		
		
		if(count ==5) {
			
		ImageIcon developer3 = new ImageIcon("src/Image/fisherman (1).png");
		
		JLabel developer = new JLabel(developer3);
		developer.setBounds(50,0,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Fisherman Allowance");
		devel.setBounds(10,140,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		}
		
		
		if(count ==6) {
			
		ImageIcon developer3 = new ImageIcon("src/Image/menu (1).png");
		
		JLabel developer = new JLabel(developer3);
		developer.setBounds(50,0,150,150);
		developerPanel.add(developer);
		
		JLabel devel = new JLabel("Others Allowance");
		devel.setBounds(20,145,300,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		}
		
		
		
		 String[] cols = {"Name                                                    ","Information                                            "};
		 String[][] rows = { 
								
								{" First Name",nid[1]},
								{" Last Name",nid[2]},
								{" Father Name",nid[3]},
								{" Mother Name",nid[4]},
								{" Gender",nid[5]},
								{" National NID",nid[0]},
								{" Relegion",nid[6]},
								{" District",nid[7]},
								{" Upzila",nid[8]},
								{" Post Office",nid[9]},
								{" Union",nid[10]},
								{" Ward No",nid[11]},
								{" House Name",nid[12]},
								{" Comment",nid[14]},
								{" Mobile Number",nid[13]},
								
								};
		 
		 	JTable tabel = new JTable(rows,cols);
			JScrollPane scroll = new  JScrollPane(tabel);
			scroll.setBounds(15,10,400,285);
			panel.add(scroll);
		
		
		
		
		
		
	}
	
	
}
