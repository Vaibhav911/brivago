package ashish;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

class Login
{
	public static void main(String args[]) throws IOException
	{
		Login login = new Login();
		login.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Brivago -> Login");//setting background image
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);

		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//setting app icon
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
		
		JLabel loginLabel = new JLabel("Login into Brivago");
		loginLabel.setBounds(620,170,300,30);
		Font font = new Font("Courier",Font.BOLD,25);
		loginLabel.setFont(font); 
		frame.getContentPane().add(loginLabel);
		
		JLabel userLabel = new JLabel(new ImageIcon("user.png"));
		userLabel.setBounds(650,240,220,220); 
		frame.getContentPane().add(userLabel);
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(500,540,100,30);
		frame.getContentPane().add(userNameLabel);
		
		JTextField userName = new JTextField(100); 
		userName.setBounds(600,540,300,30);
		frame.getContentPane().add(userName);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(500,610,100,30);
		frame.getContentPane().add(passwordLabel);
		
		JPasswordField password = new JPasswordField(1000);
		password.setBounds(600,610,300,30);
		frame.getContentPane().add(password);
		
		JButton login =new JButton("Login");
		login.setBounds(700,680,100,50);
		frame.getContentPane().add(login);
		
    frame.revalidate();
		frame.repaint();
	}
}
