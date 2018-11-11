package ashish;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

class Registration
{
	public static void main(String args[]) throws IOException
	{
		Registration register =new Registration();
		register.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Brivago_Registration");//setting background image
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);

		Font font2 = new Font("Courier",Font.BOLD,16);
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
		
		JLabel heading =new JLabel("Register on Brivago");
		heading.setBounds(400,100,300,50);
		Font font = new Font("Courier",Font.BOLD,25);
		heading.setFont(font);
		frame.getContentPane().add(heading);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(300,200,108,30);
		nameLabel.setFont(font2);
		frame.getContentPane().add(nameLabel);
		
		JTextField name = new JTextField(1000);
		name.setBounds(500,200,300,30);
		frame.getContentPane().add(name);
		
		JLabel dateOfBirthLabel = new JLabel("Date of Birth");
		dateOfBirthLabel.setBounds(300,270,140,30);
		dateOfBirthLabel.setFont(font2);
		frame.getContentPane().add(dateOfBirthLabel);
		
		JTextField dateOfBirth = new JTextField(1000);
		dateOfBirth.setBounds(500,270,300,30);
		TextPrompt tp7 = new TextPrompt("DD/MM/YYYY",dateOfBirth);
		tp7.changeStyle(Font.ITALIC );
		tp7.setForeground( Color.GRAY );
		frame.getContentPane().add(dateOfBirth);
	
    JLabel residentialAddressLabel = new JLabel("Residential Address");
		residentialAddressLabel.setBounds(300,340,200,30);
		residentialAddressLabel.setFont(font2);
		frame.getContentPane().add(residentialAddressLabel);
		
		JTextField residentialAddress = new JTextField(1000);
		residentialAddress.setBounds(500,340,300,30);
		frame.getContentPane().add(residentialAddress);
		
		JLabel emailIdLabel = new JLabel("Email ID ");
		emailIdLabel.setBounds(300,410,108,30);
		emailIdLabel.setFont(font2);
		frame.getContentPane().add(emailIdLabel);
		
		JTextField emailId = new JTextField(1000);
		emailId.setBounds(500,410,300,30);
		TextPrompt tp8 = new TextPrompt("Eg: example@example.com ",emailId);
		tp8.changeStyle(Font.ITALIC);
		tp8.setForeground( Color.GRAY );
		frame.getContentPane().add(emailId);
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(300,480,108,30);
		userNameLabel.setFont(font2);
		frame.getContentPane().add(userNameLabel);
		
		JTextField userName = new JTextField(1000);
		userName.setBounds(500,480,300,30);
		frame.getContentPane().add(userName);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(300,550,108,30);
		passwordLabel.setFont(font2);
		frame.getContentPane().add(passwordLabel);
		
		JPasswordField password = new JPasswordField(1000);
		password.setBounds(500,550,300,30);
		frame.getContentPane().add(password);
		
		JLabel confirmPasswordLabel = new JLabel("Confirm Password");
		confirmPasswordLabel.setBounds(300,620,200,30);
		confirmPasswordLabel.setFont(font2);
		frame.getContentPane().add(confirmPasswordLabel);
		
		JPasswordField confirmPassword = new JPasswordField(1000);
		confirmPassword.setBounds(500,620,300,30);
		frame.getContentPane().add(confirmPassword);
		
		JButton register = new JButton("Register");
		register.setBounds(740,700,100,50);
		frame.getContentPane().add(register);
		
    frame.revalidate();
		frame.repaint(); 
	}
}
