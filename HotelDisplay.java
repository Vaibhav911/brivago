package brivago;

import javax.swing.JScrollPane;
import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
class HotelDisplay
{
	JFrame frame;
	public static void main(String args[]) throws IOException
	{
		HotelDisplay basetemplate = new HotelDisplay();
		basetemplate.gui();
	}
	public void gui() throws IOException
	{
	    frame = new JFrame("Brivago");//setting background image
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);
		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//setting app icon
		frame.setIconImage(brivagoicon.getImage());
	
		JButton profile = new JButton("Profile");//profile button setup
		profile.setBounds(1405,10,77,30);
		profile.addActionListener(new ProfileListener());
		frame.getContentPane().add(profile);
		
		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		frame.getContentPane().add(logout);
		logout.addActionListener(new LogoutListener());
		ImageIcon image = new ImageIcon("power.jpg");
		logout.setIcon(image);

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.setBounds(1285,10, 108, 30);
		mybook.addActionListener(new BookingListener());
		frame.getContentPane().add(mybook);
		
		JLabel heading = new JLabel("Jaipur - Hotels");
		heading.setBounds(550,100,300,60);
		Font font = new Font("serif",Font.BOLD + Font.ITALIC,40);
		heading.setFont(font); 
		heading.setForeground(Color.ORANGE);
		frame.add(heading);
		
		JPanel panel1=new JPanel();  
        panel1.setBounds(240,200,840,180);
        panel1.setLayout(null);

        JLabel hotelName1 = new JLabel("Trident");
		hotelName1.setBounds(300,200,300,60);
		Font font1 = new Font("serif",Font.BOLD,50);
		hotelName1.setFont(font1); 
		hotelName1.setForeground(Color.BLUE);
		
		JLabel hotel1 = new JLabel("5 star - Hotel");
		hotel1.setBounds(300,250,300,60);
		Font font2 = new Font("serif",Font.BOLD,20);
		hotel1.setFont(font2); 
		
		JLabel city1 = new JLabel("Jaipur, Rajasthan, India");
		city1.setBounds(300,280,300,60);
		city1.setFont(font2); 
		
		JLabel rating1 = new JLabel("8.9");
		rating1.setBounds(300,320,300,60);
		rating1.setFont(font2); 
		rating1.setForeground(Color.YELLOW);
		
		JLabel price1 = new JLabel("Rs. 8000");
		price1.setBounds(800,200,300,60);
		Font font3 = new Font("serif",Font.BOLD,40);
		price1.setFont(font3); 
		price1.setForeground(Color.RED);
		
		JLabel temp = new JLabel("Per Night");
		temp.setBounds(800,240,300,60);
		temp.setFont(font2); 
		
		JButton view1 = new JButton("View Details");//mybooking button setup
		Font font4=new Font("serif",Font.BOLD,20); 
		view1.setBounds(800,320,200,40);
		view1.setBackground(Color.CYAN);
		view1.setFont(font4);
		frame.add(view1);
		
		frame.add(hotelName1);	
		frame.add(hotel1);
		frame.add(city1);
		frame.add(rating1);
		frame.add(price1);
		frame.add(temp);
        panel1.setBackground(new Color(0,60,0,60));
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        frame.add(panel1);
        
        JPanel panel2=new JPanel();  
        panel2.setBounds(240,400,840,180);  
        panel2.setLayout(null);
        
        JLabel hotelName2 = new JLabel("Lake Palace");
		hotelName2.setBounds(300,400,300,60);
		hotelName2.setFont(font1); 
		hotelName2.setForeground(Color.BLUE);
		
		JLabel hotel2 = new JLabel("7 star - Hotel");
		hotel2.setBounds(300,450,300,60);
		hotel2.setFont(font2); 
		
		JLabel city2 = new JLabel("Jaipur, Rajasthan, India");
		city2.setBounds(300,480,300,60);
		city2.setFont(font2); 
		
		JLabel rating2 = new JLabel("9.3");
		rating2.setBounds(300,520,300,60);
		rating2.setFont(font2); 
		rating2.setForeground(Color.YELLOW);
		
		JLabel price2 = new JLabel("Rs. 36000");
		price2.setBounds(800,400,300,60);
		price2.setFont(font3); 
		price2.setForeground(Color.RED);
		
		JLabel temp2 = new JLabel("Per Night");
		temp2.setBounds(800,440,300,60);
		temp2.setFont(font2); 
		
		JButton view2 = new JButton("View Details");//mybooking button setup
		view2.setBounds(800,520,200,40);
		view2.setBackground(Color.CYAN);
		view2.setFont(font4);
		frame.add(view2);
        
        frame.add(hotelName2);	
		frame.add(hotel2);
		frame.add(city2);
		frame.add(rating2);
		frame.add(price2);
		frame.add(temp2);
        panel2.setBackground(new Color(0,60,0,60));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        frame.add(panel2);
        
        JPanel panel3=new JPanel();  
        panel3.setBounds(240,600,840,180);
        panel3.setLayout(null);
        
        JLabel hotelName3 = new JLabel("Radisson Blu");
		hotelName3.setBounds(300,600,300,60);
		hotelName3.setFont(font1); 
		hotelName3.setForeground(Color.BLUE);
		
		JLabel hotel3 = new JLabel("4 star - Hotel");
		hotel3.setBounds(300,650,300,60);
		hotel3.setFont(font2); 
		
		JLabel city3 = new JLabel("Jaipur, Rajasthan, India");
		city3.setBounds(300,680,300,60);
		city3.setFont(font2); 
		
		JLabel rating3 = new JLabel("8.1");
		rating3.setBounds(300,720,300,60);
		rating3.setFont(font2); 
		rating3.setForeground(Color.YELLOW);
		
		JLabel price3 = new JLabel("Rs. 5000");
		price3.setBounds(800,600,300,60);
		price3.setFont(font3); 
		price3.setForeground(Color.RED);
		
		JLabel temp3 = new JLabel("Per Night");
		temp3.setBounds(800,640,300,60);
		temp3.setFont(font2); 
		
		JButton view3 = new JButton("View Details");//mybooking button setup 
		view3.setBounds(800,720,200,40);
		view3.setBackground(Color.CYAN);
		view3.setFont(font4);
		frame.add(view3);
        
        frame.add(hotelName3);	
		frame.add(hotel3);
		frame.add(city3);
		frame.add(rating3);
		frame.add(price3);
		frame.add(temp3);  
        panel3.setBackground(new Color(0,60,0,60));
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        frame.add(panel3);
        
        /*JPanel panel4=new JPanel();  
        panel4.setBounds(200,940,1000,200);    
        panel4.setBackground(Color.gray);
        frame.add(panel4);
     
        JPanel panel5=new JPanel();  
        panel5.setBounds(200,1180,1000,200);    
        panel5.setBackground(Color.gray);
        frame.add(panel5);
       */
        
        view1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
				HotelView hv=new HotelView();
				hv.gui();}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			  }
			
		});
        
        view2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
				HotelView hv=new HotelView();
				hv.gui();}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			  }
			
		});
        
        view3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
				HotelView hv=new HotelView();
				hv.gui();}
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
