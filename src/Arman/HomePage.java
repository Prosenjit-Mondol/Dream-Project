package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class HomePage extends JFrame implements ActionListener{

	
	private Container c5;
	private JMenu file,edit;
	private JMenuBar menubar;
	private JMenuItem home,Setting,help,Logout;
	private Font f, f1, f2;
	JButton developerButton, mentorButton;
	JButton oldage1, widow1, motherhood1, lameduck1, fisherman1, more1;
	JButton call1, police1, fire1, hospital1;
	HomePage(){
		
		c5 = this.getContentPane();
		c5.setBackground(Color.BLACK);
		c5.setLayout(null);
		
		
		
		ImageIcon menuicon  = new ImageIcon("src/Image/menu-button-of-three-horizontal-lines.png");
		
		ImageIcon logout = new ImageIcon("src/Image/logout.png");
		ImageIcon Home = new ImageIcon("src/Image/home (1).png");
		ImageIcon helpdesk = new ImageIcon("src/Image/support.png");
		ImageIcon setting = new ImageIcon("src/Image/setting.png");
		menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		
		
		file = new JMenu(" Menu");
		file.setIcon(menuicon);
		menubar.add(file);
		
		home = new JMenuItem("Home");
		file.add(home);
		home.setIcon(Home);
		
		Setting = new JMenuItem("Setting");
		file.add(Setting);
		Setting.setIcon(setting);
		
		help = new JMenuItem("Help Desk");
		file.add(help);
		help.setIcon(helpdesk);
		
		
		 Logout = new  JMenuItem("Log Out");
		file.add(Logout);
		Logout.setIcon(logout);
		
		
		
		home.addActionListener(this);
		Setting.addActionListener(this);
		Logout.addActionListener(this);
		
		
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
		
		ImageIcon oldage = new ImageIcon("src/Image/old-age.png");
		ImageIcon window = new ImageIcon("src/Image/widow.png");
		ImageIcon motherhood = new ImageIcon("src/Image/mother.png");
		ImageIcon lameduck = new ImageIcon("src/Image/crippled.png");
		ImageIcon call = new ImageIcon("src/Image/call.png");
		ImageIcon police = new ImageIcon("src/Image/police-station.png");
		ImageIcon fire = new ImageIcon("src/Image/fire-station.png");
		ImageIcon hospital = new ImageIcon("src/Image/hospital.png");
		ImageIcon fisherman = new ImageIcon("src/Image/fisherman.png");
		ImageIcon more = new ImageIcon("src/Image/menu.png");
		
		oldage1 = new JButton(oldage);
		oldage1.setBorderPainted(false);
		oldage1.setBackground(Color.WHITE);
		Buttompanel.add(oldage1);
		oldage1.setBounds(23,20,65,65);
		oldage1.addActionListener(this);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel oldage2 = new JLabel("Old Age");
		oldage2.setBounds(25,80,100,30);
		Buttompanel.add(oldage2);
		oldage2.setFont(f);
		
		
		
		
		widow1 = new JButton(window);
		widow1.setBorderPainted(false);
		widow1.setBackground(Color.WHITE);
		Buttompanel.add(widow1);
		widow1.setBounds(170,20,65,65);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel widow2 = new JLabel("Widow Women");
		widow2.setBounds(150,80,120,30);
		Buttompanel.add(widow2);
		widow2.setFont(f);
		widow1.addActionListener(this);
		
		
		motherhood1 = new JButton(motherhood);
		motherhood1.setBorderPainted(false);
		motherhood1.setBackground(Color.WHITE);
		Buttompanel.add(motherhood1);
		motherhood1.setBounds(330,18,65,65);
		motherhood1.addActionListener(this);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel Maternity2 = new JLabel("Motherhood");
		Maternity2.setBounds(315,80,120,30);
		Buttompanel.add(Maternity2);
		Maternity2.setFont(f);
		
		
		lameduck1 = new JButton(lameduck);
		lameduck1.setBorderPainted(false);
		lameduck1.setBackground(Color.WHITE);
		Buttompanel.add(lameduck1);
		lameduck1.setBounds(25,120,65,65);
		
		f = new Font("Arial", Font.BOLD,15);
		
		JLabel lameduck2 = new JLabel("Lame Duck");
		lameduck2.setBounds(22,188,100,30);
		Buttompanel.add(lameduck2);
		lameduck2.setFont(f);
		lameduck1.addActionListener(this);
		
		
		
		fisherman1 = new JButton(fisherman);
		fisherman1.setBorderPainted(false);
		fisherman1.setBackground(Color.WHITE);
		Buttompanel.add(fisherman1);
		fisherman1.setBounds(175,120,65,65);
		
		JLabel fisherman2 = new JLabel("Fisher Man");
		fisherman2.setBounds(172,188,100,20);
		Buttompanel.add(fisherman2);
		fisherman2.setFont(f);
		fisherman1.addActionListener(this);
		
		
		
		more1 = new JButton(more);
		more1.setBorderPainted(false);
		more1.setBackground(Color.WHITE);
		Buttompanel.add(more1);
		more1.setBounds(325,120,65,65);
		
		
		JLabel more2 = new JLabel("More");
		more2.setBounds(338,180,120,30);
		Buttompanel.add(more2);
		more2.setFont(f);
		more1.addActionListener(this);
		
		
		
		call1 = new JButton(call);
		call1.setBorderPainted(false);
		call1.setBackground(Color.WHITE);
		Buttompanel.add(call1);
		call1.setBounds(28,250,65,65);
		call1.addActionListener(this);
		
		
		JLabel call2 = new JLabel("Call");
		call2.setBounds(40,320,100,20);
		Buttompanel.add(call2);
		call2.setFont(f);
		
		
		police1 = new JButton(police);
		police1.setBorderPainted(false);
		police1.setBackground(Color.WHITE);
		Buttompanel.add(police1);
		police1.setBounds(130,250,65,65);
		police1.addActionListener(this);
		
		JLabel police2 = new JLabel("Police");
		police2.setBounds(140,320,100,20);
		Buttompanel.add(police2);
		police2.setFont(f);
		
		
		
		fire1 = new JButton(fire);
		fire1.setBorderPainted(false);
		fire1.setBackground(Color.WHITE);
		Buttompanel.add(fire1);
		fire1.setBounds(230,250,65,65);
		fire1.addActionListener(this);
		
		JLabel fire2 = new JLabel("Fire Services");
		fire2.setBounds(210,320,100,20);
		Buttompanel.add(fire2);
		fire2.setFont(f);
		
		
		hospital1 = new JButton(hospital);
		hospital1.setBorderPainted(false);
		hospital1.setBackground(Color.WHITE);
		Buttompanel.add(hospital1);
		hospital1.setBounds(335,250,65,65);
		hospital1.addActionListener(this);
		
		
		JLabel hospital2 = new JLabel("Hospital");
		hospital2.setBounds(335,320,100,20);
		Buttompanel.add(hospital2);
		hospital2.setFont(f);
		
		
		
		
		ImageIcon img = new ImageIcon("src/Image/menu-button-of-three-horizontal-lines.png");
		ImageIcon logo = new ImageIcon("src/Image/bangladesh.png");
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



		if(e.getSource()==home) {
			
			HomePage window = new HomePage();
			dispose();
			window.setVisible(true);
			window.setBounds(5,5,450,650);
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setTitle("Home Page ");
			window.setResizable(false);

		}
		
		
		 if(e.getSource()==Setting) {
			 
			SettingClass window = new SettingClass();
			window.setVisible(true);
			window.setBounds(0,0,450,650);
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}
		 
		 
		 if(e.getSource()==Logout) {
			 
			 Login window = new Login();
				dispose();
				window.setVisible(true);
				window.setBounds(0,0,450,650);
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setTitle("UP Member Services Managment ");
				window.setResizable(false);
			 
		 }
		 
		 
		 
		 if(e.getSource()==oldage1) {
			 
			 	OldAge_AUSD window = new OldAge_AUSD();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
			 
		 }
		 
		 
		 if(e.getSource()==widow1) {
			 
			 	Widow_AUSD window = new Widow_AUSD();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
				
			 
		 }
		 
		 
		 
		 if(e.getSource()==motherhood1) {
			 
			 Motherhood_AUSD window = new Motherhood_AUSD();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
				
			 
		 }
		 
		 
		 if(e.getSource()==lameduck1) {
			 
			    LameDuck_AUSD window = new LameDuck_AUSD();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
			 
		 }
 
		 if(e.getSource()==fisherman1) {
	 
			 Fisherman_AUSD window = new Fisherman_AUSD();
			 dispose();
			 window.setVisible(true);
			 window.setBounds(5,5,450,650);
			 window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			 window.setTitle("Create an Account ");
			 window.setResizable(false);
	 
		 }
		 if(e.getSource()==more1) {
	 
			 Other_AUSD window = new Other_AUSD();
			 dispose();
			 window.setVisible(true);
			 window.setBounds(5,5,450,650);
			 window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			 window.setTitle("Create an Account ");
			 window.setResizable(false);
	 
		 }
		 
		 
		 if(e.getSource()==fire1) {
			 
			 JOptionPane.showMessageDialog(null, "Fire Services Map will UPDATE");
	 
		 }
		 
		 
		 
		 if(e.getSource()==call1) {
			 
			 JOptionPane.showMessageDialog(null, "Emargencey Number will UPDATE");
	 
		 }
		 
		 
		 
		 if(e.getSource()==police1) {
			 
			 JOptionPane.showMessageDialog(null, "Police station Map will UPDATE");
	 
		 }
		 
		 
		 
		 if(e.getSource()==hospital1) {
			 
			 JOptionPane.showMessageDialog(null, "Hospital Map will UPDATE");
	 
		 }
		 
		 
		 	 
	}
	
}