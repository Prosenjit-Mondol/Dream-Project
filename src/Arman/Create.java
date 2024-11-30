package Arman;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
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

public class Create extends JFrame{

	
	private Container c2;
	private JLabel firstname, lastname;
	private JTextField first, last,fathername,mothername, Nid,Union1,mobile1,mobile3;
	private JTextField user1,pass2,pass4;
	private JComboBox district, upzila;
	private JDateChooser calender;
	
	Create(){
		
		c2 = this.getContentPane();
		c2.setBackground(Color.WHITE);
		c2.setLayout(null);
		ImageIcon Back = new ImageIcon("src/Image/left-arrow.png");
		
		JButton back = new JButton(Back);
		back.setBounds(10,20,50,20);
		back.setBorderPainted(false);
		back.setBackground(Color.WHITE);
		c2.add(back);
		
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
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,30,450,580);
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
		
		JLabel dob = new JLabel("Date of Brith:");
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
		
		
		JLabel Mobile2 = new JLabel("Confirm Mobile:");
		Mobile2.setBounds(215,330,120,20);
		panel.add(Mobile2);
		Mobile2.setFont(f);
		

		JLabel user = new JLabel("Username:");
		user.setBounds(15,380,100,25);
		panel.add(user);
		user.setFont(f);
		
		
		
		JLabel pass = new JLabel("Password:");
		pass.setBounds(215,380,100,25);
		panel.add(pass);
		pass.setFont(f);
		
		JLabel pass1 = new JLabel("Confirm Password:");
		pass1.setBounds(210,430,150,25);
		panel.add(pass1);
		pass.setFont(f);
		
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
		
		
		mobile3 = new JTextField();
		mobile3.setBounds(320,330,100,25);
		panel.add(mobile3);

	
		user1 = new JTextField();
		user1.setBounds(105,380,100,25);
		panel.add(user1);
		
		
		pass2 = new JTextField();
		pass2.setBounds(320,380,100,25);
		panel.add(pass2);
		
		
		
		pass4 = new JTextField();
		pass4.setBounds(320,430,100,25);
		panel.add(pass4);
		
		
		
		
		
		
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
		
		
		//district.addActionListener(this);

			
		String[] religion1 = {"None","Islam","Hinduism","Buddhism","Christianity"};
		
		
		JComboBox religion = new JComboBox(religion1);  //religion ward male female
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
		submit.setBounds(310,500,100,25);
		submit.setBackground(Color.WHITE);
		panel.add(submit);
		
		
		JCheckBox cheek = new JCheckBox("I declare that the information provided above are correct.");
		cheek.setBounds(30,450,410,50);
		cheek.setBackground(Color.WHITE);
		panel.add(cheek);
		//cheek.addActionListener(this);
		
		
		district.addActionListener(new ActionListener() {

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
		});
		
		
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int Count =0;
				
				try {
				File createFile = new File("createAccount.txt");
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
				
				
				
				
				String confirmmobilestrig = mobile3.getText();
				try {
					Cheek.Confrimation(mobilestring, confirmmobilestrig);
					mobile3.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e6) {
					mobile3.setBackground(Color.RED);
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
				
				
				try {
					if(male.isSelected()||female.isSelected()) {
						Gender.setForeground(Color.BLACK);
						Count++;
					}
					else {
						Gender.setForeground(Color.RED);
						Count++;
					}
					
				}
				catch(Exception e6) {
					Gender.setBackground(Color.RED);
				}
				
				
		
				String passwordstring = pass2.getText();
				try {
					Cheek.passwordCheek(passwordstring);
					pass2.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e6) {
					pass2.setBackground(Color.RED);
					if(passwordstring.isEmpty()) {
						
					}else
						
					JOptionPane.showMessageDialog(null, "Password is Week!");
				}
				
				
				String confirmpasswordstring = pass4.getText();
				try {
					Cheek.Confrimation(passwordstring, confirmpasswordstring);
					pass4.setBackground(Color.WHITE);
					Count++;
				}
				catch(Exception e6) {
					pass4.setBackground(Color.RED);
				}
				
				

				
				
				String usernamestring = user1.getText();
				try {
					Cheek.UserCheek(usernamestring);
					String username = user1.getText();
					
					try{
						File userfile = new File("User.txt");
						Scanner input = new Scanner(userfile);
						while(input.hasNextLine()) {
						String takeuser = input.nextLine();
						String [] s2 = takeuser.split("---");
						String USER = s2[0];
						if(username.equals(USER)) {
							user1.setBackground(Color.red);
							Count=0;
						}
						}
						if(Count!=0) {
							Count++;
							user1.setBackground(Color.WHITE);
						}
							
					}
					catch(Exception e1) {
						System.out.println("User Cheek Problem!");
						
					}
				}
				catch(Exception e6) {
					user1.setBackground(Color.RED);
				}
				
				
				
				String s = "---";
				try{
					
						
						FileWriter Input = new FileWriter("createAccount.txt", true);
						if(Count==16) {
							if(cheek.isSelected()) {
								
								Input.write("\n");
								Input.write(firstnamestring);
								Input.write(s);
								Input.write(lastnamestring);
								Input.write(s);
								Input.write(fathernamestring);
								Input.write(s);
								Input.write(mothernamestring);
								Input.write(s);
								Input.write(nidstring);
								Input.write(s);
								Input.write(Religion);
								Input.write(s);
								Input.write(District);
								Input.write(s);
								Input.write(UPZILA);
								Input.write(s);
								Input.write(unionstring);
								Input.write(s);
								Input.write(Ward);
								Input.write(s);
								Input.write(mobilestring);
								Input.close();
								
								
								FileWriter UserInput = new FileWriter("User.txt", true);
								UserInput.write("\n");
								UserInput.write(usernamestring);
								UserInput.write(s);
								UserInput.write(passwordstring);
								UserInput.close();
								JOptionPane.showMessageDialog(null, "Your Account is Created Successfull.");
								
								
								Login window = new Login();
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
					
						
					
					
				}
				catch(Exception e2) {
					
				}
				
				
						
					}
			
		});
		
	}
	
}