import java.io.*;
import java.awt.*;
import javax.swing.*;
class WelcomePage
{
	gui() throws IOException
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

		frame.revalidate();
		frame.repaint();
			
	}
}
