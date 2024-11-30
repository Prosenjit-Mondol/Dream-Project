package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Allowance extends JFrame implements ActionListener {

	private Container c2;
	private JLabel firstname, lastname;
	private JTextField first, last,fathername,mothername, Nid,Union1,mobile1,postoffice1;
	private JTextField House1,comment1,pass4;
	private JComboBox district, upzila;
	private JDateChooser calender;
	
	
	
void OldAge(){
		
		c2 = this.getContentPane();
		c2.setBackground(Color.GREEN);
		c2.setLayout(null);
		
		JPanel toppanel = new JPanel();
		toppanel.setBounds(0,0,450,135);
		c2.add(toppanel);
		toppanel.setBackground(Color.white);
		toppanel.setLayout(null);
		
		
		
		
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		
		JButton back = new JButton(Back);
		back.setBounds(10,20,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.WHITE);
		toppanel.add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OldAge_AUSD window = new OldAge_AUSD();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Home Page ");
				window.setResizable(false);
				
			}
			
		});
		
		
		ImageIcon oldage = new ImageIcon("src/Image/old-age.png");
		JLabel old = new JLabel(oldage);
		old.setBounds(180,40,65,65);
		toppanel.add(old);
		Font f2 = new Font("Times New Roman",Font.BOLD,18);
		JLabel oldageTitle = new JLabel("Entery Old Age Allowance");
		oldageTitle.setBounds(110,105,250,20);
		toppanel.add(oldageTitle);
		oldageTitle.setFont(f2);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,125,450,490);
		panel.setBackground(Color.WHITE);
		c2.add(panel);

		
		
		Font f = new Font("Arial", Font.BOLD,13);
		Font f1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT,10);
		
		
		firstname = new JLabel("First Name:");
		firstname.setBounds(15,30,100,25);
		panel.add(firstname);
		firstname.setFont(f);
		
		lastname = new JLabel("Last Name:");
		lastname.setBounds(215,30,100,25);
		panel.add(lastname);
		lastname.setFont(f);
		
		JLabel father = new JLabel("Father Name:");
		father.setBounds(15,80,100,25);
		panel.add(father);
		father.setFont(f);
		
		JLabel mother = new JLabel("Mother Name:");
		mother.setBounds(215,80,100,25);
		panel.add(mother);
		mother.setFont(f);
		JLabel nid = new JLabel("NID *:");
		nid.setBounds(15,130,50,25);
		panel.add(nid);
		nid.setFont(f);
		
		JLabel dob = new JLabel("Entry Date:");
		dob.setBounds(215,130,100,25);
		panel.add(dob);
		dob.setFont(f);
		
		JLabel district1 = new JLabel("Religion:");
		district1.setBounds(15,180,100,25);
		panel.add(district1);
		district1.setFont(f);
		
		JLabel upzila1 = new JLabel("District:");
		upzila1.setBounds(215,180,100,25);
		panel.add(upzila1);
		upzila1.setFont(f);
		
		JLabel rligion2 = new JLabel("Upzila:");
		rligion2.setBounds(15,230,100,25);
		panel.add(rligion2);
		rligion2.setFont(f);
		
		JLabel Gender = new JLabel("Gender:");
		Gender.setBounds(215,230,100,25);
		panel.add(Gender);
		Gender.setFont(f);
		
		JLabel union = new JLabel("Union:");
		union.setBounds(15,280,100,25);
		panel.add(union);
		union.setFont(f);
		
		JLabel ward2 = new JLabel("Ward:");
		ward2.setBounds(215,280,100,25);
		panel.add(ward2);
		ward2.setFont(f);
		
		JLabel Mobile = new JLabel("Mobile No:");
		Mobile.setBounds(15,330,100,20);
		panel.add(Mobile);
		Mobile.setFont(f);
		
		
		JLabel postoffice = new JLabel("Post Office:");
		postoffice.setBounds(215,330,120,20);
		panel.add(postoffice);
		postoffice.setFont(f);
		

		JLabel house = new JLabel("House Name:");
		house.setBounds(15,380,100,25);
		panel.add(house);
		house.setFont(f);
		
		JLabel comment = new JLabel("Comment:");
		comment.setBounds(215,380,100,25);
		panel.add(comment);
		comment.setFont(f);
		
		Cheek  Cheek = new Cheek();
		
		
		first = new JTextField();
		first.setBounds(105,30,100,25);
		panel.add(first);
		
		
		
		last = new JTextField();
		last.setBounds(320,30,100,25);
		panel.add(last);
		
		
		fathername = new JTextField();
		fathername.setBounds(105,80,100,25);
		panel.add(fathername);
		
		
		mothername = new JTextField();
		mothername.setBounds(320,80,100,25);
		panel.add(mothername);

		
		Nid = new JTextField();
		Nid.setBounds(105,130,100,25);
		panel.add(Nid);
		
		
		calender = new JDateChooser();
		calender.setBounds(320,130,100,25);
		panel.add(calender);
		
		
		Union1 = new JTextField();
		Union1.setBounds(105,280,100,25);
		panel.add(Union1);
		
		
		mobile1 = new JTextField();
		mobile1.setBounds(105,330,100,25);
		panel.add(mobile1);
		
		
		postoffice1 = new JTextField();
		postoffice1.setBounds(320,330,100,25);
		panel.add(postoffice1);

	
		House1 = new JTextField();
		House1.setBounds(105,380,100,25);
		panel.add(House1);
		
		
		comment1 = new JTextField();
		comment1.setBounds(320,380,100,25);
		panel.add(comment1);
		

		
		
		
		
		String[] districtList = {"None","Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur",
"Kishoreganj","Madaripur","Manikganj","Mushiganj","Mymensingh",
"Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur",
"Sherrpur","Tangail","Bogra","Joypurhat","Naogaon","Natore",
"Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha",
"Kurigram","Lalmonirhat","Nilphamari","Panchagarc","Rangpur",
"Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", 
"Pirojpur", "Bandarban", "Brahmandaria", "Chandpur", "Chittagong", "Comilla", 
"Cox's Bazar","Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati",
"Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga",
"Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};
		
		
		district = new JComboBox(districtList);
		district.setBounds(320,180,100,25);
		district.setBackground(Color.WHITE);
		panel.add(district);
		String[] upzila2 = {"None"};
		upzila = new JComboBox(upzila2);
		upzila.setBounds(105,230,100,25);
		upzila.setBackground(Color.WHITE);
		panel.add(upzila);
		
		
		district.addActionListener(this);

			
		String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};
		
		
		JComboBox religion = new JComboBox(religion1);
		religion.setBounds(105,180,100,25);
		religion.setBackground(Color.WHITE);
		panel.add(religion);
		
		String[] ward1  = {"None","01","02","03","04","05","06","07","08","09"};
		JComboBox ward = new JComboBox(ward1);
		ward.setBounds(320,280,100,25);
		ward.setBackground(Color.WHITE);
		panel.add(ward);
		
		
		ButtonGroup group = new  ButtonGroup();
		
		
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(300,230,60,20);
		male.setBackground(Color.WHITE);
		panel.add(male);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(360,230,80,20);
		female.setBackground(Color.WHITE);
		panel.add(female);
		group.add(female);
		group.add(male);
		
		
		JButton submit = new JButton("Submit");
		submit.setBounds(320,420,100,25);
		submit.setBackground(Color.GREEN);
		panel.add(submit);
		
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File OldAge = new File("OldAge Allowance.txt");
				}
				catch (Exception e1) {
					System.out.println("File does not able to Write!");
				}
		
				
				
				String firstnamestring = first.getText();
				try {
					Cheek.NameCheek(firstnamestring);
					first.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						first.setBackground(Color.RED);
					}
				
				String lastnamestring = last.getText();
				try {
					Cheek.NameCheek(lastnamestring);
					last.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						last.setBackground(Color.RED);
					}
				
				
				String fathernamestring = fathername.getText();
				try {
				Cheek.NameCheek(fathernamestring);
				fathername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					fathername.setBackground(Color.RED);
				}
				
				
				String mothernamestring = mothername.getText();
				try {
				Cheek.NameCheek(mothernamestring);
				mothername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					mothername.setBackground(Color.RED);
				}
				
				
				 
				String nidstring = Nid.getText();
				try {
				Cheek.NID(nidstring);
				Nid.setBackground(Color.WHITE);
				Count++;
				
				}
				catch(Exception e1) {
					Nid.setBackground(Color.RED);
				}
				
				
				
				
				String unionstring = Union1.getText();
				try {
					Cheek.Union(unionstring);
					Union1.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						Union1.setBackground(Color.RED);
					}
				
				
				
				String mobilestring = mobile1.getText();
				try {
					Cheek.MobileNumber(mobilestring);
					mobile1.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e5) {
					mobile1.setBackground(Color.RED);
				}
				
				
				
				String District = district.getSelectedItem().toString();
				try {
					if(District.equals("None")) {
						district.setBackground(Color.RED);
					}
					else {
						district.setBackground(Color.WHITE);
						Count++;
					}
					
				}
				catch(Exception e6) {
					district.setBackground(Color.RED);
				}
				
				
				
				
				String UPZILA = upzila.getSelectedItem().toString();
				try {
					if(UPZILA.equals("None")) {
						upzila.setBackground(Color.RED);
					}
					else {
						upzila.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					upzila.setBackground(Color.RED);
				}
				
				
				
				
				String Religion = religion.getSelectedItem().toString();
				try {
					if(Religion.equals("None")) {
						religion.setBackground(Color.RED);
					}
					else {
						religion.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					religion.setBackground(Color.RED);
				}
				
				
				
				String Ward = ward.getSelectedItem().toString();
				try {
					if(Ward.equals("None")) {
						ward.setBackground(Color.RED);
					}
					else {
						ward.setBackground(Color.WHITE);  
						Count++;
					}
					
				}
				catch(Exception e6) {
					ward.setBackground(Color.RED);
				}
				
				String Gender1="none";
				try {
					if(male.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="Male";
						Count++;
						
					}
					else if(female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="FeMale";
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
				
				
				String Postoffice = postoffice1.getText();
				try {
					Cheek.NameCheek(Postoffice);
					postoffice1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						postoffice1.setBackground(Color.RED);
					}
				
				
				
				String Housestring = House1.getText();
				try {
					Cheek.NameCheek(Housestring);
					House1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						House1.setBackground(Color.RED);
					}
				
				String Commentstring = comment1.getText();
				try {
					if(Commentstring.isEmpty()) {
						Commentstring="None";
					}
					else {
						
					}
				}
				catch(Exception e8) {
					
				}
				
				
				
				
				
				
				String s = "---";
				
				try{
					
						FileWriter Input = new FileWriter("OldAge Allowance.txt", true);
						if(Count==14) {
								
								Input.write("\n");
								Input.write(nidstring);
								Input.write(s);
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(Gender1);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(Postoffice);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(Housestring);
								Input.write(s);
								Input.write(mobilestring);
								Input.write(s);
								Input.write(Commentstring);
								Input.close();
								JOptionPane.showMessageDialog(null, "Successfully Entry OldAge Alowance");
								HomePage window = new HomePage();
								dispose();
								window.setVisible(true);
								window.setBounds(5,5,450,650);
								window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								window.setTitle("Home Page ");
								window.setResizable(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Comfirm all information are correct!");
							}
					}
				catch(Exception e2) {
					
				}
						
						
					}
			
		});
		
		
		
		
		
	}

	


void Widow (){
		
		c2 = this.getContentPane();
		c2.setBackground(Color.GREEN);
		c2.setLayout(null);
		
		JPanel toppanel = new JPanel();
		toppanel.setBounds(0,0,450,135);
		c2.add(toppanel);
		toppanel.setBackground(Color.white);
		toppanel.setLayout(null);
		
		
		
		
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		
		JButton back = new JButton(Back);
		back.setBounds(10,20,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.WHITE);
		toppanel.add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Widow_AUSD window = new Widow_AUSD();
				dispose();
				window.setVisible(true);
				window.setBounds(5,5,450,650);
				window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				window.setTitle("Home Page ");
				window.setResizable(false);
				
			}
			
		});
		
		
		ImageIcon oldage = new ImageIcon("src/Image/widow.png");
		JLabel old = new JLabel(oldage);
		old.setBounds(180,40,65,65);
		toppanel.add(old);
		Font f2 = new Font("Times New Roman",Font.BOLD,18);
		JLabel oldageTitle = new JLabel("Entery Widow Allowance");
		oldageTitle.setBounds(110,105,250,20);
		toppanel.add(oldageTitle);
		oldageTitle.setFont(f2);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,125,450,490);
		panel.setBackground(Color.WHITE);
		c2.add(panel);

		
		
		Font f = new Font("Arial", Font.BOLD,13);
		Font f1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT,10);
		
		
		firstname = new JLabel("First Name:");
		firstname.setBounds(15,30,100,25);
		panel.add(firstname);
		firstname.setFont(f);
		
		lastname = new JLabel("Last Name:");
		lastname.setBounds(215,30,100,25);
		panel.add(lastname);
		lastname.setFont(f);
		
		JLabel father = new JLabel("Father Name:");
		father.setBounds(15,80,100,25);
		panel.add(father);
		father.setFont(f);
		
		JLabel mother = new JLabel("Mother Name:");
		mother.setBounds(215,80,100,25);
		panel.add(mother);
		mother.setFont(f);
		JLabel nid = new JLabel("NID *:");
		nid.setBounds(15,130,50,25);
		panel.add(nid);
		nid.setFont(f);
		
		JLabel dob = new JLabel("Entry Date:");
		dob.setBounds(215,130,100,25);
		panel.add(dob);
		dob.setFont(f);
		
		JLabel district1 = new JLabel("Religion:");
		district1.setBounds(15,180,100,25);
		panel.add(district1);
		district1.setFont(f);
		
		JLabel upzila1 = new JLabel("District:");
		upzila1.setBounds(215,180,100,25);
		panel.add(upzila1);
		upzila1.setFont(f);
		
		JLabel rligion2 = new JLabel("Upzila:");
		rligion2.setBounds(15,230,100,25);
		panel.add(rligion2);
		rligion2.setFont(f);
		
		JLabel Gender = new JLabel("Gender:");
		Gender.setBounds(215,230,100,25);
		panel.add(Gender);
		Gender.setFont(f);
		
		JLabel union = new JLabel("Union:");
		union.setBounds(15,280,100,25);
		panel.add(union);
		union.setFont(f);
		
		JLabel ward2 = new JLabel("Ward:");
		ward2.setBounds(215,280,100,25);
		panel.add(ward2);
		ward2.setFont(f);
		
		JLabel Mobile = new JLabel("Mobile No:");
		Mobile.setBounds(15,330,100,20);
		panel.add(Mobile);
		Mobile.setFont(f);
		
		
		JLabel postoffice = new JLabel("Post Office:");
		postoffice.setBounds(215,330,120,20);
		panel.add(postoffice);
		postoffice.setFont(f);
		

		JLabel house = new JLabel("House Name:");
		house.setBounds(15,380,100,25);
		panel.add(house);
		house.setFont(f);
		
		
		
		JLabel comment = new JLabel("Comment:");
		comment.setBounds(215,380,100,25);
		panel.add(comment);
		comment.setFont(f);
		
		Cheek  Cheek = new Cheek();
		
		
		first = new JTextField();
		first.setBounds(105,30,100,25);
		panel.add(first);
		
		
		
		last = new JTextField();
		last.setBounds(320,30,100,25);
		panel.add(last);
		
		
		fathername = new JTextField();
		fathername.setBounds(105,80,100,25);
		panel.add(fathername);
		
		
		mothername = new JTextField();
		mothername.setBounds(320,80,100,25);
		panel.add(mothername);

		
		Nid = new JTextField();
		Nid.setBounds(105,130,100,25);
		panel.add(Nid);
		
		
		calender = new JDateChooser();
		calender.setBounds(320,130,100,25);
		panel.add(calender);
		
		
		Union1 = new JTextField();
		Union1.setBounds(105,280,100,25);
		panel.add(Union1);
		
		
		mobile1 = new JTextField();
		mobile1.setBounds(105,330,100,25);
		panel.add(mobile1);
		
		
		postoffice1 = new JTextField();
		postoffice1.setBounds(320,330,100,25);
		panel.add(postoffice1);

	
		House1 = new JTextField();
		House1.setBounds(105,380,100,25);
		panel.add(House1);
		
		
		comment1 = new JTextField();
		comment1.setBounds(320,380,100,25);
		panel.add(comment1);
		
		
		
		String[] districtList = {"None","Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur",
"Kishoreganj","Madaripur","Manikganj","Mushiganj","Mymensingh",
"Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur",
"Sherrpur","Tangail","Bogra","Joypurhat","Naogaon","Natore",
"Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha",
"Kurigram","Lalmonirhat","Nilphamari","Panchagarc","Rangpur",
"Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", 
"Pirojpur", "Bandarban", "Brahmandaria", "Chandpur", "Chittagong", "Comilla", 
"Cox's Bazar","Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati",
"Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga",
"Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};
		
		
		district = new JComboBox(districtList);
		district.setBounds(320,180,100,25);
		district.setBackground(Color.WHITE);
		panel.add(district);
		String[] upzila2 = {"None"};
		upzila = new JComboBox(upzila2);
		upzila.setBounds(105,230,100,25);
		upzila.setBackground(Color.WHITE);
		panel.add(upzila);
		
		
		district.addActionListener(this);

			
		String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};
		
		
		JComboBox religion = new JComboBox(religion1);
		religion.setBounds(105,180,100,25);
		religion.setBackground(Color.WHITE);
		panel.add(religion);
		
		String[] ward1  = {"None","01","02","03","04","05","06","07","08","09"};
		JComboBox ward = new JComboBox(ward1);
		ward.setBounds(320,280,100,25);
		ward.setBackground(Color.WHITE);
		panel.add(ward);
		
		
		ButtonGroup group = new  ButtonGroup();
		
		
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(300,230,60,20);
		male.setBackground(Color.WHITE);
		panel.add(male);
		//male.setBackground(Color.RED);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(360,230,80,20);
		female.setBackground(Color.WHITE);
		panel.add(female);
		group.add(female);
		group.add(male);
		
		
		JButton submit = new JButton("Submit");
		submit.setBounds(320,420,100,25);
		submit.setBackground(Color.GREEN);
		panel.add(submit);
		
				submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File OldAge = new File("Widow Allowance.txt");
				}
				catch (Exception e1) {
					System.out.println("File does not able to Write!");
				}
		
				
				
				String firstnamestring = first.getText();
				try {
					Cheek.NameCheek(firstnamestring);
					first.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						first.setBackground(Color.RED);
					}
				
				String lastnamestring = last.getText();
				try {
					Cheek.NameCheek(lastnamestring);
					last.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						last.setBackground(Color.RED);
					}
				
				
				String fathernamestring = fathername.getText();
				try {
				Cheek.NameCheek(fathernamestring);
				fathername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					fathername.setBackground(Color.RED);
				}
				
				
				String mothernamestring = mothername.getText();
				try {
				Cheek.NameCheek(mothernamestring);
				mothername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					mothername.setBackground(Color.RED);
				}
				
				
				 
				String nidstring = Nid.getText();
				try {
				Cheek.NID(nidstring);
				Nid.setBackground(Color.WHITE);
				Count++;
				
				}
				catch(Exception e1) {
					Nid.setBackground(Color.RED);
				}
				
				
				
				
				String unionstring = Union1.getText();
				try {
					Cheek.Union(unionstring);
					Union1.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						Union1.setBackground(Color.RED);
					}
				
				
				
				String mobilestring = mobile1.getText();
				try {
					Cheek.MobileNumber(mobilestring);
					mobile1.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e5) {
					mobile1.setBackground(Color.RED);
				}
				
				
				
				String District = district.getSelectedItem().toString();
				try {
					if(District.equals("None")) {
						district.setBackground(Color.RED);
					}
					else {
						district.setBackground(Color.WHITE);
						Count++;
					}
					
				}
				catch(Exception e6) {
					district.setBackground(Color.RED);
				}
				
				
				
				
				String UPZILA = upzila.getSelectedItem().toString();
				try {
					if(UPZILA.equals("None")) {
						upzila.setBackground(Color.RED);
					}
					else {
						upzila.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					upzila.setBackground(Color.RED);
				}
				
				
				
				
				String Religion = religion.getSelectedItem().toString();
				try {
					if(Religion.equals("None")) {
						religion.setBackground(Color.RED);
					}
					else {
						religion.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					religion.setBackground(Color.RED);
				}
				
				
				
				String Ward = ward.getSelectedItem().toString();
				try {
					if(Ward.equals("None")) {
						ward.setBackground(Color.RED);
					}
					else {
						ward.setBackground(Color.WHITE);  
						Count++;
					}
					
				}
				catch(Exception e6) {
					ward.setBackground(Color.RED);
				}
				
				String Gender1="none";
				try {
					if(male.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="Male";
						Count++;
						
					}
					else if(female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="FeMale";
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
				
				
				String Postoffice = postoffice1.getText();
				try {
					Cheek.NameCheek(Postoffice);
					postoffice1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						postoffice1.setBackground(Color.RED);
					}
				
				
				
				String Housestring = House1.getText();
				try {
					Cheek.NameCheek(Housestring);
					House1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						House1.setBackground(Color.RED);
					}
				
				String Commentstring = comment1.getText();
				try {
					if(Commentstring.isEmpty()) {
						Commentstring="None";
					}
					else {
						
					}
				}
				catch(Exception e8) {
					
				}
				
				
				
				
				
				
				String s = "---";
				
				try{
					
						FileWriter Input = new FileWriter("Widow Allowance.txt", true);
						if(Count==14) {
								
								Input.write("\n");
								Input.write(nidstring);
								Input.write(s);
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(Gender1);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(Postoffice);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(Housestring);
								Input.write(s);
								Input.write(mobilestring);
								Input.write(s);
								Input.write(Commentstring);
								Input.close();
								JOptionPane.showMessageDialog(null, "Successfully Entry OldAge Alowance");
								HomePage window = new HomePage();
								dispose();
								window.setVisible(true);
								window.setBounds(5,5,450,650);
								window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								window.setTitle("Home Page ");
								window.setResizable(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Comfirm all information are correct!");
							}
					}
				catch(Exception e2) {
					
				}
						
						
					}
			
		});
		
		
		
		
	}


	

void Motherhood(){
	
	c2 = this.getContentPane();
	c2.setBackground(Color.GREEN);
	c2.setLayout(null);
	
	JPanel toppanel = new JPanel();
	toppanel.setBounds(0,0,450,135);
	c2.add(toppanel);
	toppanel.setBackground(Color.white);
	toppanel.setLayout(null);
	
	
	
	
	ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
	
	JButton back = new JButton(Back);
	back.setBounds(10,20,50,20);
	back.setBorderPainted(false);
	back.setBackground(Color.WHITE);
	toppanel.add(back);
	
	back.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			Motherhood_AUSD window = new Motherhood_AUSD();
			dispose();
			window.setVisible(true);
			window.setBounds(5,5,450,650);
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setTitle("Home Page ");
			window.setResizable(false);
			
		}
		
	});
	
	
	ImageIcon oldage = new ImageIcon("src/Image/mother.png");
	JLabel old = new JLabel(oldage);
	old.setBounds(180,40,65,65);
	toppanel.add(old);
	Font f2 = new Font("Times New Roman",Font.BOLD,18);
	JLabel oldageTitle = new JLabel("Entery Motherhood Allowance");
	oldageTitle.setBounds(110,105,250,20);
	toppanel.add(oldageTitle);
	oldageTitle.setFont(f2);
	
	
	
	JPanel panel = new JPanel();
	panel.setLayout(null);
	panel.setBounds(0,125,450,490);
	panel.setBackground(Color.WHITE);
	c2.add(panel);

	
	
	Font f = new Font("Arial", Font.BOLD,13);
	Font f1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT,10);
	
	
	firstname = new JLabel("First Name:");
	firstname.setBounds(15,30,100,25);
	panel.add(firstname);
	firstname.setFont(f);
	
	lastname = new JLabel("Last Name:");
	lastname.setBounds(215,30,100,25);
	panel.add(lastname);
	lastname.setFont(f);
	
	JLabel father = new JLabel("Father Name:");
	father.setBounds(15,80,100,25);
	panel.add(father);
	father.setFont(f);
	
	JLabel mother = new JLabel("Mother Name:");
	mother.setBounds(215,80,100,25);
	panel.add(mother);
	mother.setFont(f);
	JLabel nid = new JLabel("NID *:");
	nid.setBounds(15,130,50,25);
	panel.add(nid);
	nid.setFont(f);
	
	JLabel dob = new JLabel("Entry Date:");
	dob.setBounds(215,130,100,25);
	panel.add(dob);
	dob.setFont(f);
	
	JLabel district1 = new JLabel("Religion:");
	district1.setBounds(15,180,100,25);
	panel.add(district1);
	district1.setFont(f);
	
	JLabel upzila1 = new JLabel("District:");
	upzila1.setBounds(215,180,100,25);
	panel.add(upzila1);
	upzila1.setFont(f);
	
	JLabel rligion2 = new JLabel("Upzila:");
	rligion2.setBounds(15,230,100,25);
	panel.add(rligion2);
	rligion2.setFont(f);
	
	JLabel Gender = new JLabel("Gender:");
	Gender.setBounds(215,230,100,25);
	panel.add(Gender);
	Gender.setFont(f);
	
	JLabel union = new JLabel("Union:");
	union.setBounds(15,280,100,25);
	panel.add(union);
	union.setFont(f);
	
	JLabel ward2 = new JLabel("Ward:");
	ward2.setBounds(215,280,100,25);
	panel.add(ward2);
	ward2.setFont(f);
	
	JLabel Mobile = new JLabel("Mobile No:");
	Mobile.setBounds(15,330,100,20);
	panel.add(Mobile);
	Mobile.setFont(f);
	
	
	JLabel postoffice = new JLabel("Post Office:");
	postoffice.setBounds(215,330,120,20);
	panel.add(postoffice);
	postoffice.setFont(f);
	

	JLabel house = new JLabel("House Name:");
	house.setBounds(15,380,100,25);
	panel.add(house);
	house.setFont(f);
	
	
	
	JLabel comment = new JLabel("Comment:");
	comment.setBounds(215,380,100,25);
	panel.add(comment);
	comment.setFont(f);
	
	
	Cheek  Cheek = new Cheek();
	
	
	first = new JTextField();
	first.setBounds(105,30,100,25);
	panel.add(first);
	
	
	
	last = new JTextField();
	last.setBounds(320,30,100,25);
	panel.add(last);
	
	
	fathername = new JTextField();
	fathername.setBounds(105,80,100,25);
	panel.add(fathername);
	
	
	mothername = new JTextField();
	mothername.setBounds(320,80,100,25);
	panel.add(mothername);

	
	Nid = new JTextField();
	Nid.setBounds(105,130,100,25);
	panel.add(Nid);
	
	
	calender = new JDateChooser();
	calender.setBounds(320,130,100,25);
	panel.add(calender);
	
	
	Union1 = new JTextField();
	Union1.setBounds(105,280,100,25);
	panel.add(Union1);
	
	
	mobile1 = new JTextField();
	mobile1.setBounds(105,330,100,25);
	panel.add(mobile1);
	
	
	postoffice1 = new JTextField();
	postoffice1.setBounds(320,330,100,25);
	panel.add(postoffice1);


	House1 = new JTextField();
	House1.setBounds(105,380,100,25);
	panel.add(House1);
	
	
	comment1 = new JTextField();
	comment1.setBounds(320,380,100,25);
	panel.add(comment1);
	
	
	
	
	
	String[] districtList = {"None","Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur",
"Kishoreganj","Madaripur","Manikganj","Mushiganj","Mymensingh",
"Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur",
"Sherrpur","Tangail","Bogra","Joypurhat","Naogaon","Natore",
"Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha",
"Kurigram","Lalmonirhat","Nilphamari","Panchagarc","Rangpur",
"Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", 
"Pirojpur", "Bandarban", "Brahmandaria", "Chandpur", "Chittagong", "Comilla", 
"Cox's Bazar","Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati",
"Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga",
"Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};
	
	
	district = new JComboBox(districtList);
	district.setBounds(320,180,100,25);
	district.setBackground(Color.WHITE);
	panel.add(district);
	String[] upzila2 = {"None"};
	upzila = new JComboBox(upzila2);
	upzila.setBounds(105,230,100,25);
	upzila.setBackground(Color.WHITE);
	panel.add(upzila);
	
	
	district.addActionListener(this);

		
	String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};
	
	
	JComboBox religion = new JComboBox(religion1);
	religion.setBounds(105,180,100,25);
	religion.setBackground(Color.WHITE);
	panel.add(religion);
	
	String[] ward1  = {"None","01","02","03","04","05","06","07","08","09"};
	JComboBox ward = new JComboBox(ward1);
	ward.setBounds(320,280,100,25);
	ward.setBackground(Color.WHITE);
	panel.add(ward);
	
	
	ButtonGroup group = new  ButtonGroup();
	
	
	
	JRadioButton male = new JRadioButton("Male");
	male.setBounds(300,230,60,20);
	male.setBackground(Color.WHITE);
	panel.add(male);
	
	JRadioButton female = new JRadioButton("Female");
	female.setBounds(360,230,80,20);
	female.setBackground(Color.WHITE);
	panel.add(female);
	group.add(female);
	group.add(male);
	
	
	JButton submit = new JButton("Submit");
	submit.setBounds(320,420,100,25);
	submit.setBackground(Color.GREEN);
	panel.add(submit);
	
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File OldAge = new File("Motherhood Allowance.txt");
				}
				catch (Exception e1) {
					System.out.println("File does not able to Write!");
				}
		
				
				
				String firstnamestring = first.getText();
				try {
					Cheek.NameCheek(firstnamestring);
					first.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						first.setBackground(Color.RED);
					}
				
				String lastnamestring = last.getText();
				try {
					Cheek.NameCheek(lastnamestring);
					last.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						last.setBackground(Color.RED);
					}
				
				
				String fathernamestring = fathername.getText();
				try {
				Cheek.NameCheek(fathernamestring);
				fathername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					fathername.setBackground(Color.RED);
				}
				
				
				String mothernamestring = mothername.getText();
				try {
				Cheek.NameCheek(mothernamestring);
				mothername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					mothername.setBackground(Color.RED);
				}
				
				
				 
				String nidstring = Nid.getText();
				try {
				Cheek.NID(nidstring);
				Nid.setBackground(Color.WHITE);
				Count++;
				
				}
				catch(Exception e1) {
					Nid.setBackground(Color.RED);
				}
				
				
				
				
				String unionstring = Union1.getText();
				try {
					Cheek.Union(unionstring);
					Union1.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						Union1.setBackground(Color.RED);
					}
				
				
				
				String mobilestring = mobile1.getText();
				try {
					Cheek.MobileNumber(mobilestring);
					mobile1.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e5) {
					mobile1.setBackground(Color.RED);
				}
				
				
				
				String District = district.getSelectedItem().toString();
				try {
					if(District.equals("None")) {
						district.setBackground(Color.RED);
					}
					else {
						district.setBackground(Color.WHITE);
						Count++;
					}
					
				}
				catch(Exception e6) {
					district.setBackground(Color.RED);
				}
				
				
				
				
				String UPZILA = upzila.getSelectedItem().toString();
				try {
					if(UPZILA.equals("None")) {
						upzila.setBackground(Color.RED);
					}
					else {
						upzila.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					upzila.setBackground(Color.RED);
				}
				
				
				
				
				String Religion = religion.getSelectedItem().toString();
				try {
					if(Religion.equals("None")) {
						religion.setBackground(Color.RED);
					}
					else {
						religion.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					religion.setBackground(Color.RED);
				}
				
				
				
				String Ward = ward.getSelectedItem().toString();
				try {
					if(Ward.equals("None")) {
						ward.setBackground(Color.RED);
					}
					else {
						ward.setBackground(Color.WHITE);  
						Count++;
					}
					
				}
				catch(Exception e6) {
					ward.setBackground(Color.RED);
				}
				
				String Gender1="none";
				try {
					if(male.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="Male";
						Count++;
						
					}
					else if(female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="FeMale";
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
				
				
				String Postoffice = postoffice1.getText();
				try {
					Cheek.NameCheek(Postoffice);
					postoffice1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						postoffice1.setBackground(Color.RED);
					}
				
				
				
				String Housestring = House1.getText();
				try {
					Cheek.NameCheek(Housestring);
					House1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						House1.setBackground(Color.RED);
					}
				
				String Commentstring = comment1.getText();
				try {
					if(Commentstring.isEmpty()) {
						Commentstring="None";
					}
					else {
						
					}
				}
				catch(Exception e8) {
					
				}
				
				
				
				
				
				
				String s = "---";
				
				try{
					
						FileWriter Input = new FileWriter("Motherhood Allowance.txt", true);
						if(Count==14) {
								
								Input.write("\n");
								Input.write(nidstring);
								Input.write(s);
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(Gender1);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(Postoffice);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(Housestring);
								Input.write(s);
								Input.write(mobilestring);
								Input.write(s);
								Input.write(Commentstring);
								Input.close();
								JOptionPane.showMessageDialog(null, "Successfully Entry OldAge Alowance");
								HomePage window = new HomePage();
								dispose();
								window.setVisible(true);
								window.setBounds(5,5,450,650);
								window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								window.setTitle("Home Page ");
								window.setResizable(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Comfirm all information are correct!");
							}
					}
				catch(Exception e2) {
					
				}
						
						
					}
			
		});
		
		
	
	
	
}


	


void LameDuck(){

c2 = this.getContentPane();
c2.setBackground(Color.GREEN);
c2.setLayout(null);

JPanel toppanel = new JPanel();
toppanel.setBounds(0,0,450,135);
c2.add(toppanel);
toppanel.setBackground(Color.white);
toppanel.setLayout(null);




ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");

JButton back = new JButton(Back);
back.setBounds(10,20,50,20);
back.setBorderPainted(false);
back.setBackground(Color.WHITE);
toppanel.add(back);

back.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		LameDuck_AUSD window = new LameDuck_AUSD();
		dispose();
		window.setVisible(true);
		window.setBounds(5,5,450,650);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setTitle("Home Page ");
		window.setResizable(false);
		
	}
	
});


