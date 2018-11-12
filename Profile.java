package brivago;

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

		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//setting app icon
		frame.setIconImage(brivagoicon.getImage());
	
		JButton mybook = new JButton("My Bookings");//profile button setup
		mybook.setBounds(1365,10,108,30);
		mybook.addActionListener(new BookingListener());
		frame.getContentPane().add(mybook);

		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		logout.addActionListener(new LogoutListener());
		frame.getContentPane().add(logout);
		ImageIcon image = new ImageIcon("power.jpg");
		logout.setIcon(image);
		
		JButton home = new JButton("Home");//profile button setup
		home.addActionListener(new HomeListener());
		home.setBounds(10,10,80,32);
		frame.getContentPane().add(home);		
		
		JLabel heading =new JLabel("PROFILE");
		heading.setBounds(500,100,300,50);
		Font font1 = new Font("Courier",Font.BOLD,25);
		heading.setFont(font1);
		heading.setForeground(Color.RED);
		frame.getContentPane().add(heading);
		
		Font font2 = new Font("serif",Font.BOLD,20);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(360,200,158,30);
		nameLabel.setFont(font2);
		frame.getContentPane().add(nameLabel);
		
		JTextField name = new JTextField(1000);
		name.setBounds(600,200,300,30);
		frame.getContentPane().add(name);
		name.setText("Ashish");
		
		JLabel dateOfBirthLabel = new JLabel("Date of Birth");
		dateOfBirthLabel.setBounds(360,270,158,30);
		dateOfBirthLabel.setFont(font2);
		frame.getContentPane().add(dateOfBirthLabel);
		
		JTextField dateOfBirth = new JTextField(1000);
		dateOfBirth.setBounds(600,270,300,30);
		frame.getContentPane().add(dateOfBirth);
		dateOfBirth.setText("02/01/1999");
		
		JLabel residentialAddressLabel = new JLabel("Residential Address");
		residentialAddressLabel.setBounds(360,340,240,30);
		residentialAddressLabel.setFont(font2);
		frame.getContentPane().add(residentialAddressLabel);
		
		JTextField residentialAddress = new JTextField(1000);
		residentialAddress.setBounds(600,340,300,30);
		frame.getContentPane().add(residentialAddress);
		residentialAddress.setText("Address");
		
		JLabel emailIdLabel = new JLabel("Email ID ");
		emailIdLabel.setBounds(360,410,158,30);
		emailIdLabel.setFont(font2);
		frame.getContentPane().add(emailIdLabel);
		
		JTextField emailId = new JTextField(1000);
		emailId.setBounds(600,410,300,30);
		frame.getContentPane().add(emailId);
		emailId.setText("example@example.com");
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(360,480,158,30);
		userNameLabel.setFont(font2);
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
