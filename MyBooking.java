import java.awt.*;
import javax.swing.*;
public class MyBooking 
{
	MyBooking()
	{
		JFrame jf=new JFrame("Brivago");
		jf.setSize(1920,1080);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		jf.setLayout(null);
		//Adding Image Icon to the template
		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");
		jf.setIconImage(brivagoicon.getImage());
		
		//Making two fonts for heading and body respectively
        Font font1=new Font("Verdana",Font.BOLD,24);
        Font font2=new Font("serif",Font.BOLD,18);
        
        //Making five labels for their respective fields 
		JLabel jl1=new JLabel("Date");
		jl1.setBounds(500,150,300,150);
		jl1.setFont(font2);
		jf.add(jl1);
		
		JLabel jl2=new JLabel("Day");
		jl2.setBounds(500,200,300,150);
		jl2.setFont(font2);
		jf.add(jl2);

		JLabel jl3=new JLabel("Hotel");
		jl3.setBounds(170,150,300,150);
		jl3.setFont(font2);
		jf.add(jl3);

		JLabel jl4=new JLabel("City");
		jl4.setBounds(170,200,300,150);
		jl4.setFont(font2);
		jf.add(jl4);

		JLabel jl5=new JLabel("My Bookings");
		jl5.setBounds(170,30,300,150);
		jl5.setFont(font1);
		jf.add(jl5);
		
		//Making 2 buttons to view and cancel booking
		JButton jb1=new JButton("View");
		jb1.setBounds(800,265,120,30);
		jf.add(jb1);
		
		JButton jb2=new JButton("Cancel");
		jb2.setBounds(920,265,120,30);
		jf.add(jb2);
	
		jf.revalidate();
		jf.repaint();	
	}	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {public void run() {new MyBooking();}});	
	}
}
