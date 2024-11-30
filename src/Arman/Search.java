package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Search extends JFrame {
	

	
	private Container c5;
	private JMenu file,edit;
	private JMenuBar menubar;
	private JMenuItem home,Setting,help,Logout;
	private Font f, f1, f2;
	JButton developerButton, mentorButton;
	JButton Add, Update, Search, Delate,back;
	int Count=0;
	
	Search(int count){
		
		c5 = this.getContentPane();
		c5.setBackground(Color.white);
		c5.setLayout(null);
		
		
		JPanel Titlepanel = new JPanel();
		Titlepanel.setLayout(null);
		Titlepanel.setBackground(Color.GREEN);
		Titlepanel.setBounds(0,0,450,100);
		c5.add(Titlepanel);
		
		
		Font  f = new Font("Times New Roman",Font.ITALIC+Font.BOLD,25);

		
		if(count==1) {
			JLabel title = new  JLabel("Old Age Allowance");
			title.setForeground(Color.black);
			title.setBounds(110,40,250,25);
			Titlepanel.add(title);
			title.setFont(f);
			}
		
		if(count==2) {
			JLabel title = new  JLabel("Widow Allowance");
			title.setForeground(Color.black);
			title.setBounds(110,40,250,25);
			Titlepanel.add(title);
			title.setFont(f);
			}
		
		if(count==3) {
			JLabel title = new  JLabel("Motherhood Allowance");
			title.setForeground(Color.black);
			title.setBounds(110,40,250,25);
			Titlepanel.add(title);
			title.setFont(f);
			}
		
		if(count==4) {
			JLabel title = new  JLabel("LameDuck Allowance");
			title.setForeground(Color.black);
			title.setBounds(110,40,250,25);
			Titlepanel.add(title);
			title.setFont(f);
			}
		
		if(count==5) {
			JLabel title = new  JLabel("Fisherman Allowance");
			title.setForeground(Color.black);
			title.setBounds(110,40,250,25);
			Titlepanel.add(title);
			title.setFont(f);
			}
		
		if(count==6) {
			JLabel title = new  JLabel("Others Allowance");
			title.setForeground(Color.black);
			title.setBounds(110,40,250,25);
			Titlepanel.add(title);
			title.setFont(f);
			}
		
		
		
		Font f1 = new Font("Times New Roman",Font.BOLD,15);
		
		
		JLabel nid = new JLabel("Enter Nid: ");
		nid.setBounds(50,182,100,20);
		c5.add(nid);
		nid.setFont(f1);
		
		JTextField Nid = new JTextField();
		Nid.setBounds(150,180,150,30);
		c5.add(Nid);
		
		JButton NID = new JButton("Enter");
		NID.setBounds(230,220,70,20);
		c5.add(NID);
		NID.setBackground(Color.green);
		NID.setBorderPainted(false);
		
		NID.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String nidstring = Nid.getText();
				Cheek Cheek = new Cheek();
				try {
					Cheek.NID(nidstring);
					Nid.setBackground(Color.WHITE);
					Count=1;
					
					}
					catch(Exception e1) {
						Nid.setBackground(Color.RED);
					}
				
				
				if(count==1) {
				if(Count==1) {
					try {
					File file = new File("OldAge Allowance.txt");
					Scanner input = new Scanner(file);
					String s = Nid.getText();
					
					while(input.hasNext()) {
						String s1 = input.nextLine();
						if(s1.startsWith(s)) {
							String [] string = s1.split("---");
							input.close();
							Search_Old window = new Search_Old(string,1);
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page ");
							window.setResizable(false);
							break;
							
							
						}
					}
					}catch(Exception e1) {
						
					}
					
				}}
				
				
				
				if(count==2) {
				if(Count==1) {
					try {
					File file = new File("Widow Allowance.txt");
					Scanner input = new Scanner(file);
					String s = Nid.getText();
					
					while(input.hasNext()) {
						String s1 = input.nextLine();
						if(s1.startsWith(s)) {
							String [] string = s1.split("---");
							input.close();
							Search_Old window = new Search_Old(string,2);
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page ");
							window.setResizable(false);
							break;
							
						}
					}
					}catch(Exception e1) {
						
					}
					
				}}
				
				
				
				if(count==3) {
				if(Count==1) {
					try {
					File file = new File("Motherhood Allowance.txt");
					Scanner input = new Scanner(file);
					String s = Nid.getText();
					
					while(input.hasNext()) {
						String s1 = input.nextLine();
						if(s1.startsWith(s)) {
							String [] string = s1.split("---");
							input.close();
							Search_Old window = new Search_Old(string,3);
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page ");
							window.setResizable(false);
							break;
							
						}
					}
					}catch(Exception e1) {
						
					}
					
				}}
				
				
				
				if(count==4) {
				if(Count==1) {
					try {
					File file = new File("LameDuck Allowance.txt");
					Scanner input = new Scanner(file);
					String s = Nid.getText();
					
					while(input.hasNext()) {
						String s1 = input.nextLine();
						if(s1.startsWith(s)) {
							String [] string = s1.split("---");
							input.close();
							Search_Old window = new Search_Old(string,4);
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page ");
							window.setResizable(false);
							break;
							
						}
					}
					}catch(Exception e1) {
						
					}
					
				}}
				
				
				
				if(count==5) {
				if(Count==1) {
					try {
					File file = new File("Fisherman Allowance.txt");
					Scanner input = new Scanner(file);
					String s = Nid.getText();
					
					while(input.hasNext()) {
						String s1 = input.nextLine();
						if(s1.startsWith(s)) {
							String [] string = s1.split("---");
							input.close();
							Search_Old window = new Search_Old(string,5);
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page ");
							window.setResizable(false);
							break;
							
						}
					}
					}catch(Exception e1) {
						
					}
					
				}}
				
				
				
				if(count==6) {
				if(Count==1) {
					try {
					File file = new File("Other Allowance.txt");
					Scanner input = new Scanner(file);
					String s = Nid.getText();
					
					while(input.hasNext()) {
						String s1 = input.nextLine();
						if(s1.startsWith(s)) {
							String [] string = s1.split("---");
							input.close();
							Search_Old window = new Search_Old(string,6);
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page ");
							window.setResizable(false);
							
							
						}
					}
					}catch(Exception e1) {
						
					}
					
				}}
				
				
				
				
			}
			
		});
		
		
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		JButton back = new JButton(Back);
		back.setBounds(10,575,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.WHITE);
		c5.add(back);
		
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
		
		
		
		
	}
	
	
	
}