ImageIcon oldage = new ImageIcon("src/Image/crippled.png");
JLabel old = new JLabel(oldage);
old.setBounds(180,40,65,65);
toppanel.add(old);
Font f2 = new Font("Times New Roman",Font.BOLD,18);
JLabel oldageTitle = new JLabel("Entery Lame Duck Allowance");
oldageTitle.setBounds(110,105,250,20);
toppanel.add(oldageTitle);
oldageTitle.setFont(f2);



JPanel panel = new JPanel();
panel.setLayout(null);
panel.setBounds(0,125,450,490);
panel.setBackground(Color.WHITE);
c2.add(panel);



Font f = new Font("Arial", Font.BOLD,13);
Font f1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT,10);


firstname = new JLabel("First Name:");
firstname.setBounds(15,30,100,25);
panel.add(firstname);
firstname.setFont(f);

lastname = new JLabel("Last Name:");
lastname.setBounds(215,30,100,25);
panel.add(lastname);
lastname.setFont(f);

JLabel father = new JLabel("Father Name:");
father.setBounds(15,80,100,25);
panel.add(father);
father.setFont(f);

JLabel mother = new JLabel("Mother Name:");
mother.setBounds(215,80,100,25);
panel.add(mother);
mother.setFont(f);
JLabel nid = new JLabel("NID *:");
nid.setBounds(15,130,50,25);
panel.add(nid);
nid.setFont(f);

