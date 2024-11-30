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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Widow_AUSD extends JFrame implements ActionListener {

	private Container c5;
	private JMenu file,edit;
	private JMenuBar menubar;
	private JMenuItem home,Setting,help,Logout;
	private Font f, f1, f2;
	JButton developerButton, mentorButton;
	JButton Add, Update, Search, Delate,back;
	
	
	Widow_AUSD(){
		
		c5 = this.getContentPane();
		c5.setBackground(Color.BLACK);
		c5.setLayout(null);
		
		
		JPanel Titlepanel = new JPanel();
		Titlepanel.setLayout(null);
		Titlepanel.setBackground(Color.GREEN);
		Titlepanel.setBounds(0,0,450,100);
		c5.add(Titlepanel);
		
		JPanel developerPanel = new JPanel();
		developerPanel.setLayout(null);
		developerPanel.setBackground(Color.white);
		developerPanel.setBounds(5,105,210,110);
		c5.add(developerPanel);
		
		
		JPanel mentorPanel = new JPanel();
		mentorPanel.setLayout(null);
		mentorPanel.setBackground(Color.white);
		mentorPanel.setBounds(220,105,210,110);
		c5.add(mentorPanel);
		
		
		JPanel Buttompanel = new JPanel();
		Buttompanel.setLayout(null);
		Buttompanel.setBackground(Color.white);
		Buttompanel.setBounds(0,220,450,650);
		c5.add(Buttompanel);
		
		ImageIcon add1 = new ImageIcon("src/Image/add.png");
		ImageIcon update1 = new ImageIcon("src/Image/update.png");
		ImageIcon search1 = new ImageIcon("src/Image/magnifying-glass.png");
		ImageIcon delate1 = new ImageIcon("src/Image/delete.png");
		
		Add = new JButton(add1);
		Add.setBorderPainted(false);
		Add.setBackground(Color.WHITE);
		Buttompanel.add(Add);
		Add.setBounds(53,30,65,65);
		Add.addActionListener(this);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel add = new JLabel("Add");
		add.setBounds(70,100,100,30);
		Buttompanel.add(add);
		add.setFont(f);
	
		
		f = new Font("Arial", Font.BOLD,15);
		
		
		Update = new JButton(update1);
		Update.setBorderPainted(false);
		Update.setBackground(Color.WHITE);
		Buttompanel.add(Update);
		Update.setBounds(300,30,65,65);
		Update.addActionListener(this);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel update = new JLabel("Update");
		update.setBounds(310,100,120,30);
		Buttompanel.add(update);
		update.setFont(f);
		
		
		Search = new JButton(search1);
		Search.setBorderPainted(false);
		Search.setBackground(Color.WHITE);
		Buttompanel.add(Search);
		Search.setBounds(55,190,65,65);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel search = new JLabel("Search");
		search.setBounds(62,255,100,30);
		Buttompanel.add(search);
		search.setFont(f);
		Search.addActionListener(this);
		
		
		Delate = new JButton(delate1);
		Delate.setBorderPainted(false);
		Delate.setBackground(Color.WHITE);
		Buttompanel.add(Delate);
		Delate.setBounds(295,190,65,65);
		
		
		JLabel more2 = new JLabel("Delate");
		more2.setBounds(305,255,120,30);
		Buttompanel.add(more2);
		more2.setFont(f);
		Delate.addActionListener(this);
		
		
		
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		back = new JButton(Back);
		back.setBounds(10,350,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.WHITE);
		Buttompanel.add(back);
		back.addActionListener(this);
		
		
		
		ImageIcon img = new ImageIcon("src/Image/menu-button-of-three-horizontal-lines.png");
		ImageIcon logo = new ImageIcon("src/Image/widow.png");
		ImageIcon mentor3 = new ImageIcon("src/Image/New profile1.jpg");
		ImageIcon developer3 = new ImageIcon("src/Image/sir1.jpg");
	
		
		
		JLabel logo1 = new  JLabel(logo);
		logo1.setBounds(15,10,80,80);
		Titlepanel.add(logo1);
		
		JLabel logo2 = new  JLabel(logo);
		logo2.setBounds(335,10,80,80);
		Titlepanel.add(logo2);
		
		Font  f = new Font("Times New Roman",Font.ITALIC+Font.BOLD,17);
		
		JLabel title = new  JLabel("UP Member Services Managment");
		title.setForeground(Color.RED);
		title.setBounds(95,40,250,25);
		Titlepanel.add(title);
		title.setFont(f);
		
		
		
		Font f1 = new Font("Times New Roman",Font.BOLD,15);
		
		developerButton = new JButton(mentor3);
		developerButton.setBorderPainted(false);
		developerButton.setBounds(60,5,80,80);
		developerPanel.add(developerButton);
		developerButton.addActionListener(this);
		
		
		JLabel devel = new JLabel("Software Developer");
		devel.setBounds(35,85,200,25);
		developerPanel.add(devel);
		devel.setFont(f1);
		
		
		
		mentorButton = new JButton(developer3);
		mentorButton.setBounds(60,5,80,80);
		mentorPanel.add(mentorButton);
		mentorButton.setBorderPainted(false);
		mentorButton.addActionListener(this);
		
		JLabel ment = new JLabel("Software Mentor");
		ment.setBounds(45,85,200,25);
		mentorPanel.add(ment);
		ment.setFont(f1);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==developerButton) {
			
			Developer window = new Developer();
			window.setVisible(true);
			dispose();
			window.setBounds(0,0,450,650);
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}
		 
		
		if(e.getSource()==mentorButton) {
			
			Mentor window = new Mentor();
			window.setVisible(true);
			dispose();
			window.setBounds(0,0,450,650);
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}
		
		 
		 if(e.getSource()==Add) {
			 
			 	Allowance window = new Allowance();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
				window.Widow();
			 
		 }
		 
		 
		 
		 if(e.getSource()==Update) {
			 
			 JOptionPane.showMessageDialog(null, "Update Button will UPDATE");
			 
		 }
		 
		 
		 if(e.getSource()==Search) {
			 
			    Search window = new Search(2);
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
				
				
			 
		 }
		 if(e.getSource()==Delate) {
	 
			 JOptionPane.showMessageDialog(null, "Delate Button will UPDATE");
			 
	 
		 }
		 
		 
		 if(e.getSource()==back) {
			 
			 	HomePage window = new HomePage();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
				
			 
		 }
		 	 
	}
	
	
}
