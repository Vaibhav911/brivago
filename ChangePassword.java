package ashish;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
class ChangePassword
{
	public static void main(String args[]) throws IOException
	{
		ChangePassword changePassword = new ChangePassword();
		changePassword.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Brivago -> Change Password");//setting background image
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

		JLabel changePasswordLabel = new JLabel("Change Password");
		changePasswordLabel.setBounds(600,330,300,30);
		Font font = new Font("Courier",Font.BOLD,25);
		changePasswordLabel.setFont(font); 
		frame.getContentPane().add(changePasswordLabel);
		
		JLabel oldPasswordLabel = new JLabel("Old Password");
		oldPasswordLabel.setBounds(500,410,100,30);
		frame.getContentPane().add(oldPasswordLabel);
		
		JPasswordField oldPassword = new JPasswordField(1000);
		oldPassword.setBounds(630,410,300,30);
		frame.getContentPane().add(oldPassword);
		
		JLabel newPasswordLabel = new JLabel("New Password");
		newPasswordLabel.setBounds(500,480,100,30);
		frame.getContentPane().add(newPasswordLabel);
		
		JPasswordField newPassword = new JPasswordField(1000);
		newPassword.setBounds(630,480,300,30);
		frame.getContentPane().add(newPassword);
		
		JLabel confirmPasswordLabel = new JLabel("Confirm Password");
		confirmPasswordLabel.setBounds(500,550,130,30);
		frame.getContentPane().add(confirmPasswordLabel);
		
		JPasswordField confirmPassword = new JPasswordField(1000);
		confirmPassword.setBounds(630,550,300,30);
		frame.getContentPane().add(confirmPassword);
		
		JButton changePassword =new JButton("Change Password");
		changePassword.setBounds(600,620,150,50);
		frame.getContentPane().add(changePassword);
		
		frame.revalidate();
		frame.repaint();
	}
}
