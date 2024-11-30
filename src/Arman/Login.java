package Arman;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JFrame implements ActionListener{
	
	
	
	private Container c;
	private JPanel panel;
	private ImageIcon img1,img2,img3;
	private Image icon1,icon2,icon3,icon4;
	private CardLayout card,card1;
	private JLabel title;
	private Font f,f1;
	private JPanel panel1,panel2;
	private Cursor cursor;
	private JButton next, pre, forget;
	
	
	
	Login(){
		
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GREEN);

		
		f = new Font("Arial",Font.BOLD,17);
		f1 = new Font("Arial",Font.ITALIC,10);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		title  = new JLabel("UP Member Services Managment");
		title.setBounds(60,30,500,30);
		title.setFont(f);
		c.add(title);
		
		
		card = new CardLayout();
		panel = new JPanel(card);
		panel.setBounds(40,80,320,170);
		c.add(panel);
		
		img1 = new ImageIcon(getClass().getResource("1.JPG"));
		icon1 = img1.getImage();
		Image newicon1 = icon1.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
		img1 = new ImageIcon(newicon1);
		JLabel l1 = new JLabel(img1);
		panel.add(l1);		
		
		img2 = new ImageIcon(getClass().getResource("user input.JPG"));
		icon2 = img2.getImage();
		Image newicon2 = icon2.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
		img2 = new ImageIcon(newicon2);
		JLabel l2 = new JLabel(img2);
		panel.add(l2);
		
		img3 = new ImageIcon(getClass().getResource("While Loop.JPG"));
		icon3 = img3.getImage();
		Image newicon3 = icon3.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
		img3 = new ImageIcon(newicon3);
		JLabel l3 = new JLabel(img3);
		panel.add(l3);
		
		next = new JButton("Pre");
		next.setBounds(40,255,60,20);
		c.add(next);
		next.setCursor(cursor);
		
		pre = new JButton("Next");
		pre.setBounds(300,255,60,20);
		c.add(pre);
		pre.setCursor(cursor);
		
		
		next.addActionListener(this);
		pre.addActionListener(this);
		
		
		panel1 = new JPanel();
		
		panel1.setBounds(40,285,320,250);
		panel1.setBackground(Color.green);
		c.add(panel1);
		
		ImageIcon	img4 = new ImageIcon(getClass().getResource("govt logo.png"));
		Image icon4 = img4.getImage();
		Image newicon4 = icon4.getScaledInstance(panel1.getWidth(), panel1.getHeight(), Image.SCALE_SMOOTH);
		img4 = new ImageIcon(newicon4);
		JLabel l = new JLabel(img4);
		panel1.add(l);
		panel1.setLayout(null);
		
		Font f2 = new Font("Times New Roman",Font.ITALIC,17);
		JLabel userl = new JLabel("Username");
		userl.setBounds(40,40,100,20);
		userl.setFont(f2);
		panel1.add(userl);
		
		
		JLabel passl = new JLabel("Password");
		passl.setBounds(40,75,100,20);
		passl.setFont(f2);
		panel1.add(passl);
		
		
		
		JTextField user = new JTextField();
		user.setBounds(135,40,140,20);
		panel1.add(user);
		
		
		
		JPasswordField pass = new  JPasswordField();
		pass.setBounds(135,75,140,20);
		panel1.add(pass);
		
		
		JButton Log = new JButton("Log In");
		Log.setBounds(43,105,230,20);
		panel1.add(Log);
		Log.setBackground(Color.YELLOW);
		Log.setCursor(cursor);
		
		
		forget = new JButton("Forgotten Passwor?");
		forget.setBorderPainted(false);
		forget.setBounds(150,125,130,20);
		panel1.add(forget);
		forget.setFont(f1);
		forget.setForeground(Color.RED);
		forget.setBackground(Color.GREEN);
		forget.setCursor(cursor);
		forget.addActionListener(this);
		
		JLabel or = new  JLabel("-------------------------Or--------------------------");
		or.setBounds(48,145,320,20);
		panel1.add(or);
		
		
		JButton create = new JButton("Create new account");
		create.setBounds(43,180,230,20);
		panel1.add(create);
		create.setBackground(Color.WHITE);
		create.setCursor(cursor);
		
		Log.addActionListener(new  ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username = user.getText();
				String password = pass.getText();
				int usercount = 0;
				int passcount = 0;
			
				try{
					File userfile = new File("User.txt");
					Scanner input = new Scanner(userfile);
					while(input.hasNextLine()) {
					String takeuser = input.nextLine();
					String [] usercheek = takeuser.split("---");
					String usernamecheek = usercheek[0];
					String passwordcheek = usercheek[1];
					if(usernamecheek.equals(username)) {
						usercount=1;
						if(passwordcheek.equals(password)) {
							passcount = 1;
							JOptionPane.showMessageDialog(null, "Log In sussfull");
							HomePage window = new HomePage();
							dispose();
							window.setVisible(true);
							window.setBounds(5,5,450,650);
							window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							window.setTitle("Home Page");
							window.setResizable(false);
							break;
							
						}
						else {
							
							break;
						}
					}
					}
					if(usercount == 0) {
						JOptionPane.showMessageDialog(null, "Username does not match!");
					}
					else if(passcount == 0) {
						JOptionPane.showMessageDialog(null, "Password does not match!");
					}
				}
				catch(Exception e1) {
					System.out.println("File does not create properly");
					
				}
				
			}

		});
	
		
		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Create window = new Create();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Create an Account ");
				window.setResizable(false);
				
			}
			
		});
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
			card.next(panel);
			
		}
		if(e.getSource()==pre) {
			card.previous(panel);
		}
		
		if(e.getSource()==forget) {
			ForgetPassword window = new ForgetPassword();
			window.setVisible(true);
			dispose();
			window.setBounds(0,0,450,650);
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setTitle("UP Member Services Managment ");
			window.setResizable(false);

		}
		
	}

}