JLabel dob = new JLabel("Entry Date:");
dob.setBounds(215,130,100,25);
panel.add(dob);
dob.setFont(f);

JLabel district1 = new JLabel("Religion:");
district1.setBounds(15,180,100,25);
panel.add(district1);
district1.setFont(f);

JLabel upzila1 = new JLabel("District:");
upzila1.setBounds(215,180,100,25);
panel.add(upzila1);
upzila1.setFont(f);

JLabel rligion2 = new JLabel("Upzila:");
rligion2.setBounds(15,230,100,25);
panel.add(rligion2);
rligion2.setFont(f);

JLabel Gender = new JLabel("Gender:");
Gender.setBounds(215,230,100,25);
panel.add(Gender);
Gender.setFont(f);

JLabel union = new JLabel("Union:");
union.setBounds(15,280,100,25);
panel.add(union);
union.setFont(f);

JLabel ward2 = new JLabel("Ward:");
ward2.setBounds(215,280,100,25);
panel.add(ward2);
ward2.setFont(f);

JLabel Mobile = new JLabel("Mobile No:");
Mobile.setBounds(15,330,100,20);
panel.add(Mobile);
Mobile.setFont(f);


JLabel postoffice = new JLabel("Post Office:");
postoffice.setBounds(215,330,120,20);
panel.add(postoffice);
postoffice.setFont(f);


