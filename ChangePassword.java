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

		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//setting app icon
		frame.setIconImage(brivagoicon.getImage());
	
		JButton profile = new JButton("Profile");//profile button setup
		profile.addActionListener(new ProfileListener());
		profile.setBounds(1405,10,77,30);
		frame.getContentPane().add(profile);

		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		logout.addActionListener(new LogoutListener());
		frame.getContentPane().add(logout);
		ImageIcon image = new ImageIcon("power.jpg");
		logout.setIcon(image);

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.addActionListener(new BookingListener());
		mybook.setBounds(1285,10, 108, 30);
		frame.getContentPane().add(mybook);
		
		JButton home = new JButton("Home");//profile button setup
		home.addActionListener(new HomeListener());
		home.setBounds(10,10,80,32);
		frame.getContentPane().add(home);

		JLabel changePasswordLabel = new JLabel("Change Password");
		changePasswordLabel.setBounds(600,330,300,30);
		Font font = new Font("Courier",Font.BOLD,25);
		changePasswordLabel.setFont(font); 
		changePasswordLabel.setForeground(Color.BLUE);
		frame.getContentPane().add(changePasswordLabel);
		
		JLabel newPasswordLabel = new JLabel("New Password");
		newPasswordLabel.setBounds(500,440,100,30);
		frame.getContentPane().add(newPasswordLabel);
		
		JPasswordField newPassword = new JPasswordField(1000);
		newPassword.setBounds(630,440,300,30);
		frame.getContentPane().add(newPassword);
		
		JLabel confirmPasswordLabel = new JLabel("Confirm Password");
		confirmPasswordLabel.setBounds(500,500,130,30);
		frame.getContentPane().add(confirmPasswordLabel);
		
		JPasswordField confirmPassword = new JPasswordField(1000);
		confirmPassword.setBounds(630,500,300,30);
		frame.getContentPane().add(confirmPassword);
		
		JButton changePassword =new JButton("Change Password");
		changePassword.setBounds(630,620,150,50);
		frame.getContentPane().add(changePassword);
		
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

	      changePassword.addActionListener(new ActionListener()
			{
		       public void actionPerformed(ActionEvent ae)
		       {
		    	 char[] s1 = confirmPassword.getPassword();
		   		 char[] s2 = newPassword.getPassword();
		   		  int k=0;
		   		 if(s1.length!=s2.length) {
		              System.out.print("ha");k=1;}
		   		 else 
		   		 {
		   			 for(int i=0;i<s1.length;i++)
		   				if(s1[i]!=s2[i]) {
		   					 k=1;break;
		   				}
		   		}
		   		 
		   		 if(k==0)
		   		 {
		   			 Profile p = new Profile();
		   					 try {
								p.gui();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		   		 }
		   		 else
		   		 {
		   			 JLabel la = new JLabel("re-enter password");
		   			 la.setBounds(600,530,150,50);
		   			 frame.add(la);
		   		 }
		    		 
		       }
		 });
			

		
		frame.revalidate();
		frame.repaint();
	}
}
