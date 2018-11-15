package brivago;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

//TextPrompt added to display the temporary format of a text
class TextPrompt extends JLabel
implements FocusListener, DocumentListener
{
    public enum Show
  {
	  ALWAYS,
	  FOCUS_GAINED,
	  FOCUS_LOST;
  }
private JTextComponent component;
private Document document; 
private Show show;
private boolean showPromptOnce;
private int focusLost;

public TextPrompt(String text, JTextComponent component)
{
	this(text, component, Show.ALWAYS);
}

public TextPrompt(String text, JTextComponent component, Show show)
{
	this.component = component;
	setShow( show );
	document = component.getDocument();

	setText( text );
	setFont( component.getFont() );
	setForeground( component.getForeground() );
	setBorder( new EmptyBorder(component.getInsets()) );
	setHorizontalAlignment(JLabel.LEADING);

	component.addFocusListener( this );
	document.addDocumentListener( this );

	component.setLayout( new BorderLayout() );
	component.add( this );
	checkForPrompt();
}
/**
 *  Convenience method to change the alpha value of the current foreground
 *  Color to the specifice value.
 *
 *  @param alpha value in the range of 0 - 1.0.
 */
public void changeAlpha(float alpha)
{
	changeAlpha( (int)(alpha * 255) );
}
/**
 *  Convenience method to change the alpha value of the current foreground
 *  Color to the specifice value.
 *
 *  @param alpha value in the range of 0 - 255.
 */
public void changeAlpha(int alpha)
{
	alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;

	Color foreground = getForeground();
	int red = foreground.getRed();
	int green = foreground.getGreen();
	int blue = foreground.getBlue();

	Color withAlpha = new Color(red, green, blue, alpha);
	super.setForeground( withAlpha );
}
/**
 *  Convenience method to change the style of the current Font. The style
 *  values are found in the Font class. Common values might be:
 *  Font.BOLD, Font.ITALIC and Font.BOLD + Font.ITALIC.
 *
 *  @param style value representing the the new style of the Font.
 */
public void changeStyle(int style)
{
	setFont( getFont().deriveFont( style ) );
}
/**
 *  Get the Show property
 *
 *  @return the Show property.
 */
public Show getShow()
{
	return show;
}
/**
 *  Set the prompt Show property to control when the prompt is shown.
 *  Valid values are:
 *
 *  Show.AWLAYS (default) - always show the prompt
 *  Show.Focus_GAINED - show the prompt when the component gains focus
 *      (and hide the prompt when focus is lost)
 *  Show.Focus_LOST - show the prompt when the component loses focus
 *      (and hide the prompt when focus is gained)
 *
 *  @param show a valid Show enum
 */
public void setShow(Show show)
{
	this.show = show;
}
/**
 *  Get the showPromptOnce property
 *
 *  @return the showPromptOnce property.
 */
public boolean getShowPromptOnce()
{
	return showPromptOnce;
}
/**
 *  Show the prompt once. Once the component has gained/lost focus
 *  once, the prompt will not be shown again.
 *
 *  @param showPromptOnce  when true the prompt will only be shown once,
 *                         otherwise it will be shown repeatedly.
 */
public void setShowPromptOnce(boolean showPromptOnce)
{
	this.showPromptOnce = showPromptOnce;
}
/**
 *	Check whether the prompt should be visible or not. The visibility
 *  will change on updates to the Document and on focus changes.
 */
private void checkForPrompt()
{
	//  Text has been entered, remove the prompt

	if (document.getLength() > 0)
	{
		setVisible( false );
		return;
	}

	//  Prompt has already been shown once, remove it

	if (showPromptOnce && focusLost > 0)
	{
		setVisible(false);
		return;
	}

	//  Check the Show property and component focus to determine if the
	//  prompt should be displayed.

    if (component.hasFocus())
    {
    	if (show == Show.ALWAYS
    	||  show ==	Show.FOCUS_GAINED)
    		setVisible( true );
    	else
    		setVisible( false );
    }
    else
    {
    	if (show == Show.ALWAYS
    	||  show ==	Show.FOCUS_LOST)
    		setVisible( true );
    	else
    		setVisible( false );
    }
}
//Implement FocusListener
public void focusGained(FocusEvent e)
{
	checkForPrompt();
}
public void focusLost(FocusEvent e)
{
	focusLost++;
	checkForPrompt();
}
//Implement DocumentListener

public void insertUpdate(DocumentEvent e)
{
	checkForPrompt();
}

public void removeUpdate(DocumentEvent e)
{
	checkForPrompt();
}

public void changedUpdate(DocumentEvent e) {}
}