JLabel house = new JLabel("House Name:");
house.setBounds(15,380,100,25);
panel.add(house);
house.setFont(f);



JLabel comment = new JLabel("Comment:");
comment.setBounds(215,380,100,25);
panel.add(comment);
comment.setFont(f);



Cheek  Cheek = new Cheek();


first = new JTextField();
first.setBounds(105,30,100,25);
panel.add(first);



last = new JTextField();
last.setBounds(320,30,100,25);
panel.add(last);


fathername = new JTextField();
fathername.setBounds(105,80,100,25);
panel.add(fathername);


mothername = new JTextField();
mothername.setBounds(320,80,100,25);
panel.add(mothername);


Nid = new JTextField();
Nid.setBounds(105,130,100,25);
panel.add(Nid);


calender = new JDateChooser();
calender.setBounds(320,130,100,25);
panel.add(calender);


Union1 = new JTextField();
Union1.setBounds(105,280,100,25);
panel.add(Union1);


mobile1 = new JTextField();
mobile1.setBounds(105,330,100,25);
panel.add(mobile1);


postoffice1 = new JTextField();
postoffice1.setBounds(320,330,100,25);
panel.add(postoffice1);


House1 = new JTextField();
House1.setBounds(105,380,100,25);
panel.add(House1);


comment1 = new JTextField();
comment1.setBounds(320,380,100,25);
panel.add(comment1);




