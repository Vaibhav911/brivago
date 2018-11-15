package brivago;

import java.io.*;
import java.net.URL;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class WelcomePage
{
	
	public static void main(String[] args) throws IOException
	{
	    JFrame frame = new JFrame("Brivago-Welcome");//setting background image
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);

		Font font = new Font("Verdana", Font.BOLD, 24);//setting up welcome label
		JLabel welcome = new JLabel("Welcome to Brivago");
		welcome.setBounds(620,100,300,30);
		welcome.setFont(font);
		frame.getContentPane().add(welcome);

		JLabel userLabel = new JLabel(new ImageIcon("user.png"));
		userLabel.setBounds(650,240,220,220);
		frame.getContentPane().add(userLabel);

		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//settin app icon
		frame.setIconImage(brivagoicon.getImage());
	
		JButton login = new JButton("Login");		
		login.setBounds(660,500,80,30);
		frame.getContentPane().add(login);

		JButton signup = new JButton("Sign Up");
		signup.setBounds(760,500,100,30);
		frame.getContentPane().add(signup);
		
		JButton advertisement= new JButton() ;
		advertisement.setBounds(1135,100,400,700);
		frame.getContentPane().add(advertisement);
		
		Random random = new Random();
	      int randomInteger = random.nextInt(5)+1;
	      System.out.println(randomInteger);
	      
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

		
		login.addActionListener(new ActionListener()
			{
			    public void actionPerformed(ActionEvent ae) 
			    {
					try 
					{
						Login login = new Login();
						login.gui();
					}
					catch (IOException e) 
					{	
						e.printStackTrace();
					}
			    }
			 });
		signup.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent ae) 
		    {
				try 
				{
					Registration signup = new Registration();
					signup.gui();
				}
				catch (IOException e) 
				{	
					e.printStackTrace();
				}
		    }
		 });
		frame.revalidate();
		frame.repaint();	
	}
}
