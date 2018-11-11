import java.awt.*;
import java.awt.event.*;
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
	HotelSearch()
	{
		JFrame jf=new JFrame("Brivago");
		jf.setSize(1920,1080);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setContentPane(new JLabel(new ImageIcon("beach.jpg")));
		jf.setLayout(null);
		
		Font font =new Font("serif",Font.BOLD,18);   //Initialize Font of all the text
		
		//Making Labels and setting font for all the required fields
		JLabel jl1=new JLabel("Location");
		jl1.setBounds(400,140,300,150);
		jl1.setFont(font);
		jf.add(jl1);
		
		JLabel jl2=new JLabel("Check-In Date");
		jl2.setBounds(400,220,300,150);
		jl2.setFont(font);
		jf.add(jl2);

		JLabel jl3=new JLabel("Check-Out Date");
		jl3.setBounds(400,300,300,150);
		jl3.setFont(font);
		jf.add(jl3);

		JLabel jl4=new JLabel("Number of Rooms");
		jl4.setBounds(400,380,300,150);
		jl4.setFont(font);
		jf.add(jl4);

		JLabel jl5=new JLabel("Number of Guests");
		jl5.setBounds(400,460,300,150);
		jl5.setFont(font);
		jf.add(jl5);
		
		//A button for searching Hotels
		JButton jb=new JButton("Search Hotels");
		jb.setBounds(600,620,120,50);
		jf.add(jb);
		
		//Text fields for their respective Labels
		JTextField jtf1=new JTextField(25);
		jtf1.setBounds(600,205,150,25);		
		TextPrompt tp1=new TextPrompt("eg. Jaipur",jtf1);
		tp1.setForeground(Color.GRAY);
		jf.add(jtf1);
		
		JTextField jtf2=new JTextField(25);
		jtf2.setBounds(600,285,150,25);
		TextPrompt tp2=new TextPrompt("DD/MM/YYYY",jtf2);
		tp2.setForeground(Color.GRAY);
		jf.add(jtf2);
		
		JTextField jtf3=new JTextField(25);
		jtf3.setBounds(600,365,150,25);
		TextPrompt tp3=new TextPrompt("DD/MM/YYYY",jtf3);
		tp3.setForeground(Color.GRAY);
		jf.add(jtf3);
		
		JTextField jtf4=new JTextField(25);
		jtf4.setBounds(600,445,150,25);
		jf.add(jtf4);
		
		JTextField jtf5=new JTextField(25);
		jtf5.setBounds(600,525,150,25);
		jf.add(jtf5);
		
		//Adding default images and icons to the Template
		ImageIcon brivagoicon = new ImageIcon("brivagoicon.jpg");
		jf.setIconImage(brivagoicon.getImage());
		
		JButton profile = new JButton("Profile");//profile button setup
		profile.setBounds(1405,10,77,30);
		jf.getContentPane().add(profile);

		JButton logout = new JButton();//logout button setup
		logout.setBounds(1495, 10, 30,30);
		jf.getContentPane().add(logout);
		ImageIcon image = new ImageIcon("power.jpg");
		logout.setIcon(image);

		JButton mybook = new JButton("My Bookings");//mybooking button setup
		mybook.setBounds(1285,10, 108, 30);
		jf.getContentPane().add(mybook);
		
		jf.revalidate();
		jf.repaint();	
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {public void run() {new HotelSearch();}});	
	}
}
