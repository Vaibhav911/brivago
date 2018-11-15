package ashish;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.*;
class BookingConfirmation
{
	JPanel jp,jp2;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7;
	JLabel hotel_location,check_in_date,num_of_single_rooms,num_of_double_rooms,checkOutDate,AC,price;
	JButton book_button,back_button;
	
	public static void main(String args[]) throws IOException
	{
		BookingConfirmation basetemplate = new BookingConfirmation();
		basetemplate.gui();
	}
	public void gui() throws IOException
	{
		JFrame frame = new JFrame("Booking Confirmation");//setting background image
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);

		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");//settin app icon
		frame.setIconImage(brivagoicon.getImage());
	
		JButton home = new JButton("Home");//profile button setup
		home.addActionListener(new HomeListener());
		home.setBounds(10,10,80,32);
		frame.getContentPane().add(home);		
		
		JButton profile = new JButton("Profile");//profile button setup
		profile.setBounds(1405,10,77,30);
		profile.addActionListener(new ProfileListener());
		frame.getContentPane().add(profile);

		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		logout.addActionListener(new LogoutListener());
		frame.getContentPane().add(logout);
		ImageIcon image = new ImageIcon("power.jpg");
		logout.setIcon(image);

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.setBounds(1285,10, 108, 30);
		mybook.addActionListener(new BookingListener());
		frame.getContentPane().add(mybook);
		/**/
		
		jp=new JPanel();
		GridLayout gl=new GridLayout(7,2);
		jp.setLayout(gl);
		
		jl1=new JLabel("Hotel Location --");
		jl2=new JLabel("Check In Date  --");
		jl3=new JLabel("Num of Single Rooms  --");
		jl4=new JLabel("Num of Double Rooms  --");
		jl5=new JLabel("Check out date  --");
		jl6=new JLabel("AC/Non AC  --");
		jl7=new JLabel("Total Price  --");
		
		Font label_font=new Font("Calibri",Font.ITALIC+Font.BOLD, 24);
		jl1.setFont(label_font);
		jl2.setFont(label_font);
		jl3.setFont(label_font);
		jl4.setFont(label_font);
		jl5.setFont(label_font);
		jl6.setFont(label_font);
		jl7.setFont(label_font);
		
		hotel_location=new JLabel();
		check_in_date=new JLabel();
		num_of_single_rooms=new JLabel();
		num_of_double_rooms=new JLabel();
		checkOutDate=new JLabel();
		AC=new JLabel("Yes");
		price=new JLabel("800");
		
		Font label_font2=new Font("Serif",Font.BOLD, 24);
		hotel_location.setFont(label_font2);       	    hotel_location.setForeground (Color.BLUE);
		check_in_date.setFont(label_font2);				check_in_date.setForeground (Color.BLUE);
		num_of_single_rooms.setFont(label_font2);       num_of_single_rooms.setForeground (Color.BLUE);
		num_of_double_rooms.setFont(label_font2);       num_of_double_rooms.setForeground (Color.BLUE);
		checkOutDate.setFont(label_font2);             checkOutDate.setForeground (Color.BLUE);
		AC.setFont(label_font2);                        AC.setForeground (Color.BLUE);
		price.setFont(label_font2);                     price.setForeground (Color.BLUE);
		
		jp.add(jl1);	jp.add(hotel_location);
		jp.add(jl2);	jp.add(check_in_date);
		jp.add(jl3);	jp.add(num_of_single_rooms);
		jp.add(jl4);	jp.add(num_of_double_rooms);
		jp.add(jl5);	jp.add(checkOutDate);
		jp.add(jl6);	jp.add(AC);
		jp.add(jl7);	jp.add(price);
		
		  jp.setBackground(new Color(0,60,0,60));
		//jp.setOpaque(false);
	
		jp.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
		jp.setBounds(200,100,520,400);
		frame.getContentPane().add(jp);
		
		book_button=new JButton("Confirm Booking");
		book_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//jl.setText("Button One Pressed");
			}
		});
		book_button.setBounds(360,540,160,32);
		frame.getContentPane().add(book_button);
		
		

		/**/
		frame.revalidate();
		frame.repaint();
	}
	
}
