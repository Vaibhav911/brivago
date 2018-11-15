package brivago;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Random;
class MyBookingView
{
	public static void main(String args[]) throws IOException
	{
		MyBookingView basetemplate = new MyBookingView();
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
	
		JButton profile = new JButton("Profile");//profile button setup
		profile.setBounds(1405,10,77,30);
		profile.addActionListener(new ProfileListener());
		frame.getContentPane().add(profile);

		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		frame.getContentPane().add(logout);
		ImageIcon image = new ImageIcon("power.jpg");
		logout.addActionListener(new LogoutListener());
		logout.setIcon(image);

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.setBounds(1285,10, 108, 30);
		mybook.addActionListener(new BookingListener());
		frame.getContentPane().add(mybook);
		
		JLabel hotelLabel = new JLabel("Hotel");
		hotelLabel.setBounds(500,100,300,50);
		Font font = new Font("serif",Font.BOLD,50);
		hotelLabel.setFont(font);
		frame.getContentPane().add(hotelLabel);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setBounds(200,200,300,40);
		Font font1 = new Font("serif",Font.BOLD,30);
		cityLabel.setFont(font1); 
		frame.getContentPane().add(cityLabel);
		
		JLabel landmarkLabel = new JLabel("Landmark");
		landmarkLabel.setBounds(200,250,300,40);
		landmarkLabel.setFont(font1); 
		frame.getContentPane().add(landmarkLabel);
		
		JLabel wifiLabel = new JLabel("Wifi");
		wifiLabel.setBounds(200,300,300,40);
	//	Font font1 = new Font("serif",Font.BOLD,30);
		wifiLabel.setFont(font1); 
		frame.getContentPane().add(wifiLabel);
		
		JLabel taxiLabel = new JLabel("Taxi");
		taxiLabel.setBounds(200,350,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		taxiLabel.setFont(font1); 
		frame.getContentPane().add(taxiLabel);
		
		JLabel parkingLabel = new JLabel("Parking");
		parkingLabel.setBounds(200,400,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		parkingLabel.setFont(font1); 
		frame.getContentPane().add(parkingLabel);
		
		JLabel restaurantLabel = new JLabel("Restaurant");
		restaurantLabel.setBounds(600,200,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		restaurantLabel.setFont(font1); 
		frame.getContentPane().add(restaurantLabel);
		
		JLabel acLabel = new JLabel("AC");
		acLabel.setBounds(600,250,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		acLabel.setFont(font1); 
		frame.getContentPane().add(acLabel);
		
		JLabel compLabel = new JLabel("Complimentary Breakfast");
		compLabel.setBounds(600,300,800,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		compLabel.setFont(font1); 
		frame.getContentPane().add(compLabel);
		
		JLabel p1Label = new JLabel("Price");
		 p1Label.setBounds(600,350,300,40);
		 //Font font1 = new Font("serif",Font.BOLD,30);
	     p1Label.setFont(font1); 
		frame.getContentPane().add( p1Label);
		
		
		
		JLabel hotelName = new JLabel("Brivago");
		hotelName.setBounds(650,100,300,50);
		//Font font2 = new Font("serif",Font.BOLD,50);
		hotelName.setFont(font);
		frame.getContentPane().add(hotelName);
		
		JLabel cityName = new JLabel("ashish");
		cityName.setBounds(400,200,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		cityName.setFont(font1); 
		frame.getContentPane().add(cityName);
		
		JLabel landmarkName = new JLabel("ashish");
		landmarkName.setBounds(400,250,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		landmarkName.setFont(font1); 
		frame.getContentPane().add(landmarkName);
		
		JLabel wifiName = new JLabel("yes");
		wifiName.setBounds(400,300,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		wifiName.setFont(font1); 
		frame.getContentPane().add(wifiName);
		
		JLabel taxiName = new JLabel("yes");
		taxiName.setBounds(400,350,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		taxiName.setFont(font1); 
		frame.getContentPane().add(taxiName);
		
		JLabel parkingName = new JLabel("yes");
		parkingName.setBounds(400,400,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		parkingName.setFont(font1); 
		frame.getContentPane().add(parkingName);
		
		JLabel restaurantName = new JLabel("yes");
		restaurantName.setBounds(1000,200,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		restaurantName.setFont(font1); 
		frame.getContentPane().add(restaurantName);
		
		JLabel acName = new JLabel("yes");
		acName.setBounds(1000,250,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		acName.setFont(font1); 
		frame.getContentPane().add(acName);
		
		JLabel compName = new JLabel("yes");
		compName.setBounds(1000,300,80,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		compName.setFont(font1); 
		frame.getContentPane().add(compName);
		
		JLabel p1Name = new JLabel("1000");
		p1Name.setBounds(1000,350,300,40);
		//Font font1 = new Font("serif",Font.BOLD,30);
		p1Name.setFont(font1); 
		frame.getContentPane().add(p1Name);
		
		
		
		/*JLabel r1Name = new JLabel("1000");
		r1Name.setBounds(700,680,300,30);
		frame.getContentPane().add(r1Name);
		
		JLabel r2Name = new JLabel("1000");
		r2Name.setBounds(700,730,300,30);
		frame.getContentPane().add(r2Name);*/
		
		JButton back = new JButton("Back");//profile button setup
	    back.setBounds(10,10,80,32);
		frame.getContentPane().add(back);		
		
			
		
		Random random = new Random();
	      int randomInteger = random.nextInt(5)+1;
	      System.out.println(randomInteger);
	      
	      JButton advertisement= new JButton() ;
		  advertisement.setBounds(1135,100,400,700);
		  frame.getContentPane().add(advertisement);
			
	      
	      String link = null;
	      switch(randomInteger)
	      {
	          case 1:
	        	  ImageIcon image1=new  ImageIcon("add1.png"); 
	              advertisement.setIcon(image1);
	              link ="https://www.firstpost.com/shows/9-months/9-months-season-3-toddler-schooling-part-2-5394261.html";
	              break;
	          case 2:
	        	  ImageIcon image2=new  ImageIcon("add2.png"); 
	              advertisement.setIcon(image2);
	              link =" https://www.upwardly.in/en/sip-calculator?utm_source=Display&utm_medium=adwordsbanner&utm_campaign=SipCalculatorDisplayInMkt&gclid=EAIaIQobChMIwMjMi_3L3gIVhRZoCh3gQwxrEAEYASAAEgJ-8_D_BwE";
	              break;
	          case 3:
	        	  ImageIcon image3=new  ImageIcon("add3.png"); 
	              advertisement.setIcon(image3);
	              link ="https://practice.geeksforgeeks.org/courses/fork-cpp";
	              break;
	          case 4:
	        	  ImageIcon image4=new  ImageIcon("add4.png"); 
	              advertisement.setIcon(image4);
	              link ="https://www.amazon.in/Kindle-Paperwhite-Resolution-Display-Built/dp/B00QJDOEAO?_encoding=UTF8&*Version*=1&*entries*=0&portal-device-attributes=desktop&ref_=kindle_ams_gw_pc";
	              break;
	          case 5:
	        	  ImageIcon image5=new  ImageIcon("add5.png"); 
	              advertisement.setIcon(image5);
	              link =" http://events.computing.co.uk/itlfskytap";
	              break;
		
	     }
	      
      final String finalLink = link;
	      
	      advertisement.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						openWebpage(finalLink);
					}
					catch(Exception se)
					{
						se.printStackTrace();
					}
				}
				public void openWebpage(String urlString) {
				     try {
				       Desktop.getDesktop().browse(new URL(urlString).toURI());
				    	  } catch (Exception e) {
				    	        e.printStackTrace();
				    	    }
				  }
				
			});
	      
	      back.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						HotelDisplay hd = new HotelDisplay();
						hd.gui();
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
				  }
				
			});
	      
	      
			

		frame.revalidate();
		frame.repaint();
	}
}
