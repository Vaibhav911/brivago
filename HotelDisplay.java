package ashish;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
class City1
{
	public static void main(String args[]) throws IOException
	{
		City1 basetemplate = new City1();
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
		
		JLabel heading = new JLabel("Hotels of city 1");
		heading.setBounds(620,120,300,30);
		Font font = new Font("Courier",Font.BOLD,25);
		heading.setFont(font); 
		frame.add(heading);
		
		
		JPanel panel1=new JPanel();  
        panel1.setBounds(200,220,1000,300);    
        panel1.setBackground(Color.gray);
        frame.add(panel1);
        
        JPanel panel2=new JPanel();  
        panel2.setBounds(200,460,1000,200);    
        panel2.setBackground(Color.gray);
        frame.add(panel2);
        
        JPanel panel3=new JPanel();  
        panel3.setBounds(200,700,1000,200);    
        panel3.setBackground(Color.gray);
        frame.add(panel3);
        
        JPanel panel4=new JPanel();  
        panel4.setBounds(200,940,1000,200);    
        panel4.setBackground(Color.gray);
        frame.add(panel4);
     
        JPanel panel5=new JPanel();  
        panel5.setBounds(200,1180,1000,200);    
        panel5.setBackground(Color.gray);
        frame.add(panel5);
       
		frame.revalidate();
		frame.repaint();
	}
}
