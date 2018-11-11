package ashish;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
class Profile
{
	public static void main(String args[]) throws IOException
	{
		Profile profile = new Profile();
		profile.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Brivago -> Profile");//setting background image
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);

		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//settin app icon
		frame.setIconImage(brivagoicon.getImage());
	
		JButton profile = new JButton("profile");//profile button setup
		profile.setBounds(1405,10,77,30);
		frame.getContentPane().add(profile);

		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		frame.getContentPane().add(logout);
		ImageIcon image = new ImageIcon("power.jpg");
		logout.setIcon(image);

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.setBounds(1285,10, 108, 30);
		frame.getContentPane().add(mybook);
		
		JLabel heading =new JLabel("PROFILE");
		heading.setBounds(500,100,300,50);
		Font font = new Font("Courier",Font.BOLD,25);
		heading.setFont(font);
		frame.getContentPane().add(heading);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(400,200,108,30);
		frame.getContentPane().add(nameLabel);
		
		JTextField name = new JTextField(1000);
		name.setBounds(600,200,300,30);
		frame.getContentPane().add(name);
		name.setText("Ashish");
		
		JLabel dateOfBirthLabel = new JLabel("Date of Birth");
		dateOfBirthLabel.setBounds(400,270,108,30);
		frame.getContentPane().add(dateOfBirthLabel);
		
		JTextField dateOfBirth = new JTextField(1000);
		dateOfBirth.setBounds(600,270,300,30);
		frame.getContentPane().add(dateOfBirth);
		dateOfBirth.setText("02/01/1999");
		
		JLabel residentialAddressLabel = new JLabel("Residential Address");
		residentialAddressLabel.setBounds(400,340,130,30);
		frame.getContentPane().add(residentialAddressLabel);
		
		
		JTextField residentialAddress = new JTextField(1000);
		residentialAddress.setBounds(600,340,300,30);
		frame.getContentPane().add(residentialAddress);
		residentialAddress.setText("Address");
		
		JLabel emailIdLabel = new JLabel("Email ID ");
		emailIdLabel.setBounds(400,410,108,30);
		
		frame.getContentPane().add(emailIdLabel);
		JTextField emailId = new JTextField(1000);
		emailId.setBounds(600,410,300,30);
		frame.getContentPane().add(emailId);
		emailId.setText("example@example.com");
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(400,480,108,30);
		frame.getContentPane().add(userNameLabel);
		
		JTextField userName = new JTextField(1000);
		userName.setBounds(600,480,300,30);
		frame.getContentPane().add(userName);
		userName.setText("Ashish0201");
		
		JButton changePassword = new JButton("Change Password");
		changePassword.setBounds(450,570,140,50);
		frame.getContentPane().add(changePassword);
	    
		JButton register = new JButton("Save");
		register.setBounds(650,570,140,50);
		frame.getContentPane().add(register);
		
		frame.revalidate();
		frame.repaint();
	}
}
