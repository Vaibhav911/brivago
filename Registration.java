package brivago;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

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
		register.setBounds(500,700,100,50);
		frame.getContentPane().add(register);
		
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


		
		register.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent ae) 
		    {
		    	String s1 = name.getText();
		    	String s2 = dateOfBirth.getText();
		    	String s3 = residentialAddress.getText();
		    	String s4 = emailId.getText();
		    	String s5 = userName.getText();
		    	char[] s6 = password.getPassword();
		    	char[] s7 = confirmPassword.getPassword();
		    	
		    	for(int i=0;i<s6.length;i++)
		    	{
		    		if(!(Arrays.equals(password.getPassword(), confirmPassword.getPassword())))
		    	   {
		    			
		    			
		    			JLabel ha = new JLabel("Re-enter password");
		    			ha.setBounds(300,600,100,50);
		    			frame.add(ha);
		    			
		    		}
		    	}
		    	
		      
			}
		    
		 });
		
    frame.revalidate();
		frame.repaint(); 
	}
}
