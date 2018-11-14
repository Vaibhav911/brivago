package ashish;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
class HotelView
{
	public static void main(String args[]) throws IOException
	{
		HotelView basetemplate = new HotelView();
		basetemplate.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Brivago");//setting background image
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
		
		JLabel hotelLabel = new JLabel("Hotel");
		hotelLabel.setBounds(500,100,300,50);
		Font font = new Font("Courier",Font.BOLD,25);
		hotelLabel.setFont(font);
		frame.getContentPane().add(hotelLabel);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setBounds(500,180,300,30);
		frame.getContentPane().add(cityLabel);
		
		JLabel landmarkLabel = new JLabel("Landmark");
		landmarkLabel.setBounds(500,230,300,30);
		frame.getContentPane().add(landmarkLabel);
		
		JLabel wifiLabel = new JLabel("Wifi");
		wifiLabel.setBounds(500,280,300,30);
		frame.getContentPane().add(wifiLabel);
		
		JLabel taxiLabel = new JLabel("Taxi");
		taxiLabel.setBounds(500,330,300,30);
		frame.getContentPane().add(taxiLabel);
		
		JLabel parkingLabel = new JLabel("Parking");
		parkingLabel.setBounds(500,380,300,30);
		frame.getContentPane().add(parkingLabel);
		
		JLabel restaurantLabel = new JLabel("Restaurant");
		restaurantLabel.setBounds(500,430,300,30);
		frame.getContentPane().add(restaurantLabel);
		
		JLabel acLabel = new JLabel("AC");
		acLabel.setBounds(500,480,300,30);
		frame.getContentPane().add(acLabel);
		
		JLabel compLabel = new JLabel("Complimentary Breakfast");
		compLabel.setBounds(500,530,300,30);
		frame.getContentPane().add(compLabel);
		
		JLabel p1Label = new JLabel("Price of Single Room");
		 p1Label.setBounds(500,580,300,30);
		frame.getContentPane().add( p1Label);
		
		JLabel p2Label = new JLabel("Price of Double Room");
		p2Label.setBounds(500,630,300,30);
		frame.getContentPane().add(p2Label);
		
		JLabel r1Label = new JLabel("Number of Single Rooms Left");
		r1Label.setBounds(500,680,300,30);
		frame.getContentPane().add(r1Label);
		
		JLabel r2Label = new JLabel("Number of Double Rooms Left");
		r2Label.setBounds(500,730,300,30);
		frame.getContentPane().add(r2Label);
		
		JLabel hotelName = new JLabel("ashish");
		hotelName.setBounds(600,100,300,50);
		Font font1 = new Font("Courier",Font.BOLD,25);
		hotelName.setFont(font1);
		frame.getContentPane().add(hotelName);
		
		JLabel cityName = new JLabel("ashish");
		cityName.setBounds(700,180,300,30);
		frame.getContentPane().add(cityName);
		
		JLabel landmarkName = new JLabel("ashish");
		landmarkName.setBounds(700,230,300,30);
		frame.getContentPane().add(landmarkName);
		
		JLabel wifiName = new JLabel("yes");
		wifiName.setBounds(700,280,300,30);
		frame.getContentPane().add(wifiName);
		
		JLabel taxiName = new JLabel("yes");
		taxiName.setBounds(700,330,300,30);
		frame.getContentPane().add(taxiName);
		
		JLabel parkingName = new JLabel("yes");
		parkingName.setBounds(700,380,300,30);
		frame.getContentPane().add(parkingName);
		
		JLabel restaurantName = new JLabel("yes");
		restaurantName.setBounds(700,430,300,30);
		frame.getContentPane().add(restaurantName);
		
		JLabel acName = new JLabel("yes");
		acName.setBounds(700,480,300,30);
		frame.getContentPane().add(acName);
		
		JLabel compName = new JLabel("yes");
		compName.setBounds(700,530,300,30);
		frame.getContentPane().add(compName);
		
		JLabel p1Name = new JLabel("1000");
		p1Name.setBounds(700,580,300,30);
		frame.getContentPane().add(p1Name);
		
		JLabel p2Name = new JLabel("1000");
		p2Name.setBounds(700,630,300,30);
		frame.getContentPane().add(p2Name);
		
		JLabel r1Name = new JLabel("1000");
		r1Name.setBounds(700,680,300,30);
		frame.getContentPane().add(r1Name);
		
		JLabel r2Name = new JLabel("1000");
		r2Name.setBounds(700,730,300,30);
		frame.getContentPane().add(r2Name);
		

		frame.revalidate();
		frame.repaint();
	}
}
