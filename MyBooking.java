package brivago;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;
public class MyBooking 
{
	public static void main(String args[]) throws IOException
	{
	    MyBooking booking =new MyBooking();
		booking.gui();
	}
	
	public void gui() throws IOException
	{
		JFrame frame=new JFrame("My Bookings");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);
		//Adding Image Icon to the template
		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");
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
		
		JButton home = new JButton("Home");//profile button setup
		home.addActionListener(new HomeListener());
		home.setBounds(10,10,80,32);
		frame.getContentPane().add(home);		
		
		//Making two fonts for heading and body respectively
        Font font1=new Font("Verdana",Font.BOLD,24);
        Font font2=new Font("serif",Font.BOLD,18);
        
        //Making five labels for their respective fields 
		JLabel dateLabel=new JLabel("Date");
		dateLabel.setBounds(500,150,300,150);
		dateLabel.setFont(font2);
		frame.add(dateLabel);
		
		JLabel dayLabel=new JLabel("Day");
		dayLabel.setBounds(500,200,300,150);
		dayLabel.setFont(font2);
		frame.add(dayLabel);

		JLabel hotelLabel=new JLabel("Hotel");
		hotelLabel.setBounds(170,150,300,150);
		hotelLabel.setFont(font2);
		frame.add(hotelLabel);

		JLabel cityLabel=new JLabel("City");
		cityLabel.setBounds(170,200,300,150);
		cityLabel.setFont(font2);
		frame.add(cityLabel);

		JLabel myBookingsLabel=new JLabel("My Bookings");
		myBookingsLabel.setBounds(170,30,300,150);
		myBookingsLabel.setFont(font1);
		frame.add(myBookingsLabel);
		
		//Making 2 buttons to view and cancel booking
		JButton viewButton=new JButton("View");
		viewButton.setBounds(800,265,120,30);
		frame.add(viewButton);
		
		JButton cancelButton=new JButton("Cancel");
		cancelButton.setBounds(920,265,120,30);
		frame.add(cancelButton);
	    
		
		frame.revalidate();
		frame.repaint();	
	}	
}