String[] districtList = {"None","Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur",
"Kishoreganj","Madaripur","Manikganj","Mushiganj","Mymensingh",
"Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur",
"Sherrpur","Tangail","Bogra","Joypurhat","Naogaon","Natore",
"Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha",
"Kurigram","Lalmonirhat","Nilphamari","Panchagarc","Rangpur",
"Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", 
"Pirojpur", "Bandarban", "Brahmandaria", "Chandpur", "Chittagong", "Comilla", 
"Cox's Bazar","Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati",
"Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga",
"Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};


district = new JComboBox(districtList);
district.setBounds(320,180,100,25);
district.setBackground(Color.WHITE);
panel.add(district);
String[] upzila2 = {"None"};
upzila = new JComboBox(upzila2);
upzila.setBounds(105,230,100,25);
upzila.setBackground(Color.WHITE);
panel.add(upzila);


district.addActionListener(this);

	
String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};


JComboBox religion = new JComboBox(religion1);
religion.setBounds(105,180,100,25);
religion.setBackground(Color.WHITE);
panel.add(religion);

String[] ward1  = {"None","01","02","03","04","05","06","07","08","09"};
JComboBox ward = new JComboBox(ward1);
ward.setBounds(320,280,100,25);
ward.setBackground(Color.WHITE);
panel.add(ward);


ButtonGroup group = new  ButtonGroup();



JRadioButton male = new JRadioButton("Male");
male.setBounds(300,230,60,20);
male.setBackground(Color.WHITE);
panel.add(male);

JRadioButton female = new JRadioButton("Female");
female.setBounds(360,230,80,20);
female.setBackground(Color.WHITE);
panel.add(female);
group.add(female);
group.add(male);


JButton submit = new JButton("Submit");
submit.setBounds(320,420,100,25);
submit.setBackground(Color.GREEN);
panel.add(submit);


		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File OldAge = new File("LameDuck Allowance.txt");
				}
				catch (Exception e1) {
					System.out.println("File does not able to Write!");
				}
		
				
				
				String firstnamestring = first.getText();
				try {
					Cheek.NameCheek(firstnamestring);
					first.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						first.setBackground(Color.RED);
					}
				
				String lastnamestring = last.getText();
				try {
					Cheek.NameCheek(lastnamestring);
					last.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						last.setBackground(Color.RED);
					}
				
				
				String fathernamestring = fathername.getText();
				try {
				Cheek.NameCheek(fathernamestring);
				fathername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					fathername.setBackground(Color.RED);
				}
				
				
				String mothernamestring = mothername.getText();
				try {
				Cheek.NameCheek(mothernamestring);
				mothername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					mothername.setBackground(Color.RED);
				}
				
				
				 
				String nidstring = Nid.getText();
				try {
				Cheek.NID(nidstring);
				Nid.setBackground(Color.WHITE);
				Count++;
				
				}
				catch(Exception e1) {
					Nid.setBackground(Color.RED);
				}
				
				
				
				
				String unionstring = Union1.getText();
				try {
					Cheek.Union(unionstring);
					Union1.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						Union1.setBackground(Color.RED);
					}
				
				
				
				String mobilestring = mobile1.getText();
				try {
					Cheek.MobileNumber(mobilestring);
					mobile1.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e5) {
					mobile1.setBackground(Color.RED);
				}
				
				
				
				String District = district.getSelectedItem().toString();
				try {
					if(District.equals("None")) {
						district.setBackground(Color.RED);
					}
					else {
						district.setBackground(Color.WHITE);
						Count++;
					}
					
				}
				catch(Exception e6) {
					district.setBackground(Color.RED);
				}
				
				
				
				
				String UPZILA = upzila.getSelectedItem().toString();
				try {
					if(UPZILA.equals("None")) {
						upzila.setBackground(Color.RED);
					}
					else {
						upzila.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					upzila.setBackground(Color.RED);
				}
				
				
				
				
				String Religion = religion.getSelectedItem().toString();
				try {
					if(Religion.equals("None")) {
						religion.setBackground(Color.RED);
					}
					else {
						religion.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					religion.setBackground(Color.RED);
				}
				
				
				
				String Ward = ward.getSelectedItem().toString();
				try {
					if(Ward.equals("None")) {
						ward.setBackground(Color.RED);
					}
					else {
						ward.setBackground(Color.WHITE);  
						Count++;
					}
					
				}
				catch(Exception e6) {
					ward.setBackground(Color.RED);
				}
				
				String Gender1="none";
				try {
					if(male.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="Male";
						Count++;
						
					}
					else if(female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="FeMale";
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
				
				
				String Postoffice = postoffice1.getText();
				try {
					Cheek.NameCheek(Postoffice);
					postoffice1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						postoffice1.setBackground(Color.RED);
					}
				
				
				
				String Housestring = House1.getText();
				try {
					Cheek.NameCheek(Housestring);
					House1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						House1.setBackground(Color.RED);
					}
				
				String Commentstring = comment1.getText();
				try {
					if(Commentstring.isEmpty()) {
						Commentstring="None";
					}
					else {
						
					}
				}
				catch(Exception e8) {
					
				}
				
				
				
				
				
				
				String s = "---";
				
				try{
					
						FileWriter Input = new FileWriter("LameDuck Allowance.txt", true);
						if(Count==14) {
								
								Input.write("\n");
								Input.write(nidstring);
								Input.write(s);
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(Gender1);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(Postoffice);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(Housestring);
								Input.write(s);
								Input.write(mobilestring);
								Input.write(s);
								Input.write(Commentstring);
								Input.close();
								JOptionPane.showMessageDialog(null, "Successfully Entry OldAge Alowance");
								HomePage window = new HomePage();
								dispose();
								window.setVisible(true);
								window.setBounds(5,5,450,650);
								window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								window.setTitle("Home Page ");
								window.setResizable(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Comfirm all information are correct!");
							}
					}
				catch(Exception e2) {
					
				}
						
						
					}
			
		});
		
		


}




void Fisherman(){

c2 = this.getContentPane();
c2.setBackground(Color.GREEN);
c2.setLayout(null);

JPanel toppanel = new JPanel();
toppanel.setBounds(0,0,450,135);
c2.add(toppanel);
toppanel.setBackground(Color.white);
toppanel.setLayout(null);




ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");

JButton back = new JButton(Back);
back.setBounds(10,20,50,20);
back.setBorderPainted(false);
back.setBackground(Color.WHITE);
toppanel.add(back);

back.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		Fisherman_AUSD window = new Fisherman_AUSD();
		dispose();
		window.setVisible(true);
		window.setBounds(5,5,450,650);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setTitle("Home Page ");
		window.setResizable(false);
		
	}
	
});