class HotelSearch 
{
	
	public static void main(String args[]) throws IOException
	{
		HotelSearch hotel =new HotelSearch();
		hotel.gui();
	}
	
	public void gui() throws IOException
	{
		JFrame frame=new JFrame("Brivago");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		frame.setLayout(null);
		
		Font font =new Font("serif",Font.BOLD,18);   //Initialize Font of all the text
		
		//Making Labels and setting font for all the required fields
		JLabel locationLabel=new JLabel("Location");
		locationLabel.setBounds(400,140,300,150);
		locationLabel.setFont(font);
		frame.add(locationLabel);
		
		JLabel checkInDateLabel=new JLabel("Check-In Date");
		checkInDateLabel.setBounds(400,200,300,150);
		checkInDateLabel.setFont(font);
		frame.add(checkInDateLabel);

		JLabel checkOutDateLabel=new JLabel("Check-Out Date");
		checkOutDateLabel.setBounds(400,260,300,150);
		checkOutDateLabel.setFont(font);
		frame.add(checkOutDateLabel);

		JLabel singleRoomLabel=new JLabel("Number of Single Rooms");
		singleRoomLabel.setBounds(400,320,300,150);
		singleRoomLabel.setFont(font);
		frame.add(singleRoomLabel);
		
		JLabel doubleRoomLabel=new JLabel("Number of Double Rooms");
		doubleRoomLabel.setBounds(400,380,300,150);
		doubleRoomLabel.setFont(font);
		frame.add(doubleRoomLabel);
		
		JLabel guestLabel=new JLabel("Number of Guests");
		guestLabel.setBounds(400,440,300,150);
		guestLabel.setFont(font);
		frame.add(guestLabel);
		
		//A button for searching Hotels
		JButton hotelSearch =new JButton("Search Hotels");
		hotelSearch.setBounds(600,620,120,50);
		frame.add(hotelSearch);
		
		//Text fields for their respective Labels
		JTextField location=new JTextField(25);
		location.setBounds(630,205,150,25);		
		TextPrompt tp1=new TextPrompt("eg. Jaipur",location);
		tp1.setForeground(Color.GRAY);
		frame.add(location);
		
		JTextField checkInDate=new JTextField(25);
		checkInDate.setBounds(630,265,150,25);
		TextPrompt tp2=new TextPrompt("DD/MM/YYYY",checkInDate);
		tp2.setForeground(Color.GRAY);
		frame.add(checkInDate);
		
		JTextField checkOutDate=new JTextField(25);
		checkOutDate.setBounds(630,325,150,25);
		TextPrompt tp3=new TextPrompt("DD/MM/YYYY",checkOutDate);
		tp3.setForeground(Color.GRAY);
		frame.add(checkOutDate);
		
		JTextField singleRoom=new JTextField(25);
		singleRoom.setBounds(630,385,150,25);
		frame.add(singleRoom);
		
		JTextField doubleRoom=new JTextField(25);
		doubleRoom.setBounds(630,445,150,25);
		frame.add(doubleRoom);
		
		JTextField guests=new JTextField(25);
		guests.setBounds(630,505,150,25);
		frame.add(guests);
		
		//Adding default images and icons to the Template
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

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.addActionListener(new BookingListener());
		mybook.setBounds(1285,10, 108, 30);
		frame.getContentPane().add(mybook);
		
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
	      
	      hotelSearch.addActionListener(new ActionListener(){
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
