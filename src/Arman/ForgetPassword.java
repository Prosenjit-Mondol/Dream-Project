package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ForgetPassword extends JFrame{
	private Container c3;
	private Font f,f1,f2;
	
	
	
	ForgetPassword(){
		
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
		
		JLabel title = new JLabel("Forgotten  Password");
		title.setBounds(125,150,200,30);
		c3.add(title);
		title.setFont(f);
		
		ImageIcon img = new ImageIcon("src/Image/forgot password.png");
		JLabel forget = new JLabel(img);
		forget.setBounds(160,70,80,80);
		c3.add(forget);
		
		
		JLabel user = new JLabel("Enter Username");
		user.setBounds(100,30,150,20);
		panel.add(user);
		user.setFont(f1);
		
		JTextField userfield = new JTextField();
		userfield.setBounds(50,60,200,20);
		panel.add(userfield);
		
		JButton forgetpassword = new JButton("Reset Password");
		forgetpassword.setBounds(21,100,250,20);
		forgetpassword.setBorderPainted(false);
		panel.add(forgetpassword);
		forgetpassword.setFont(f1);
		forgetpassword.setBackground(Color.GREEN);
		
		JLabel or = new  JLabel("---------------------------Or----------------------------");
		or.setBounds(35,130,250,20);
		panel.add(or);
		
		
		JButton username = new JButton("Forgotten  Username ?");
		username.setBounds(30,160,250,20);
		panel.add(username);
		username.setBorderPainted(false);
		username.setFont(f2);
		username.setForeground(Color.RED);
		username.setBackground(Color.WHITE);
		
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
		
		
		
		
		forgetpassword.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userString = userfield.getText();
				try {
					Cheek Cheek = new Cheek();
					Cheek.NameCheek(userString);
					userfield.setBackground(Color.WHITE);
					
					
//					try{
//						int count =0;
//						String username = userfield.getText();
//						
//						File userfile = new File("User.txt");
//						File Demofile = new File("DemoFile.txt");
//						
//						int x =0;
//						
//						Scanner input = new Scanner(userfile);
////						Scanner Demoinput = new Scanner(Demofile);
//						
//						FileWriter demowrite = new FileWriter("DemoFile.txt", true);
//						
//						while(input.hasNextLine()) {
//						String takeuser = input.nextLine();
//						String [] s2 = takeuser.split("---");
//						String USER = s2[0];
//						
//						if(username.equals(USER)) {
//							count =1;
//							
//						}
//						if(count ==0) {
//							String CopyLineuser = input.nextLine();
//							demowrite.write(CopyLineuser);
//							demowrite.write("\n");
//						}
//						if(count ==1) {
////							String takeuser1 = input.nextLine();
////							String [] s3 = takeuser1.split("---");
//							demowrite.write(s2[0]);
//							demowrite.write("---");
//							demowrite.write(s2[1]);
//							demowrite.write("\n");
//							count=2;
//							
//						}
//						if(count==2) {
//							String Copylineuser = input.nextLine();
//							demowrite.write(Copylineuser);
//							demowrite.write("\n");
//						}
//						
//						}
//						
//						demowrite.close();
//					}
//					catch(Exception e1) {
//						System.out.println("User Cheek Problem!");
//						
//					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					/////////////////////////////
					
					
					
					}
					catch(Exception e4) {
						userfield.setBackground(Color.RED);
					}
				
			}
			
		});
		
		username.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ForgetUsername window = new ForgetUsername();
				window.setVisible(true);
				dispose();
				window.setBounds(0,0,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("UP Member Services Managment ");
				window.setResizable(false);
				
			}
			
		});
		
		
		
		
	}


	
	
	
}