ImageIcon oldage = new ImageIcon("src/Image/fisherman.png");
JLabel old = new JLabel(oldage);
old.setBounds(180,40,65,65);
toppanel.add(old);
Font f2 = new Font("Times New Roman",Font.BOLD,18);
JLabel oldageTitle = new JLabel("Entery Fisherman Allowance");
oldageTitle.setBounds(110,105,250,20);
toppanel.add(oldageTitle);
oldageTitle.setFont(f2);



JPanel panel = new JPanel();
panel.setLayout(null);
panel.setBounds(0,125,450,490);
panel.setBackground(Color.WHITE);
c2.add(panel);



Font f = new Font("Arial", Font.BOLD,13);
Font f1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT,10);


firstname = new JLabel("First Name:");
firstname.setBounds(15,30,100,25);
panel.add(firstname);
firstname.setFont(f);

lastname = new JLabel("Last Name:");
lastname.setBounds(215,30,100,25);
panel.add(lastname);
lastname.setFont(f);

JLabel father = new JLabel("Father Name:");
father.setBounds(15,80,100,25);
panel.add(father);
father.setFont(f);

JLabel mother = new JLabel("Mother Name:");
mother.setBounds(215,80,100,25);
panel.add(mother);
mother.setFont(f);
JLabel nid = new JLabel("NID *:");
nid.setBounds(15,130,50,25);
panel.add(nid);
nid.setFont(f);

JLabel dob = new JLabel("Entry Date:");
dob.setBounds(215,130,100,25);
panel.add(dob);
dob.setFont(f);

JLabel district1 = new JLabel("Religion:");
district1.setBounds(15,180,100,25);
panel.add(district1);
district1.setFont(f);

JLabel upzila1 = new JLabel("District:");
upzila1.setBounds(215,180,100,25);
panel.add(upzila1);
upzila1.setFont(f);

JLabel rligion2 = new JLabel("Upzila:");
rligion2.setBounds(15,230,100,25);
panel.add(rligion2);
rligion2.setFont(f);

JLabel Gender = new JLabel("Gender:");
Gender.setBounds(215,230,100,25);
panel.add(Gender);
Gender.setFont(f);

JLabel union = new JLabel("Union:");
union.setBounds(15,280,100,25);
panel.add(union);
union.setFont(f);

JLabel ward2 = new JLabel("Ward:");
ward2.setBounds(215,280,100,25);
panel.add(ward2);
ward2.setFont(f);

JLabel Mobile = new JLabel("Mobile No:");
Mobile.setBounds(15,330,100,20);
panel.add(Mobile);
Mobile.setFont(f);


JLabel postoffice = new JLabel("Post Office:");
postoffice.setBounds(215,330,120,20);
panel.add(postoffice);
postoffice.setFont(f);


JLabel house = new JLabel("House Name:");
house.setBounds(15,380,100,25);
panel.add(house);
house.setFont(f);



JLabel comment = new JLabel("Comment:");
comment.setBounds(215,380,100,25);
panel.add(comment);
comment.setFont(f);


Cheek  Cheek = new Cheek();


first = new JTextField();
first.setBounds(105,30,100,25);
panel.add(first);



last = new JTextField();
last.setBounds(320,30,100,25);
panel.add(last);


fathername = new JTextField();
fathername.setBounds(105,80,100,25);
panel.add(fathername);


mothername = new JTextField();
mothername.setBounds(320,80,100,25);
panel.add(mothername);


Nid = new JTextField();
Nid.setBounds(105,130,100,25);
panel.add(Nid);


calender = new JDateChooser();
calender.setBounds(320,130,100,25);
panel.add(calender);


Union1 = new JTextField();
Union1.setBounds(105,280,100,25);
panel.add(Union1);


mobile1 = new JTextField();
mobile1.setBounds(105,330,100,25);
panel.add(mobile1);


postoffice1 = new JTextField();
postoffice1.setBounds(320,330,100,25);
panel.add(postoffice1);


House1 = new JTextField();
House1.setBounds(105,380,100,25);
panel.add(House1);


comment1 = new JTextField();
comment1.setBounds(320,380,100,25);
panel.add(comment1);




String[] districtList = {"None","Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur",
"Kishoreganj","Madaripur","Manikganj","Mushiganj","Mymensingh",
"Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur",
"Sherrpur","Tangail","Bogra","Joypurhat","Naogaon","Natore",
"Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha",
"Kurigram","Lalmonirhat","Nilphamari","Panchagarc","Rangpur",
"Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", 
"Pirojpur", "Bandarban", "Brahmandaria", "Chandpur", "Chittagong", "Comilla", 
"Cox's Bazar","Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati",
"Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga",
"Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};


district = new JComboBox(districtList);
district.setBounds(320,180,100,25);
district.setBackground(Color.WHITE);
panel.add(district);
String[] upzila2 = {"None"};
upzila = new JComboBox(upzila2);
upzila.setBounds(105,230,100,25);
upzila.setBackground(Color.WHITE);
panel.add(upzila);


district.addActionListener(this);

	
String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};


JComboBox religion = new JComboBox(religion1);
religion.setBounds(105,180,100,25);
religion.setBackground(Color.WHITE);
panel.add(religion);

String[] ward1  = {"None","01","02","03","04","05","06","07","08","09"};
JComboBox ward = new JComboBox(ward1);
ward.setBounds(320,280,100,25);
ward.setBackground(Color.WHITE);
panel.add(ward);


ButtonGroup group = new  ButtonGroup();



JRadioButton male = new JRadioButton("Male");
male.setBounds(300,230,60,20);
male.setBackground(Color.WHITE);
panel.add(male);
//male.setBackground(Color.RED);
JRadioButton female = new JRadioButton("Female");
female.setBounds(360,230,80,20);
female.setBackground(Color.WHITE);
panel.add(female);
group.add(female);
group.add(male);


JButton submit = new JButton("Submit");
submit.setBounds(320,420,100,25);
submit.setBackground(Color.GREEN);
panel.add(submit);

submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File OldAge = new File("Fisherman Allowance.txt");
				}
				catch (Exception e1) {
					System.out.println("File does not able to Write!");
				}
		
				
				
				String firstnamestring = first.getText();
				try {
					Cheek.NameCheek(firstnamestring);
					first.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						first.setBackground(Color.RED);
					}
				
				String lastnamestring = last.getText();
				try {
					Cheek.NameCheek(lastnamestring);
					last.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						last.setBackground(Color.RED);
					}
				
				
				String fathernamestring = fathername.getText();
				try {
				Cheek.NameCheek(fathernamestring);
				fathername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					fathername.setBackground(Color.RED);
				}
				
				
				String mothernamestring = mothername.getText();
				try {
				Cheek.NameCheek(mothernamestring);
				mothername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					mothername.setBackground(Color.RED);
				}
				
				
				 
				String nidstring = Nid.getText();
				try {
				Cheek.NID(nidstring);
				Nid.setBackground(Color.WHITE);
				Count++;
				
				}
				catch(Exception e1) {
					Nid.setBackground(Color.RED);
				}
				
				
				
				
				String unionstring = Union1.getText();
				try {
					Cheek.Union(unionstring);
					Union1.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						Union1.setBackground(Color.RED);
					}
				
				
				
				String mobilestring = mobile1.getText();
				try {
					Cheek.MobileNumber(mobilestring);
					mobile1.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e5) {
					mobile1.setBackground(Color.RED);
				}
				
				
				
				String District = district.getSelectedItem().toString();
				try {
					if(District.equals("None")) {
						district.setBackground(Color.RED);
					}
					else {
						district.setBackground(Color.WHITE);
						Count++;
					}
					
				}
				catch(Exception e6) {
					district.setBackground(Color.RED);
				}
				
				
				
				
				String UPZILA = upzila.getSelectedItem().toString();
				try {
					if(UPZILA.equals("None")) {
						upzila.setBackground(Color.RED);
					}
					else {
						upzila.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					upzila.setBackground(Color.RED);
				}
				
				
				
				
				String Religion = religion.getSelectedItem().toString();
				try {
					if(Religion.equals("None")) {
						religion.setBackground(Color.RED);
					}
					else {
						religion.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					religion.setBackground(Color.RED);
				}
				
				
				
				String Ward = ward.getSelectedItem().toString();
				try {
					if(Ward.equals("None")) {
						ward.setBackground(Color.RED);
					}
					else {
						ward.setBackground(Color.WHITE);  
						Count++;
					}
					
				}
				catch(Exception e6) {
					ward.setBackground(Color.RED);
				}
				
				String Gender1="none";
				try {
					if(male.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="Male";
						Count++;
						
					}
					else if(female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="FeMale";
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
				
				
				String Postoffice = postoffice1.getText();
				try {
					Cheek.NameCheek(Postoffice);
					postoffice1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						postoffice1.setBackground(Color.RED);
					}
				
				
				
				String Housestring = House1.getText();
				try {
					Cheek.NameCheek(Housestring);
					House1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						House1.setBackground(Color.RED);
					}
				
				String Commentstring = comment1.getText();
				try {
					if(Commentstring.isEmpty()) {
						Commentstring="None";
					}
					else {
						
					}
				}
				catch(Exception e8) {
					
				}
				
				
				
				
				
				
				String s = "---";
				
				try{
					
						FileWriter Input = new FileWriter("Fisherman Allowance.txt", true);
						if(Count==14) {
								
								Input.write("\n");
								Input.write(nidstring);
								Input.write(s);
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(Gender1);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(Postoffice);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(Housestring);
								Input.write(s);
								Input.write(mobilestring);
								Input.write(s);
								Input.write(Commentstring);
								Input.close();
								JOptionPane.showMessageDialog(null, "Successfully Entry OldAge Alowance");
								HomePage window = new HomePage();
								dispose();
								window.setVisible(true);
								window.setBounds(5,5,450,650);
								window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								window.setTitle("Home Page ");
								window.setResizable(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Comfirm all information are correct!");
							}
					}
				catch(Exception e2) {
					
				}
						
						
					}
			
		});
		
		


}





void Other(){

c2 = this.getContentPane();
c2.setBackground(Color.GREEN);
c2.setLayout(null);

JPanel toppanel = new JPanel();
toppanel.setLayout(null);
toppanel.setBounds(0,0,450,135);
c2.add(toppanel);
toppanel.setBackground(Color.white);





ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");

JButton back = new JButton(Back);
back.setBounds(10,20,50,20);
back.setBorderPainted(false);
back.setBackground(Color.WHITE);
toppanel.add(back);

back.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		Other_AUSD window = new Other_AUSD();
		dispose();
		window.setVisible(true);
		window.setBounds(5,5,450,650);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setTitle("Home Page ");
		window.setResizable(false);
		
	}
	
});


ImageIcon oldage = new ImageIcon("src/Image/menu.png");
JLabel old = new JLabel(oldage);
old.setBounds(180,40,65,65);
toppanel.add(old);

Font f2 = new Font("Times New Roman",Font.BOLD,18);
JLabel oldageTitle = new JLabel("Entery Others Allowance");
oldageTitle.setBounds(110,105,250,20);
toppanel.add(oldageTitle);
oldageTitle.setFont(f2);



JPanel panel = new JPanel();
panel.setLayout(null);
panel.setBounds(0,125,450,490);
panel.setBackground(Color.WHITE);
c2.add(panel);



Font f = new Font("Arial", Font.BOLD,13);
Font f1 = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT,10);


firstname = new JLabel("First Name:");
firstname.setBounds(15,30,100,25);
panel.add(firstname);
firstname.setFont(f);

lastname = new JLabel("Last Name:");
lastname.setBounds(215,30,100,25);
panel.add(lastname);
lastname.setFont(f);

JLabel father = new JLabel("Father Name:");
father.setBounds(15,80,100,25);
panel.add(father);
father.setFont(f);

JLabel mother = new JLabel("Mother Name:");
mother.setBounds(215,80,100,25);
panel.add(mother);
mother.setFont(f);
JLabel nid = new JLabel("NID *:");
nid.setBounds(15,130,50,25);
panel.add(nid);
nid.setFont(f);

JLabel dob = new JLabel("Entry Date:");
dob.setBounds(215,130,100,25);
panel.add(dob);
dob.setFont(f);

JLabel district1 = new JLabel("Religion:");
district1.setBounds(15,180,100,25);
panel.add(district1);
district1.setFont(f);

JLabel upzila1 = new JLabel("District:");
upzila1.setBounds(215,180,100,25);
panel.add(upzila1);
upzila1.setFont(f);

JLabel rligion2 = new JLabel("Upzila:");
rligion2.setBounds(15,230,100,25);
panel.add(rligion2);
rligion2.setFont(f);

JLabel Gender = new JLabel("Gender:");
Gender.setBounds(215,230,100,25);
panel.add(Gender);
Gender.setFont(f);

JLabel union = new JLabel("Union:");
union.setBounds(15,280,100,25);
panel.add(union);
union.setFont(f);

JLabel ward2 = new JLabel("Ward:");
ward2.setBounds(215,280,100,25);
panel.add(ward2);
ward2.setFont(f);

JLabel Mobile = new JLabel("Mobile No:");
Mobile.setBounds(15,330,100,20);
panel.add(Mobile);
Mobile.setFont(f);


JLabel postoffice = new JLabel("Post Office:");
postoffice.setBounds(215,330,120,20);
panel.add(postoffice);
postoffice.setFont(f);


JLabel house = new JLabel("House Name:");
house.setBounds(15,380,100,25);
panel.add(house);
house.setFont(f);



JLabel comment = new JLabel("Comment:");
comment.setBounds(215,380,100,25);
panel.add(comment);
comment.setFont(f);


Cheek  Cheek = new Cheek();


first = new JTextField();
first.setBounds(105,30,100,25);
panel.add(first);



last = new JTextField();
last.setBounds(320,30,100,25);
panel.add(last);


fathername = new JTextField();
fathername.setBounds(105,80,100,25);
panel.add(fathername);


mothername = new JTextField();
mothername.setBounds(320,80,100,25);
panel.add(mothername);


Nid = new JTextField();
Nid.setBounds(105,130,100,25);
panel.add(Nid);


calender = new JDateChooser();
calender.setBounds(320,130,100,25);
panel.add(calender);


Union1 = new JTextField();
Union1.setBounds(105,280,100,25);
panel.add(Union1);


mobile1 = new JTextField();
mobile1.setBounds(105,330,100,25);
panel.add(mobile1);


postoffice1 = new JTextField();
postoffice1.setBounds(320,330,100,25);
panel.add(postoffice1);


House1 = new JTextField();
House1.setBounds(105,380,100,25);
panel.add(House1);


comment1 = new JTextField();
comment1.setBounds(320,380,100,25);
panel.add(comment1);



String[] districtList = {"None","Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur",
"Kishoreganj","Madaripur","Manikganj","Mushiganj","Mymensingh",
"Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur",
"Sherrpur","Tangail","Bogra","Joypurhat","Naogaon","Natore",
"Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha",
"Kurigram","Lalmonirhat","Nilphamari","Panchagarc","Rangpur",
"Thakurgaon", "Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", 
"Pirojpur", "Bandarban", "Brahmandaria", "Chandpur", "Chittagong", "Comilla", 
"Cox's Bazar","Feni", "Khagrachari", "Lakshmipur", "Noakhali", "Rangamati",
"Habiganj", "Maulvibazar", "Sunamganj", "Sylhet", "Bagerhat", "Chuadanga",
"Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura", "Meherpur", "Narail", "Satkhira"};


district = new JComboBox(districtList);
district.setBounds(320,180,100,25);
district.setBackground(Color.WHITE);
panel.add(district);
String[] upzila2 = {"None"};
upzila = new JComboBox(upzila2);
upzila.setBounds(105,230,100,25);
upzila.setBackground(Color.WHITE);
panel.add(upzila);


district.addActionListener(this);

	
String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};


JComboBox religion = new JComboBox(religion1);
religion.setBounds(105,180,100,25);
religion.setBackground(Color.WHITE);
panel.add(religion);

String[] ward1  = {"None","01","02","03","04","05","06","07","08","09"};
JComboBox ward = new JComboBox(ward1);
ward.setBounds(320,280,100,25);
ward.setBackground(Color.WHITE);
panel.add(ward);


ButtonGroup group = new  ButtonGroup();



JRadioButton male = new JRadioButton("Male");
male.setBounds(300,230,60,20);
male.setBackground(Color.WHITE);
panel.add(male);

JRadioButton female = new JRadioButton("Female");
female.setBounds(360,230,80,20);
female.setBackground(Color.WHITE);
panel.add(female);
group.add(female);
group.add(male);


JButton submit = new JButton("Submit");
submit.setBounds(320,420,100,25);
submit.setBackground(Color.GREEN);
panel.add(submit);


submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File OldAge = new File("Other Allowance.txt");
				}
				catch (Exception e1) {
					System.out.println("File does not able to Write!");
				}
		
				
				
				String firstnamestring = first.getText();
				try {
					Cheek.NameCheek(firstnamestring);
					first.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						first.setBackground(Color.RED);
					}
				
				String lastnamestring = last.getText();
				try {
					Cheek.NameCheek(lastnamestring);
					last.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						last.setBackground(Color.RED);
					}
				
				
				String fathernamestring = fathername.getText();
				try {
				Cheek.NameCheek(fathernamestring);
				fathername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					fathername.setBackground(Color.RED);
				}
				
				
				String mothernamestring = mothername.getText();
				try {
				Cheek.NameCheek(mothernamestring);
				mothername.setBackground(Color.WHITE);
				Count++;
				}
				catch(Exception e4) {
					mothername.setBackground(Color.RED);
				}
				
				
				 
				String nidstring = Nid.getText();
				try {
				Cheek.NID(nidstring);
				Nid.setBackground(Color.WHITE);
				Count++;
				
				}
				catch(Exception e1) {
					Nid.setBackground(Color.RED);
				}
				
				
				
				
				String unionstring = Union1.getText();
				try {
					Cheek.Union(unionstring);
					Union1.setBackground(Color.WHITE);
					Count++;
					}
					catch(Exception e4) {
						Union1.setBackground(Color.RED);
					}
				
				
				
				String mobilestring = mobile1.getText();
				try {
					Cheek.MobileNumber(mobilestring);
					mobile1.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e5) {
					mobile1.setBackground(Color.RED);
				}
				
				
				
				String District = district.getSelectedItem().toString();
				try {
					if(District.equals("None")) {
						district.setBackground(Color.RED);
					}
					else {
						district.setBackground(Color.WHITE);
						Count++;
					}
					
				}
				catch(Exception e6) {
					district.setBackground(Color.RED);
				}
				
				
				
				
				String UPZILA = upzila.getSelectedItem().toString();
				try {
					if(UPZILA.equals("None")) {
						upzila.setBackground(Color.RED);
					}
					else {
						upzila.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					upzila.setBackground(Color.RED);
				}
				
				
				
				
				String Religion = religion.getSelectedItem().toString();
				try {
					if(Religion.equals("None")) {
						religion.setBackground(Color.RED);
					}
					else {
						religion.setBackground(Color.WHITE); 
						Count++;
					}
					
				}
				catch(Exception e6) {
					religion.setBackground(Color.RED);
				}
				
				
				
				String Ward = ward.getSelectedItem().toString();
				try {
					if(Ward.equals("None")) {
						ward.setBackground(Color.RED);
					}
					else {
						ward.setBackground(Color.WHITE);  
						Count++;
					}
					
				}
				catch(Exception e6) {
					ward.setBackground(Color.RED);
				}
				
				String Gender1="none";
				try {
					if(male.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="Male";
						Count++;
						
					}
					else if(female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Gender1="FeMale";
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
				
				
				String Postoffice = postoffice1.getText();
				try {
					Cheek.NameCheek(Postoffice);
					postoffice1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						postoffice1.setBackground(Color.RED);
					}
				
				
				
				String Housestring = House1.getText();
				try {
					Cheek.NameCheek(Housestring);
					House1.setBackground(Color.WHITE);
					Count++;
					
					}
					catch(Exception e4) {
						House1.setBackground(Color.RED);
					}
				
				String Commentstring = comment1.getText();
				try {
					if(Commentstring.isEmpty()) {
						Commentstring="None";
					}
					else {
						
					}
				}
				catch(Exception e8) {
					
				}
				
				
				
				
				
				
				String s = "---";
				
				try{
					
						FileWriter Input = new FileWriter("Other Allowance.txt", true);
						if(Count==14) {
								
								Input.write("\n");
								Input.write(nidstring);
								Input.write(s);
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(Gender1);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(Postoffice);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(Housestring);
								Input.write(s);
								Input.write(mobilestring);
								Input.write(s);
								Input.write(Commentstring);
								Input.close();
								JOptionPane.showMessageDialog(null, "Successfully Entry OldAge Alowance");
								HomePage window = new HomePage();
								dispose();
								window.setVisible(true);
								window.setBounds(5,5,450,650);
								window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								window.setTitle("Home Page ");
								window.setResizable(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Comfirm all information are correct!");
							}
					}
				catch(Exception e2) {
					
				}
						
						
					}
			
		});
		
	


}


	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String up = district.getSelectedItem().toString();
		if(up.equals("Dhaka")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Adabor");
			upzila.addItem("Airport");
			upzila.addItem("Badda");
			upzila.addItem("Banani");
			upzila.addItem("Bangshal");
			upzila.addItem("Bhashatek");
			upzila.addItem("Cantonment");
			upzila.addItem("Chackbazar");
			upzila.addItem("Dakshin Khan");
			upzila.addItem("Darus-Salam");
			upzila.addItem("Demra");
			upzila.addItem("Dhanmondi");
			upzila.addItem("Dohar");
			upzila.addItem("Gandaria");
			upzila.addItem("Gulshan");
			upzila.addItem("Hatirjheel");
			upzila.addItem("Hazaribahg");
			upzila.addItem("Jattrabari");
			upzila.addItem("Kadamtoli");
			upzila.addItem("Kafrul");
			upzila.addItem("Kalabagan");
			upzila.addItem("Kamrangir Char");
			upzila.addItem("Keraniganj Model");
			upzila.addItem("Khilhaon");
			upzila.addItem("Khilkhet");
			upzila.addItem("Kotwali");
			upzila.addItem("Lalbag");
			upzila.addItem("Mirpur Model");
			upzila.addItem("Mohammadpur");
			upzila.addItem("Motijheel");
			upzila.addItem("Mugda");
			upzila.addItem("Nawabganj");
			upzila.addItem("New Market");
			upzila.addItem("Pallabi");
			upzila.addItem("Paltan Model");
			upzila.addItem("Ramna Model");
			upzila.addItem("Rampura");
			upzila.addItem("Rupnagar");
			upzila.addItem("Sabujbahag");
			upzila.addItem("Savar");
			upzila.addItem("Shah Ali");
			upzila.addItem("Shahbag");
			upzila.addItem("Shahjahanpur");
			upzila.addItem("Sher e Bangla Nagar");
			upzila.addItem("Shyampur");
			upzila.addItem("South Keranuganj");
			upzila.addItem("Sutrapur");
			upzila.addItem("Tejgaon");
			upzila.addItem("Tejhaon Industrial");
			upzila.addItem("Turag");
			upzila.addItem("Uttar Khan");
			upzila.addItem("Uttara East");
			upzila.addItem("Uttara West");
			upzila.addItem("Vatara");
			upzila.addItem("Wari");
			
		}
		else if(up.equals("Faridpur")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Alfadanga");
			upzila.addItem("Bhanga");
			upzila.addItem("Boalmari");
			upzila.addItem("Char Bhadrasan");
			upzila.addItem("Faridpur Sadar");
			upzila.addItem("Madukhali");
			upzila.addItem("Nagarkanda");
			upzila.addItem("Sadarpur");
			upzila.addItem("Saltha");
			
			
		}
		else if(up.equals("Gazipur")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Gazipur Sadar");
			upzila.addItem("Kaliakair");
			upzila.addItem("Kaliganj");
			upzila.addItem("Kapasia");
			upzila.addItem("Sreepur");
			upzila.addItem("Tongi");
			
			
		}
		else if(up.equals("Gopalganj")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Gopalganj Sadar");
			upzila.addItem("Kashiani");
			upzila.addItem("Kotalipara");
			upzila.addItem("Muksudpur");
			upzila.addItem("Tungi Para");
			
		}
		else if(up.equals("Jamalpur")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Bakshiganj");
			upzila.addItem("Dewanganj");
			upzila.addItem("Islampur");
			upzila.addItem("Jamalpur Sadar");
			upzila.addItem("Madarganj");
			upzila.addItem("Melandaha");
			upzila.addItem("Sarishabari");
		}
		else if(up.equals("Kishoreganj")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Austagram");
			upzila.addItem("Bajitpur");
			upzila.addItem("Bhairab");
			upzila.addItem("Hossenpur");
			upzila.addItem("Itna");
			upzila.addItem("Karimganj");
			upzila.addItem("Katiadi");
			upzila.addItem("Kishoreganj Sadar");
			upzila.addItem("Kuliar Char");
			upzila.addItem("Mithamoin");
			upzila.addItem("Nikli");
			upzila.addItem("Pakundia");
			upzila.addItem("Tarail");
			
			
		}
		else if(up.equals("Madaripur")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Madaripur Sadar");
			upzila.addItem("Kalkini");
			upzila.addItem("Rajoir");
			upzila.addItem("Shibchar");
			
		}
		else if(up.equals("Manikganj")) {
			upzila.removeAllItems();
			upzila.addItem("None");
			upzila.addItem("Daulatpur");
			upzila.addItem("Ghior");
			upzila.addItem("Harirampur");
			upzila.addItem("Manikganj Sadar");
			upzila.addItem("Saturia");
			upzila.addItem("Shibalaya");
			upzila.addItem("Singair");
			
			
		}
	
	
	}
	
	
	
	
}
